package github.java;

import java.util.Scanner;

public class GuessTheLetterGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] alphabet = new char[26];
        char inputLetter;
        for (int i = 0; i < 26; alphabet[i] = (char) (i +'a'), i++);

        System.out.println("I'm thinking of a letter. Can you guess it?");
        int index = (int) (Math.random() * 26);
        char letter = alphabet[index];

        while (true) {
            System.out.print("What letter am I thinking right now? ");
            inputLetter = scan.next().charAt(0);
            if (inputLetter == letter) {
                System.out.println("You got it!!! It's " + letter);
                scan.close();
                break;
            } else {
                System.out.println("Wrong. Try it again!");
            }
        }
    }
}
