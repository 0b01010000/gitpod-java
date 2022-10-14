package github.java;

public class OddEvenSum {
    public static void main(String[] args) {

        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000;

        int sumEven = 0;
        int sumOdd  = 0;
        int absDiff = 0;

        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            if (number % 2 == 0)
                sumEven += number;
            else
                sumOdd += number;
            number++;
        }

        if (sumEven > sumOdd)
            absDiff = sumEven - sumOdd;
        else
            absDiff = sumOdd - sumEven;
    
        System.out.println("The sum of odd numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sumOdd);
        System.out.println("The sum of even numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sumEven);
        System.out.println("The absolute difference between the two sums is: " + absDiff);
    }
}
