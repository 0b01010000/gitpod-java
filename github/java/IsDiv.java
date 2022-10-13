package github.java;

import java.util.Scanner;

public class IsDiv {
    public static void main(String[] args) {
        //System.out.println(Integer.MAX_VALUE);
        Scanner sc = new Scanner(System.in);
        for ( ; ; ) {
            System.out.print("Number: ");
            String number = sc.next();
            if (number.equals("quit")) {
                sc.close();
                break;
            }
            String message = String.format("Is %s divisible by 3: %b.", number, isDivisibleBy3(number));
            System.out.println(message);
        }
    }

    static boolean isDivisibleBy3(String number) {
        int sum = 0;

        for (int i = 0; i<number.length(); i++) {
           // sum += Integer.parseInt(number.charAt(i) + "", 10);
           sum += Character.digit(number.charAt(i), 10);
        }

        return (sum % 3 == 0);
    }
}
