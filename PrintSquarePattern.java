import java.util.Scanner;

public class PrintSquarePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();

        for (int i = 0; i<num; i++) {
            for (int j = 0; j<num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
