public class JavaStrings {

    static void exerciseOne(String[] args) {
        // Fill in the missing part to create a greeting variable of type String and assign it the value Hello.
        String  greeting = "Hello";
    }

    static void exerciseTwo (String[] args) {
        // Use the correct method to print the length of the txt string.
        String txt = "Hello";
        System.out.println(txt.length());
    }

    static void exerciseThree (String[] args) {
        // Convert the value of txt to upper case.
        String txt = "Hello";
        System.out.println(txt.toUpperCase());
    }

    static void exerciseFour (String[] args) {
        // Use the correct operator to concatenate two strings:
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName + lastName);
    }

    static void exerciseFive (String[] args) {
        // Use the correct method to concatenate two strings:
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concatenate(lastName));
    }

    static void exerciseSix (String[] args) {
        // Return the index (position) of the first occurrence of "e" in the following string:
        String txt = "Hello Everybody";
        System.out.println(txt.indexOf("e"));
    }
}