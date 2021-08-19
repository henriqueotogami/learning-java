public class FactorialWithRecursion {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int number) {

        if (number == 1) {

            System.out.println("factorial(" + number + ") = 1");
            return 1;
        } else {

            System.out.println("factorial(" + number + ") = " + number + " * factorial(" + (number - 1) + ")");
            return number * factorial(number - 1);
        }
    }
}




