package calculator;

public class Main {
    public static final int WRONG_VALUE = Integer.MIN_VALUE;

    public static void main( String[] args ) {
        Calculator calculator = new Calculator();
        if (args.length < 2) {
            System.out.println("Not enough arguments.");
            return;
        }
        int a = parseInt(args[0]);
        int b = parseInt(args[1]);
        if(a != WRONG_VALUE && b != WRONG_VALUE)
            System.out.println(a + " + " + b + " = " + calculator.add(a, b));
        else
            System.out.println("Wrong input values.");
    }

    private static int parseInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong format number.");
            System.out.println(value);
            return WRONG_VALUE;
        }
    }

}
