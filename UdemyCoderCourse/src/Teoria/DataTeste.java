package Teoria;

public class DataTeste {

    public static void main(String[] args) {

        Data dateOne = new Data();
        dateOne.day = 25;
        dateOne.month = 8;
        dateOne.year = 2021;

        Data dateTwo = new Data();
        dateTwo.day = 31;
        dateTwo.month = 12;
        dateTwo.year = 2019;

        System.out.printf(dateOne.dateFormatter());
        System.out.printf(dateTwo.dateFormatter());

/*      Saída:
        25/8/2021
        31/12/2019
*/

    }
}
