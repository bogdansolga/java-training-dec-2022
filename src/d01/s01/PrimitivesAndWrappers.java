package d01.s01;

public class PrimitivesAndWrappers {

    // args = parameters --> specified in the method definition
    public static void main(String[] args) {
        // using initialized values
        int weekDay = 1;            // weekDay = a variable;
        Integer dayOfTheWeek = 1;   // dayOfTheWeek = another variable
        System.out.println(weekDay + " / " + dayOfTheWeek);
        // variables are used to hold _temporary_ values (in a method)

        int notInitInt = 0;
        Integer notInitInteger = null;
        System.out.println(notInitInt + " / " + notInitInteger);

        // Q: when to use primitives and when to use their wrapper classes?
        // A: use primitives for simple operations: arithmetic operations, true/false evaluations, ...
        // use classes for more elaborate / complex operations
        int value = 23;
        Integer wrappedValue = value;
        System.out.println(wrappedValue.shortValue());
    }
}
