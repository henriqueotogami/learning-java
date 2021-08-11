// Tutorial by Alex Lee no Youtube https://youtu.be/orUTq3CahRE
public class ReverseString {

    public static void main(String[] args) {

        final String reverseString = reverse("Explosion");
        System.out.println("String reverse: " + reverseString);
    }

    public static String reverse(String string) {
        final char[] stringLetters = new char[string.length()];

        int letterIndex = 0;
        for (int index = string.length()-1; index >= 0; index--) {
            stringLetters[letterIndex] = string.charAt(index);
            letterIndex++;
        }

        String stringReversed = "";
        for (int index = 0; index < string.length(); index++) {
            stringReversed = stringReversed + stringLetters[index];
        }

        return stringReversed;
    }
}
