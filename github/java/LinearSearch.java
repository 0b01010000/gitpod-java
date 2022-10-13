package github.java;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type array's size: ");
        int N = sc.nextInt();

        System.out.print("Type array's values: ");
        int[] nums = new int[N];
        for (int i = 0; i<N; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Type the number to search for: ");
        int num = sc.nextInt();
        sc.close();

        int index = find(nums, num);
        System.out.println("The number was found at index[" + index + "].");
    }

    public static int find(int[] nums, int num) {
        for(int index = 0; index<nums.length; index++) {
            if (nums[index] == num) {
                return index;
            }
        }
        return -1;
    }
}