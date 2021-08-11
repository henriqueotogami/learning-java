package main.java;

public class JavaLoops {

    static void exerciseOne(String[] args){
        // Print i as long as i is less than 6.
        for (int i = 1;i < 6; i++) {
            System.out.println(i);
            ;
        }
    }

    static void exerciseTwo (String[] args) {
        // Use the do/while loop to print i as long as i is less than 6.
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 6);
    }

    static void exerciseThree(String[] args) {
        // Use a for loop to print "Yes" 5 times:
        for (int i = 0; i < 5; i++) {
            System.out.println();
        }
    }

    static void exerciseFour(String[] args) {
        // Loop through the items in the cars array.
        String[] cars = {"Volvo", "BMW", "Ford"};
        for (String i : cars) {
            System.out.println(i);
        }
    }

    static void exerciseFive(String[] args) {
        // Stop the loop if i is 5.
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

    static void exerciseSix(String[] args) {
        // In the loop, when the value is "4", jump directly to the next value.
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}