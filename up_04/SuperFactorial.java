package up_04;

import java.math.BigInteger;
import java.util.Scanner;

public class SuperFactorial {

    static BigInteger fact(int n) {
        BigInteger product = BigInteger.valueOf(1);
        for (int i = n; i>1; i--) {
            product = product.multiply(BigInteger.valueOf(i));
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(String.format("The factorial of %d is %d.", n, fact(n)));
    }
}
