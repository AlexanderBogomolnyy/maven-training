package app;

public class Mathematics {

    public int add(int a, int b) {
        return a + b;
    }

    public int abs(int value) {
        if (value < 0) return -value;
        return value;
    }

    public int div(int dividend, int divider) {
        if (divider == 0)
            throw  new ArithmeticException("Division by zero!");
        return dividend/divider;
    }

}
