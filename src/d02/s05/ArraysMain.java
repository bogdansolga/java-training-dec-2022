package d02.s05;

public class ArraysMain {

    public static void main(String[] args) {
        int[] initialized = {7, 6, 7, 9, 10};
        displayValues(initialized);

        Integer[] notInitialized = new Integer[5];
        notInitialized[notInitialized.length - 1] = 27;
        displayValues(notInitialized);
    }

    private static void displayValues(Integer[] notInitialized) {
        for (Integer value : notInitialized) {
            System.out.println(value);
        }
    }

    private static void displayValues(int[] initialized) {
        for (int value : initialized) {
            System.out.println(value);
        }
    }
}
