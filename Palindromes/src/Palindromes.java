public class Palindromes {

    public static void main(String[] args) {

        // Exemples: mom, dad, poop, race car, nurses run

        String original = "nurses run";
        original = original.replace(" ", "");

        String reverse = "";
        for( int index = (original.length() - 1); index >= 0; index--) {
            reverse += original.charAt(index);
            System.out.println(reverse);
        }

        boolean palindrome = true;
        for(int index = 0; (index < original.length()); index++) {

            if(original.charAt(index) != reverse.charAt(index)) {
                palindrome = false;
            }
        }

        if(palindrome) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome!");
        }
    }

}
