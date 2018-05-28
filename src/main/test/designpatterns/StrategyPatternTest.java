package main.test.designpatterns;


import main.java.interview.designpatterns.Logging;
import main.java.interview.designpatterns.StrategyPattern;
import org.junit.Test;

public class StrategyPatternTest {

    @Test
    public void testStrategyPattern() {
        Logging logger = new StrategyPattern.ConsoleLogging();
        StrategyPattern x = new StrategyPattern(logger);
        x.writeToLog("Console example");

        Logging logger2 = new StrategyPattern.FileLogging();
        StrategyPattern x2 = new StrategyPattern(logger2);
        x2.writeToLog("File example");
    }
}
