package main.java;

public class JavaArrays {

    static void exerciseOne(String[] args) {
        // Create an array of type String called cars.
        String[] cars = new String[]{"Volvo", "BMW", "Ford"};
    }

    static void exerciseTwo(String[] args) {
        // Print the second item in the cars array.
        String[] cars = {"Volvo", "BMW", "Ford"};
        System.out.println(cars[1]);
    }

    static void exerciseThree(String[] args) {
        // Change the value from "Volvo" to "Opel", in the cars array.
        String[] cars = {"Volvo", "BMW", "Ford"};
        cars[0] = "Opel";
        System.out.println(cars[0]);
    }

    static void exerciseFour(String[] args) {
        // Find out how many elements the cars array have.
        String[] cars = {"Volvo", "BMW", "Ford"};
        System.out.println(cars.length);
    }

    static void exerciseFive(String[] args) {
        // Loop through the items in the cars array.
        String[] cars = {"Volvo", "BMW", "Ford"};
        for (String i : cars) {
            System.out.println(i);
        }
    }

    static void exerciseSix(String[] args) {
        // Insert the missing parts to create a two-dimensional array.
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    }
}