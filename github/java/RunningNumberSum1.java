package github.java;

public class RunningNumberSum1 {
    public static void main(String[] args) {
        int sum = 0;

        int i = 9;
        while (i <= 899) {
            sum = sum + i;
            ++i;
        }

        System.out.println("The sum is " + sum);
        System.out.println(i);
    }
}
