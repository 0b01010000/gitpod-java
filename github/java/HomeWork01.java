package github.java;
import java.util.*;

public class HomeWork01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int[] nums = new int[N];
        for (int i = 0; i<N; i++) {
            nums[i] = (i+1) * (i+1);
        }

        for (int num : nums) {
            System.out.println(num);
        }

    }
}
