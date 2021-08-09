public class JavaMethods {

    static void exerciseOne(String[] args) {
        //Insert the missing part to call myMethod from main.
        static void myMethod() {
            System.out.println("I just got executed!");
        }

        public static void main(String[] args) {
            myMethod();
        }
    }

    static void exerciseTwo (string[] args) {
        // Insert the missing part to call myMethod from main two times.
        static void myMethod() {
            System.out.println("I just got executed!");
        }

        public static void main(String[] args) {
            myMethod();
            myMethod();
        }
    }

    static void exerciseThree(String[] args) {
        // Add a fname parameter of type String to myMethod, and output "John Doe".
        static void myMethod(String fname) {
            System.out.println( fname + " Doe");
        }

        public static void main(String[] args) {
            myMethod("John");
        }
    }

    static void exerciseFour(String[] args) {
        // Insert the missing part to print the number 8 in main, by using a specific keyword inside myMethod:
        static int myMethod(int x) {
            return 5 + x;
        }

        public static void main(String[] args) {
            System.out.println(myMethod(3));
        }
    }

    static void checkAge(int Age) {
        // Follow the comments to insert the missing parts of the code below:
        // If age is less than 18, print "Access denied"
        if (age < 18) {
            System.out.println("Access denied");

            // If age is greater than, or equal to, 18, print "Access granted"
        } else {
            System.out.println("Access granted");
        }

    }

    public static void main(String[] args) {
        // Call the checkAge method and pass along an age of 20
        checkAge(20);
    }
}