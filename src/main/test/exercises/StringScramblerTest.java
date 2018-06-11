package main.test.exercises;

import static org.junit.Assert.*;

import main.java.exercises.StringScrambler;
import org.junit.Test;

public class StringScramblerTest {
    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        testing(StringScrambler.scramble("rkqodlw","world"), true);
        testing(StringScrambler.scramble("cedewaraaossoqqyt","codewars"),true);
        testing(StringScrambler.scramble("katas","steak"),false);
        testing(StringScrambler.scramble("scriptjavx","javascript"),false);
        testing(StringScrambler.scramble("scriptingjava","javascript"),true);
        testing(StringScrambler.scramble("scriptsjava","javascripts"),true);
        testing(StringScrambler.scramble("javscripts","javascript"),false);
        testing(StringScrambler.scramble("aabbcamaomsccdd","commas"),true);
        testing(StringScrambler.scramble("commas","commas"),true);
        testing(StringScrambler.scramble("sammoc","commas"),true);
    }
}
