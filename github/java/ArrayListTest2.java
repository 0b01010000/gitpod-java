package github.java;

import java.util.ArrayList;

public class ArrayListTest2 {

    public static void main(String[] args) {
        ArrayList<Character> upperCaseLetters = new  ArrayList<Character>();
        ArrayList<Character> lowerCaseLetters = new  ArrayList<Character>();
        ArrayList<Character> digits = new  ArrayList<Character>();
        ArrayList<ArrayList<Character>> chars = new ArrayList<ArrayList<Character>>();

        for (int i = 0; i<=25; i++) {
            char element1 = (char) ('A' + i);
            char element2 = (char) ('a' + i);
            char element3 = (char) ('0' + i);
            upperCaseLetters.add(element1);
            lowerCaseLetters.add(element2);
            if (i <= 9) digits.add(element3);
        }

        chars.add(upperCaseLetters);
        chars.add(lowerCaseLetters);
        chars.add(digits);

        // Building a table of Chars
        System.out.println();
        System.out.printf("%4s%8s", "*", "|");
        System.out.printf("%4s%n",  " Char ");

        int size = upperCaseLetters.size() + 4;
        for (int i = 0; i<size; i++) {
            System.out.print("---");
        }
        System.out.println();

        for (int i = 0; i<chars.size(); i++) {
            if (i<2) System.out.printf("%4s%2s", "Alphabet " + (i+1), "|");
            else System.out.printf("%4s%6s", "Digits", "|");
            for (int j = 0; j<chars.get(i).size(); j++) {
                System.out.printf("%2c ", chars.get(i).get(j));
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
