public class DuplicateCharacters {

    public static void main(String[] args) {

        String sentence = "How many duplicates are there?";
        System.out.println(sentence);

        StringBuilder characters = new StringBuilder();
        StringBuilder duplicates = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            String current = Character.toString(sentence.charAt(i));

            if (characters.toString().contains(current)) {

                if (!duplicates.toString().contains(current)){
                    duplicates.append(current).append(",");
                }
            }

            characters.append(current);
        }

        System.out.println(duplicates);
    }
}
