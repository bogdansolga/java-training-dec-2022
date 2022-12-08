package d04.s03;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class AsyncProcessingMainImproved {

    private static final int CORES_NUMBER = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        // 1. create the thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(CORES_NUMBER);
        // 2. create the ExecutorCompletionService that wraps (/ uses) the thread pool
        ExecutorCompletionService<Map<Integer, Integer>> executorCompletionService = new ExecutorCompletionService<>(executorService);

        // 3. submit tasks to the ExecutorCompletionService object --> they will be processed in parallel
        List<Integer> depositsIds = Arrays.asList(71, 92, 23, 95, 74, 62, 77, 45, 52, 73);
        long now = System.currentTimeMillis();

        System.out.println("Processing the stocks from " + depositsIds.size() + " deposits...");
        for (Integer depositsId : depositsIds) {
            // forking phase
            executorCompletionService.submit(new StockProcessor(depositsId));
        }

        // 4. poll the ExecutorCompletionService for the async processing results
        Map<Integer, Integer> stocks = new TreeMap<>();
        try {
            for (int i = 0; i < depositsIds.size(); i++) {
                final Future<Map<Integer, Integer>> futureResult = executorCompletionService.poll(2000, TimeUnit.MILLISECONDS);
                if (futureResult.isDone()) {
                    stocks.putAll(futureResult.get()); // join (/ gather the results)
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        long duration = System.currentTimeMillis() - now;
        System.out.println("The whole processing took " + duration + " millis");

        System.out.println("Got the following stocks: ");
        for (Map.Entry<Integer, Integer> entry : stocks.entrySet()) {
            System.out.println("\tDeposit ID: " + entry.getKey() + ", stock: " + entry.getValue());
        }

        executorService.shutdown();
        System.out.println("Writing the stocks IDs in the Excel file...");
    }

    // task used to get the products stock number from a deposit (/ warehouse)
    private static class StockProcessor implements Callable<Map<Integer, Integer>> {

        private final int depositId;

        public StockProcessor(int depositId) {
            this.depositId = depositId;
        }

        @Override
        public Map<Integer, Integer> call() throws Exception {
            Thread.sleep(new Random().nextInt(2000)); // simulate some processing
            //return depositId * new Random().nextInt(500); // return a random number
            //System.out.println("Running on the thread " + Thread.currentThread().getName());

            int numberOfItems = depositId * new Random().nextInt(500);
            return Map.of(depositId, numberOfItems);
        }
    }
}
