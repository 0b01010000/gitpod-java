import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number: ");
        int N = sc.nextInt();
        sc.close();

        int amountOfDigits = 0;
        while (N > 0) {
            amountOfDigits += 1;
            N = N / 10;
        }

        System.out.println(amountOfDigits);
    }
}