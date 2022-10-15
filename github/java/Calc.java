package github.java;

public class Calc {
    public static void main(String[] args) {
        Arithmetic oprs1 = new Arithmetic(2, 10, 20, 30);
        Arithmetic oprs2 = new Arithmetic(4.0,2.0,1.2); 

        System.out.println(oprs1.add());
        System.out.println(oprs2.add());
    }
}
