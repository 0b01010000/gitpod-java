package up_04;

import java.util.*;
import java.io.IOException;
import java.io.File;

public class ReadAFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the full file path: ");
        String pathToYourFile = sc.nextLine();

        sc.close();
        try {
            File fileObject = new File(pathToYourFile);
            Scanner sc2 = new Scanner(fileObject);
            
            System.out.println("Your text: ");
            while (sc2.hasNextLine()) {
                System.out.println(sc2.nextLine());
            }
            sc2.close();
            System.out.println("BYE!!!");
        } catch (IOException e) {
            System.out.println("Something went wrong!!!");
            e.printStackTrace();
        }
    }
}
