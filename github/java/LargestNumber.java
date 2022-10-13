package github.java;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to compare? ");
        int N = sc.nextInt();
        int currentLargestNumber = Integer.MIN_VALUE;
        for (int i = 0; i<N; i++) {
            System.out.print("Type a number: ");
            int currentNumber = sc.nextInt();
            currentLargestNumber =  currentNumber > currentLargestNumber ? currentNumber : currentLargestNumber;
        }
        sc.close();
        System.out.println("The largest number is: " + currentLargestNumber);
       
    }
}