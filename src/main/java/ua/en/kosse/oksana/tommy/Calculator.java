package ua.en.kosse.oksana.tommy;

public class Calculator {

    public static double calc(double num1, double num2, char operation) {
        double result;

        switch (operation) {
            case '+' -> result = Summacalc.oper(num1, num2);
            case '-' -> result = Minuscalc.oper(num1, num2);
            case '*' -> result = Multiplicalc.oper(num1, num2);
            case '/' -> result = Divisioncalc.oper(num1, num2);
            default -> {
                throw new IllegalArgumentException("Operation not recognized. Repeat the input.");

            }
        }
        System.out.println("The result of operations is = " + result);
        return result;
    }


}
