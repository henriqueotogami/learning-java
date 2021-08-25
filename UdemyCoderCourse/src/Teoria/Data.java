package Teoria;

public class Data {

    int day;
    int month;
    int year;

      String dateFormatter(){
          return String.format("%d/%d/%d\n", day, month, year);
    }

}
