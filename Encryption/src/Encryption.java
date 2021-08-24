public class Encryption {

    public static void main(String[] args) {

        int key = 6;
        String text = "Hey, how's it hangin?";
        System.out.println(text);

        char[] chars = text.toCharArray();

        for (char c : chars) {
            c += key;
            System.out.print(c);
        }
    }

}
