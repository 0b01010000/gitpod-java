package github.java;

import java.util.Scanner;

public class Factorial {

    static int fact(int n) {
        int product = 1;
        for (int i = n; i>1; i--) {
            product *= i;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The factorial of " + n + " is " + fact(n) + ".");
    }
}
