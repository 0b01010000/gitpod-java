package github.java;
public class TimesTable {
    public static void main(String[] args) {
       for (int i = 0; i<=10; i++) {
            System.out.println("Times table of " + i);
            for (int j = 0; j<=10; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
       }

    }
}