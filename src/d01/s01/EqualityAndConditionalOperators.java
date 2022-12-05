package d01.s01;

public class EqualityAndConditionalOperators {

    public static void main(String[] args) {
        int first = 23;
        int second = 27;
        boolean areEqual = first == second; // false
        boolean isGreaterThan = first > second; // false

        boolean isEqualOrGreaterThan = areEqual || isGreaterThan;
    }

    public static void mainWithMultipleStatementsOnOneLine(String[] args) {
        int first = 23; int second = 27;
        boolean areEqual = first == second; boolean isGreaterThan = first > second;

        boolean isEqualOrGreaterThan = areEqual || isGreaterThan;
    }
}
