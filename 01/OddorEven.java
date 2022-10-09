/**
 *  Check Odd or Even
 *  Given an integer N, check whether it is odd or even.
 *  
 *  Sample input:
 *   N = 5
 *  
 *  Sample Output:
 *   Odd
 * 
 */

public class OddorEven {
    public static void main(String[] args) {
        System.out.println(isOddOrEven(5)); // Odd
        System.out.println(isOddOrEven(20)); // Even
        System.out.println(isOddOrEven(11)); // Odd
        System.out.println(isOddOrEven(12)); // Even
    }

    public static String isOddOrEven(int N) {
        if (N % 2 == 0) {
            return "Even";
        } 

        return "Odd";
    }
}