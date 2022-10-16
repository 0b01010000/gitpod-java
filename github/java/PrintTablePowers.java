package github.java;

public class PrintTablePowers {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 4;
        for (int i = START; i <= END; i++) {
            if (i == 1) System.out.printf(" %s ", "a");
            else System.out.printf(" %s^%d ", "a", i);
        }
        System.out.printf("%n");

        for (int i = START; i <= END; i++) {
            System.out.printf(" %d ", i);
            for (int j = 2; j <= END; j++) {
                int power = (int) Math.pow(i, j);
                System.out.printf(" %3d ", power);
            }
            System.out.printf("%n");
        }
    }
}
