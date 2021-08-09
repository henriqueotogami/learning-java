public class Conditional {

    static void exerciseOne(String[] args) {
        // Print "Hello World" if x is greater than y.
        int x = 50;
        int y = 10;
        if (x > y) {
            System.out.println("Hello World");
        }
    }

    static void exerciseTwo(String[] args) {
        // Print "Hello World" if x is equal to y.
        int x = 50;
        int y = 50;
        (x = y) {
            System.out.println("Hello World");
        }
    }

    static void exerciseThree(String[] args) {
        // Print "Yes" if x is equal to y, otherwise print "No".
        int x = 50;
        int y = 50;
        (x = y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static void exerciseFour(String[] args) {
        // Print "1" if x is equal to y, print "2" if x is greater than y, otherwise print "3".
        int x = 50;
        int y = 50;
        if (x = y) {
            System.out.println("1");
        } else if (x > y) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }

    static void exerciseFive (String[] args) {
        // Insert the missing parts to complete the following "short hand if...else statement" (ternary operator):
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}