class Arithmetic {
    public static void main(String[] args) {
        try {
            int x = 2 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }

        double y = 2.0 / 0;
        System.out.println("Floating-point division by zero: " + y);
    }
}
