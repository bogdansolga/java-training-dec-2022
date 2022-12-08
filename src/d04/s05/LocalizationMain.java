package d04.s05;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationMain {

    static Locale english = new Locale("en", "US");
    static Locale french = new Locale("fr", "FR");
    static Locale romanian = new Locale("ro", "RO");

    public static void main(String[] args) {
        // Extract method = Ctrl + Alt + M
        //localization();

        dateAndTimeFormatting();
    }

    private static void localization() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", english);
        System.out.println("The greeting in " + resourceBundle.getLocale().getDisplayName() + " is '" +
                resourceBundle.getString("greeting") + "'");
    }

    private static void dateAndTimeFormatting() {
        Locale usedLocale = french;

        DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.FULL, usedLocale);
        System.out.println(dateInstance.format(new Date()));

        DateFormat timeInstance = DateFormat.getTimeInstance(DateFormat.FULL, usedLocale);
        System.out.println(timeInstance.format(new Date()));
    }
}
