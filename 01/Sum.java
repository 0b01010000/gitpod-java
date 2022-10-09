import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = 0;
        do {
            System.out.print("Type a positive number: ");
            n = sc.nextInt();
            sum += n;
        } while (n >= 0);
        sc.close();
        System.out.println("Total is: " + sum);
    }
}