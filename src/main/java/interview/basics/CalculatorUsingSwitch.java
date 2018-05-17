package main.java.interview.basics;

public class CalculatorUsingSwitch {

    public static void main(String[] args) {
        double result = calculate(1.5, 2.5, '+');
        System.out.println("The result of 1.5 + 2.5 =  " + result);

        result = calculate(1.5, 2.5, '*');
        System.out.println("The result of 1.5 * 2.5 =  " + result);
    }

    private static double calculate(double x, double y, char z) {

        double result;
        switch (z) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
            default:
                result = 0;
        }
        return result;
    }
}
