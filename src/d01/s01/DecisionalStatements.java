package d01.s01;

public class DecisionalStatements {

    public static void main(String[] args) {
        boolean todayIsMonday = true;
        if (todayIsMonday) {
            System.out.println("Today is Monday");
            return;
        } else {
            System.out.println("Today is another day than Monday");
        }

        String weekDay = "Monday";
        switch (weekDay) {
            case "Monday":
                System.out.println("Enjoy your week!");
                break;

            case "Friday":
                System.out.println("The weekend is coming!");
                break;

            default:
                System.out.println("Waiting for the weekend...");
        }
    }
}
