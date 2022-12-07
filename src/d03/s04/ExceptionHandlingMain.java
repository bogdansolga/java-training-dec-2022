package d03.s04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionHandlingMain {

    public static void main(String[] args) {
        //checkedExceptions();

        //uncheckedExceptions();

        //errors();

        tryWithResources();
    }

    private static void tryWithResources() {
        try (FileReader fr = new FileReader("example.properties");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void checkedExceptions() throws ParseException, RuntimeException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        parseDate(dateFormat);
    }

    private static void parseDate(DateFormat dateFormat) {
        try {
            Date date = dateFormat.parse("xxxx-12-07");
            System.out.println("The parsed date is " + date);
        } catch (ParseException e) { // exception type changing
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        } finally {
            //System.out.println("The text from finally");
        }
    }

    private static void uncheckedExceptions() {
        String aPotentiallyNullString = System.currentTimeMillis() %2 == 0 ? "something" : null;
        try {
            System.out.println("The length is " + aPotentiallyNullString.length());
        } catch (NullPointerException npe) {
            System.err.println("The string was null");
            npe.printStackTrace();
        }

        System.out.println("The statement after the try-catch");
    }

    private static void errors() { //DON'T DO THIS
        OutOfMemoryError oom = new OutOfMemoryError();
    }
}
