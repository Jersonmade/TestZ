public class SecondTask {
    public static void main(String[] args) {
        String word = "Hello";

        char[] words = word.toCharArray();

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i] == words[j]) {
                    System.out.println("Повторяющий символ: " + words[i]);
                    break;
                }
            }
        }
    }
}
