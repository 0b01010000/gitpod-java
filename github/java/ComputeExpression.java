package github.java;

public class ComputeExpression {

    public static void main(String[] args) {
        // (10.5 + 2 x 3) / 45 - 3.5
        // (3.5 x 4) / -2.5 
        System.out.printf("%-27s%9s%n", "Expression", "| Result");
        System.out.print("(10.5 + 2 x 3) / (45 - 3.5) = ");
        System.out.println((10.5 + 2 * 3) / (45 - 3.5));
        System.out.print("(3.5 x 4) / -2.5            = ");
        System.out.println((3.5 * 4) / -2.5);
    }
    
}
