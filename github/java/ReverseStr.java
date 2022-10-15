package github.java;
import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a word: ");
        String str = in.nextLine();
        in.close();

        String reversedStr = "";
        int i = str.length() - 1;
        while (i >= 0) {
            reversedStr += str.charAt(i);
            i -= 1;
        }
        System.out.printf("The reverse is: %s. %n", reversedStr);
    }
}
