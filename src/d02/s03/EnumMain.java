package d02.s03;

public class EnumMain {

    public static void main(String[] args) {
        WeekDay weekDay = WeekDay.MONDAY;
        System.out.println("The day number for Monday is " + weekDay.getDayNumber());

        WeekDay[] weekDays = WeekDay.values();
        for (WeekDay day : weekDays) {
            System.out.println(day + ", " + day.getDayNumber());
        }

        WeekDay byValue = WeekDay.valueOf("MONDAY");
        System.out.println("The obtained entry is " + byValue);

        weekPlans();

        if (weekDay.ordinal() > byValue.ordinal()) {
            System.out.println("Do something...");
        }

        byValue.process();
    }

    private static void weekPlans() {
        WeekDay today = getTodaysWeekDay();
        switch (today) {
            case MONDAY:
                System.out.println("Planning the week");
                break;
            case FRIDAY:
                System.out.println("Planning for the weekend!");
                break;
        }
    }

    private static WeekDay getTodaysWeekDay() {
        return WeekDay.TUESDAY;
    }
}
