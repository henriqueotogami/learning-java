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

        Data dateThree = new Data();
        Data dateFour = new Data(28,5,2001);


        System.out.printf(dateOne.dateFormatter());
        System.out.println();
        System.out.printf(dateTwo.dateFormatter());
        System.out.println();
/*      Saída:
        25/8/2021
        31/12/2019
*/
        System.out.println(dateThree.dateFormatter());
        System.out.println();
        System.out.println(dateFour.dateFormatter());
        System.out.println();

        // 1/1/1972
        // 28/5/2001
    }
}
