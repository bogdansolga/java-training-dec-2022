package d02.s03;

public enum WeekDay {
    MONDAY(1) {
        @Override
        public void process() {
            System.out.println("Processing for Monday");
        }
    },
    TUESDAY(2) {
        @Override
        public void process() {
            System.out.println("Processing for TUESDAY");
        }
    },
    FRIDAY(5) {
        @Override
        public void process() {
            System.out.println("Processing for FRIDAY");
        }
    }; // and so on

    public abstract void process();

    private final int dayNumber;

    WeekDay(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return dayNumber;
    }
}
