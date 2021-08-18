import java.util.ArrayList;

public class PrimeNumbers {

    public static void main(String[] args) { System.out.println(findPrimes(1, 100)); }

    public static ArrayList<Integer> findPrimes(int startNumber, int endNumber) {

        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int number = startNumber; number < endNumber; number++) {

            boolean numberPrime = true;
            int numberPair = 2;
            float division = (float) (number / 2);
            int numberLeftOver = (number % numberPair);

            while (division >= numberPair) {
                if ( numberLeftOver == 0) {
                    numberPrime = false;
                    break;
                }

                numberPair++;
            }

            if (numberPrime) {
                primes.add(number);
            }
        }
        return primes;
    }
}
