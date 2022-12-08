package d04.s03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class AsyncProcessingMain {

    private static final int CORES_NUMBER = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        // 1. create the thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(CORES_NUMBER);
        // 2. create the ExecutorCompletionService that wraps (/ uses) the thread pool
        ExecutorCompletionService<Integer> executorCompletionService = new ExecutorCompletionService<>(executorService);

        // 3. submit tasks to the ExecutorCompletionService object --> they will be processed in parallel
        List<Integer> depositsIds = Arrays.asList(7, 92, 623, 95, 74, 62, 77, 45, 52);
        long now = System.currentTimeMillis();

        System.out.println("Processing the stocks from " + depositsIds.size() + " deposits...");
        for (Integer depositsId : depositsIds) {
            // forking phase
            executorCompletionService.submit(new StockProcessor(depositsId));
        }

        // 4. poll the ExecutorCompletionService for the async processing results
        List<Integer> stocks = new ArrayList<>();
        try {
            for (int i = 0; i < depositsIds.size(); i++) {
                final Future<Integer> futureResult = executorCompletionService.poll(2000, TimeUnit.MILLISECONDS);
                if (futureResult.isDone()) {
                    final Integer stockFromDeposit = futureResult.get();
                    stocks.add(stockFromDeposit); // join (/ gather the results)
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        long duration = System.currentTimeMillis() - now;
        System.out.println("The whole processing took " + duration + " millis");

        System.out.println("Got the following stocks: " + stocks);
        executorService.shutdown();
    }

    // task used to get the products stock number from a deposit (/ warehouse)
    private static class StockProcessor implements Callable<Integer> {

        private final int depositId;

        public StockProcessor(int depositId) {
            this.depositId = depositId;
        }

        @Override
        public Integer call() throws Exception {
            Thread.sleep(new Random().nextInt(2000)); // simulate some processing
            return depositId * new Random().nextInt(500); // return a random number
        }
    }
}
