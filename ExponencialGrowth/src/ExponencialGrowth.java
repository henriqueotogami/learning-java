import java.util.Scanner;

public class ExponencialGrowth {

    public static void main(String[] args) {

        // y = a * (1 + r) ^ x
        // a = initial value
        // r = growth rate
        // x = time interval

        System.out.println("Let's calculate subscribers!");
        System.out.println("This is program uses y = a * (1 + r) ^ x");

        System.out.println("Enter initial value (a): ");

        Scanner inputScanner = new Scanner(System.in);
        int a = inputScanner.nextInt();

        System.out.println("Enter growth rate (r): ");
        double r = inputScanner.nextDouble();

        System.out.println("Enter time interval in days(x): ");
        int x = inputScanner.nextInt();

        System.out.println(calculateSubs(a,r,x));
    }

    public static int calculateSubs(int a, double r, int x) {
        return (int) (a * Math.pow((1 + r), x));
    }
}
