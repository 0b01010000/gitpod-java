package github.java;
import java.util.*;

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] nums = new int[5];
        System.out.print("Type the array1's values: ");
        for (int j = 0; j<5; j++) {
            nums[j] = sc.nextInt();
        }

        int[] nums2 = new int[5];
        System.out.print("Type the array2's values: ");
        for (int k = 0; k<5; k++) {
            nums2[k] = sc.nextInt();
        }
        sc.close();

        int[] nums3 = new int[5];
        int l = 0;
        for (int n1 : nums) {
            for (int n2 : nums2) {
                if (n1 == n2) {
                    nums3[l] = n1;
                }
            }
            l += 1;
        }

        for (int n3 : nums3) {
            if (n3 != 0) {
                System.out.println(n3);
            }
        }
    }
}
