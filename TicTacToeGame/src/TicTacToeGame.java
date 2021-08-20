import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

    static ArrayList<Integer> positionsPlayer = new ArrayList<Integer>();
    static ArrayList<Integer> positionsCPU = new ArrayList<Integer>();

    public static void main (String[] args) {

        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
        };

        printGameBoard(gameBoard);
        System.out.println("Enter your placement (1 to 9): ");

        while(true) {
            Scanner keyboardScanner = new Scanner(System.in);
            int positionPlayer = keyboardScanner.nextInt();

            while(positionsPlayer.contains(positionPlayer) || positionsCPU.contains(positionPlayer)){
                System.out.println("Position taken! Enter a correct position.");
                positionPlayer = keyboardScanner.nextInt();
            }

            placePiece(gameBoard, positionPlayer, "player");

            String battleResult = checkWinner();
            if (battleResult.length() > 0) {
                System.out.println(battleResult);
                break;
            }

            Random randomPositionCPU = new Random();
            int positionCPU = randomPositionCPU.nextInt(9) + 1;

            while(positionsPlayer.contains(positionCPU) || positionsCPU.contains(positionCPU)){
                positionCPU = randomPositionCPU.nextInt(9) + 1;
            }

            placePiece(gameBoard, positionCPU, "CPU");
            printGameBoard(gameBoard);

            battleResult = checkWinner();

            if (battleResult.length() > 0) {
                System.out.println(battleResult);
                break;
            }
        }
    }

    public static void printGameBoard(char[][] gameBoard) {
        System.out.println("---------------------------");
        for (char[] row : gameBoard) {

            for (char character : row) {
                System.out.print(character);
            }

            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public static void placePiece(char[][] gameBoard, int gamePosition, String user) {

        char gameMovement = ' ';

        if (user.equals("player")) {
            gameMovement = 'X';
            positionsPlayer.add(gamePosition);
        } else if (user.equals("CPU")) {
            gameMovement = 'O';
            positionsCPU.add(gamePosition);
        }

        switch(gamePosition) {
            case 1:
                gameBoard[0][0] = gameMovement;
                break;
            case 2:
                gameBoard[0][2] = gameMovement;
                break;
            case 3:
                gameBoard[0][4] = gameMovement;
                break;
            case 4:
                gameBoard[2][0] = gameMovement;
                break;
            case 5:
                gameBoard[2][2] = gameMovement;
                break;
            case 6:
                gameBoard[2][4] = gameMovement;
                break;
            case 7:
                gameBoard[4][0] = gameMovement;
                break;
            case 8:
                gameBoard[4][2] = gameMovement;
                break;
            case 9:
                gameBoard[4][4] = gameMovement;
                break;
            default:
                break;
        }
    }

    public static String checkWinner() {

        List topRow         = Arrays.asList(1, 2, 3);
        List middleRow      = Arrays.asList(4, 5, 6);
        List bottomRow      = Arrays.asList(7, 8, 9);

        List leftColumn     = Arrays.asList(1, 4, 7);
        List middleColumn   = Arrays.asList(2, 6, 8);
        List rightColumn   = Arrays.asList(3, 5, 9);

        List crossOne       = Arrays.asList(1, 5, 9);
        List crossTwo        = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<>();
        winning.add(topRow);
        winning.add(middleRow);
        winning.add(bottomRow);
        winning.add(leftColumn);
        winning.add(middleColumn);
        winning.add(rightColumn);
        winning.add(crossOne);
        winning.add(crossTwo);

        for(List victoryTypes : winning) {

            if(positionsPlayer.containsAll(victoryTypes)) {
                return "Congratulations you won!";
            } else if (positionsCPU.containsAll(victoryTypes)) {
                return "CPU wins! Sorry :(";
            } else if ((positionsPlayer.size() + positionsCPU.size()) == 9) {
                return "CAT!";
            }
        }

        return "";
    }
}
