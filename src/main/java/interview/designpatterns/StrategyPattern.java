package main.java.interview.designpatterns;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StrategyPattern {

    public static class ConsoleLogging implements Logging {
        @Override
        public void write(String message) {
            System.out.println("Message in console");
        }
    }

    public static class FileLogging implements Logging {
        @Override
        public void write(String message) {
            try {
                final FileWriter fos = new FileWriter(new File("a.txt"));
                fos.write(message);
                fos.close();
            } catch (IOException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }

    private Logging pattern;

    public StrategyPattern(Logging pattern) {
        this.pattern = pattern;
    }

    public void writeToLog(String message) {
        pattern.write(message);

    }
}