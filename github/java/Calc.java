package github.java;

import java.util.Arrays;

public class Calc {
    public static void main(String[] args) {
        Arithmetic oprs = new Arithmetic(2, -5);

        System.out.println(Arrays.toString(oprs.abs()));
        System.out.println(oprs.add());
        System.out.println(oprs.subtract());
        System.out.println(oprs.multiply());
        System.out.println(oprs.divide());
        System.out.println(oprs.modulus());
    }
}
