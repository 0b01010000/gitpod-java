package github.java;

public class NumberPI {
    public static void main(String[] args) {
        double sum = 0.0;
        double NUMBER_PI = 0.0;
        boolean isNegative = false;

        //for (int i = 3; i<= 11; i += 2)
        for (int i = 3; i <= 49; i += 2) {
            if (i == 3) {
                sum = 1.0 - 1.0/i;
            } else if (isNegative) {
                sum -= 1.0/i;
                isNegative = false;
            } else {
                sum += 1.0/i;
                isNegative = true;
            }
        }

        NUMBER_PI = 4*sum;

        System.out.println(Math.PI);
        System.out.println(NUMBER_PI);

    }
}
