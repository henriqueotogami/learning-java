import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        Random randomNumbers = new Random();
        int numberChosen = (randomNumbers.nextInt(6) + 1);

        System.out.println("Number randomly chosen: " + numberChosen);
    }

    public RandomNumbers() {
    }
}
