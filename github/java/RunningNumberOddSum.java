package github.java;

public class RunningNumberOddSum {
    public static void main(String[] args) {
        int sum = 0;

        int i = 1;
        while (i <= 1000) {
            sum = sum + i;
            i = i + 2;
        }

        System.out.println("The sum is " + sum);
    }
}
