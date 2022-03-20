public class Fabonacci {
    public static int fibonacci(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number == 2 ? 1 : fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("fibonacci(5) = " + fibonacci(5));
    }
}
