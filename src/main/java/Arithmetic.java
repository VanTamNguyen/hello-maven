public class Arithmetic {

    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divide by zero");
        return a / b;
    }
}
