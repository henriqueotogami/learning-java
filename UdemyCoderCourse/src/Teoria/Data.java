package Teoria;

public class Data {

    int day;
    int month;
    int year;

    // Criação dos métodos construtores - Início
    Data() {
        day     = 1;
        month   = 1;
        year    = 1970;
    }

    Data (int initialDate,int initialMonth, int initialYear) {
        day     = initialDate;
        month   = initialMonth;
        year    = initialYear;
    }


    // Criação dos métodos construtores - Fim

      String dateFormatter(){
          return String.format("%d/%d/%d", day, month, year);
    }

}
