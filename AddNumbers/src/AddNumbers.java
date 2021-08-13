import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {
        Scanner scanKeyboard = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanKeyboard.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = scanKeyboard.nextInt();

        System.out.println("The result of the sum: " + (firstNumber + secondNumber));
    }
}
