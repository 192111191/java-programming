public class exception {
    public static void main(String[] args) {
        try {
            int a, b, c;
            a = 10;
            b = 0;
            c = a / b;
            if (b != 0) {
                System.out.println(c);
            } else {
                throw new ArithmeticException("division error");
            }
        } catch (ArithmeticException e) {
            System.out.println("division error a " + e.getMessage());
        } finally {
            System.out.println("this will be executed that is no matter what");
        }
    }
}

