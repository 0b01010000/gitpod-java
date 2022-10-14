package github.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class TextFileFormatterWithThrows {
    public static void main(String[] args) throws FileNotFoundException {
        Formatter out = new Formatter(new File("/workspace/gitpod-java/out.txt"));

        int num1 = 100;
        double num2 = 50.2;
        String name = "Joe";
        int num3 = 255;
        out.format("Hi %s,%n", name);
        out.format("The sum of %d and %.2f is %.2f%n", num1, num2, num1 + num2);
        out.format("Hex: %x%n", num3);

        out.close();
        System.out.println("Done");
    }
}
