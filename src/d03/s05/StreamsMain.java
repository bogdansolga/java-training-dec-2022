package d03.s05;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StreamsMain {

    public static void main(String[] args) {
        //readingFromAFile();

        //writingToAFile();

        readingFromTheKeyboard();
    }

    private static void readingFromAFile() {
        try (FileReader fr = new FileReader("example.properties");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println(ex.getMessage());
        }
    }

    private static void writingToAFile() {
        try (FileWriter fileWriter = new FileWriter("another-example.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("First line");
            bufferedWriter.write(System.lineSeparator());
            bufferedWriter.write("Second line");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println(ex.getMessage());
        }

        System.out.println("The file was successfully written");
    }

    private static void writingToAFileWithoutTryWithResources() {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("another-example.txt");
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("First line");
            bufferedWriter.write(System.lineSeparator());
            bufferedWriter.write("Second line");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("The file was successfully written");
    }

    private static void readingFromTheKeyboard() {
        //usingAScannerObject();

        //usingAConsoleObject();

        usingABufferedReaderObject();
    }

    private static void usingAScannerObject() {
        Scanner scanner = new Scanner(System.in);
        final String readLine = scanner.nextLine();
        System.out.println("Got the line '" + readLine + "'");
    }

    private static void usingAConsoleObject() {
        Console console = System.console();
        if (console == null) {
            System.err.println("The console is not available");
            return;
        }

        final String readLine = console.readLine();
        System.out.println("Got the line '" + readLine + "'");
    }

    private static void usingABufferedReaderObject() {
        // the older input stream reading
        System.out.println("Please enter the text: ");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            final String readLine = bufferedReader.readLine();
            System.out.println("Got the line '" + readLine + "'");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
