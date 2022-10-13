package github.java;
public class Main {
    public static void main(String[] args) {
        System.out.println(rev("amoR")); // Roma
        System.out.println(rev("livE")); // Evil
    }

    public static String rev(String s) {
        int size = s.length();
        String str = "";

        int i = size - 1;
        while (i>=0) {
            str += s.charAt(i);
            i -= 1;
        }
        return str;
    }
}