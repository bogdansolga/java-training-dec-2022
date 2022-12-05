package d01.s01;

public class VariableScopes {

    private static int classWeekDay;

    public static void main(String[] args) {
        // the scope (or visibility) of 'weekDay' - just in the 'main' method
        int weekDay = 1;

        // the scope (or visibility) of the 'classWeekDay' variable is 'per class' --> accessible to all the methods from that class
        classWeekDay = 20;

        anotherMethod();
    }

    private static void anotherMethod() {
        //System.out.println(weekDay); // cannot access the 'weekDay' variable because it is visible just in the 'main' method
        System.out.println(classWeekDay); // the
    }
}
