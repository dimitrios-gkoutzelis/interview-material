package main.test.designpatterns;

import main.java.interview.designpatterns.SingletonPatternBasic;
import main.java.interview.designpatterns.SingletonPatternModern;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void testBasicSingleton() {
        SingletonPatternBasic basic = SingletonPatternBasic.getInstance();
        basic.setMessage("Basic message");
        basic.displayMessage();

        SingletonPatternModern modern = SingletonPatternModern.INSTANCE;
        modern.setValue(22);
        modern.displayValue();
    }
}
