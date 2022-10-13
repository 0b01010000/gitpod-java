package github.java;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How long is the sequence? ");
        int N = sc.nextInt();
        int[] nums = new int[N];

        System.out.print("Type the sequence: ");
        for (int i = 0; i<N; i++) {
            nums[i] = sc.nextInt();
        }

        sc.close();
        System.out.println("You have choose: ");
        for (int j = 0; j < nums.length; j++) {
            System.out.println("At index = " + j + " value=" + nums[j]);
        }
        System.out.println("END.");
        
    }
}