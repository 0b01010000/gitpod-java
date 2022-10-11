public class TimesTable02 {
    public static void main(String[] args) {
        int i = 0;
        while (i<=10) {
            System.out.println("Times table of " + i);
            int j = 0;
            while (j <= 10) {
                System.out.println(i + " x "+ j + " = " + (i*j));
                j += 1;
            }
            i += 1;
        }
    }
}