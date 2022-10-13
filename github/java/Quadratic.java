package github.java;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the value of ax^2: ");
        int a = sc.nextInt();
        System.out.print("Type the value of bx: ");
        int b = sc.nextInt();
        System.out.print("Type the value of c: ");
        int c = sc.nextInt();
        sc.close();

        // delta: b^2-4ac
        double delta = b*b-4*a*c;

        int x1 = (int) (-b + Math.sqrt(delta)) / 2*a;
        int x2 = (int) (-b - Math.sqrt(delta)) / 2*a;

        String result = String.format("S = {%d, %d} for the equation  %dx^2+%dx+%d=0", x1, x2, a, b, c);
        System.out.println(result);
    }
}
