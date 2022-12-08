package d04.s03;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class ForkJoinPoolMain {

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool(); // an always existing (fork-join) thread pool
        System.out.println("The pool size is " + forkJoinPool.getParallelism());

        final Integer result = forkJoinPool.invoke(new TaskExample());
        System.out.println("Got the result " + result);
    }

    private static class TaskExample extends ForkJoinTask<Integer> {
        @Override
        public Integer getRawResult() {
            return new Random().nextInt(1000);
        }

        @Override
        protected void setRawResult(Integer value) {
        }

        @Override
        protected boolean exec() {
            return true;
        }
    }
}
