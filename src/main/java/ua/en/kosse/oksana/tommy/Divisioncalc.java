package ua.en.kosse.oksana.tommy;

public abstract class Divisioncalc {

    public static double oper(double valA, double valB) {
        if (valB == 0) {
            throw new ArithmeticException ("Division by zero!!!");
        }
        return valA / valB;
    }
}
