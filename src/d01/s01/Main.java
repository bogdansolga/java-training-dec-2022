package d01.s01;

// - a comment
// class - the main code structuring unit from Java
public class Main { // d01.s01.Main = the class name; the file name must be the same as the class name

    // main = a method
    // methods = the main code execution steps structuring --> structuring each execution step
    // each method can invoke (/call) any number of other methods
    // the execution of every Java program starts from the 'main' method
    // 'main' = the method name
    // 'String[] args' = the method arguments / parameters
    public static void main(String[] args) { //String = a sequence of characters; [] = an array of items
        System.out.println("Hello world!"); // a statement: method execution, variable creation
        // every Java program will be executed in a top-down mode --> each statement will be executed after the previous one

        // every Java method can be executed using parameters --> making the method execution dynamic
        sumOfTwoNumbers(4, 5);
        sumOfTwoNumbers(10, 20);

        int result = methodWithAReturnValue();
        System.out.println(result);
    }

    private static int methodWithAReturnValue() {
        // methods with a returned value must end with a 'return' statement
        return 23;
    }

    private static void sumOfTwoNumbers(int first, int second) {
        int sum = first + second; // sum = a variable, a memory location used to store a temporary value
        System.out.println(sum);
    }
}