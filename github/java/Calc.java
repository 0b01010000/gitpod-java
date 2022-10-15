package github.java;

public class Calc {
    public static void main(String[] args) {
        Arithmetic oprs = new Arithmetic(2, -5);

        System.out.println(oprs.add());
        System.out.println(oprs.addFloatPointNums());
    }
}
