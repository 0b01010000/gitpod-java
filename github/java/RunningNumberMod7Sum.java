package github.java;

public class RunningNumberMod7Sum {
    public static void main(String[] args) {
        int sum = 0;

        int i = 7;
        while (i <= 1000) {
            sum = sum + i;
            i = i + 7;
        }

        System.out.println("The sum is " + sum);
    }
}
