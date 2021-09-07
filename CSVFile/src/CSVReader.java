import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) throws IOException {

        String filePath = "/Users/henriquematheusalvespereira/Downloads/SacramentocrimeJanuary2006.csv";
        String line = "";
        int quantityCrimes = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

            while ((line = bufferedReader.readLine()) != null) {
                String[] crimeValues = line.split(",");
                System.out.println("Date | Time: " + crimeValues[0] + " | Crime event: " + crimeValues[5]);
                quantityCrimes += 1;
            }
            System.out.println("\namount of crimes registered in 2006: " + quantityCrimes);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
