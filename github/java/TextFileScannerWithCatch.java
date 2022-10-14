package github.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileScannerWithCatch {

    public static void main(String[] args) {
        int num1;
        double num2;
        String name;
        String lastName;
        try {
            File fileOBJ = new File("/workspace/gitpod-java/github/java/in.txt");
            Scanner in = new Scanner(fileOBJ);
            num1 = in.nextInt();
            num2 = in.nextDouble();
            name = in.next();
            lastName = in.next();
            System.out.printf("Hi %s %s, the sum of %d and %.2f is %.2f%n", name, lastName, num1, num2, num1+num2);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
