package github.java;
public class IsAVowel {
    public static void main(String[] args) {
        System.out.println(testLetter("e")); // Vowel
        System.out.println(testLetter("a")); // Vowel
        System.out.println(testLetter("t")); // Consonant
        System.out.println(testLetter("O")); // Vowel 
    }

    public static String testLetter(String l) {
        switch (l.toLowerCase()) {
            case "a": return "Vowel";
            case "e": return "Vowel";
            case "i": return "Vowel";
            case "o": return "Vowel";
            case "u": return "Vowel";
            default: return "Consonant";
        }
    }
}