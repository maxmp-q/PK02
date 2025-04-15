public class SnakeTranslator {
    public static String Translate(String input) {
        StringBuilder modifiedStr = new StringBuilder();
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            modifiedStr.append(currentChar);

            if (vowels.indexOf(currentChar) != -1) {
                modifiedStr.append('s');
                modifiedStr.append(currentChar);
            }
        }
        return modifiedStr.toString();
    }
}
