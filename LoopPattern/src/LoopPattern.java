import java.util.Scanner;
// Tutorial by Alex Lee no Youtube https://youtu.be/3gzvVPD3n0w
public class LoopPattern {

    public static void main(String[] args) {
        System.out.println("Obi-Wan Kenobi says: Hello there! How many stars would you like?");
        Scanner scanKeyboard = new Scanner (System.in);
        int numberOfStars = scanKeyboard.nextInt();

        for(int indexIncreasingLineStar = 1; indexIncreasingLineStar <= numberOfStars; indexIncreasingLineStar++){

            for(int indexIncreasingRowStar = 0; indexIncreasingRowStar < indexIncreasingLineStar; indexIncreasingRowStar++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int indexDecreasingLineStar = (numberOfStars - 1); indexDecreasingLineStar > 0; indexDecreasingLineStar--){

            for(int indexDecreasingRowStar = 0; indexDecreasingRowStar < indexDecreasingLineStar; indexDecreasingRowStar++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
