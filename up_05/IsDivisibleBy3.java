package up_05;

import java.util.Scanner;

public class IsDivisibleBy3 {
    public static void main(String[] args) {
        //int t = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
       
        while (true) {
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.println(String
                        .format("Is %d divisible by 3? %b", 
                                number, isDivisibleBy3(number)
                        )
            );
            System.out.print("Do you want to quit? Type[quit] or anything to keep up: ");
            String str = sc.next();
            if (str.equals("quit"))
                break;

        }
        sc.close();
        
    }

    static boolean isDivisibleBy3(int number) {
        int sum = 0;
        while (true) {
            sum += number % 10;
            number = number / 10;
            if (number == 0) {
                break;
            }
        }
        return sum % 3 == 0;
    }
}
