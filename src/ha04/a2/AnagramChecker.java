package ha04.a2;


import java.util.Arrays;
import java.util.Scanner;
public class AnagramChecker {
    /**
     * Returns true if the two strings are anagrams of each other.
     */
    public static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        return Arrays.equals(countLetters(a), countLetters(b));
    }

    /**
     * Helper method to count how many times each letter (a-z) appears.
     */
    public static int[] countLetters(String s) {
        int[] counts = new int[26];

        for (char letter : s.toCharArray()) {
            if (letter >= 'a' && letter <= 'z') {
                counts[letter - 'a']++;
            }
        }
        return counts;
    }
    /**
     * Print only letters that appear in the string with their counts.
     */
    public static void printLetterCounts(String s) {
        for (int i = 0; i < 26; i++) {
            if (countLetters(s)[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + countLetters(s)[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get two strings from the user
        System.out.print("Enter the first string: ");
        String word1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String word2 = scanner.nextLine();
        System.out.println("Are they anagrams? " + isAnagram(word1, word2));
        printLetterCounts(word1);
        printLetterCounts(word2);
    }
}

