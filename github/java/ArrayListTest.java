package github.java;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        ArrayList<Integer> nums1 = new ArrayList<Integer>(20);
        ArrayList<Double> nums2 = new ArrayList<Double>();
        ArrayList<Character> chars1 = new ArrayList<Character>();
        ArrayList<Character> chars2 = new ArrayList<Character>();
        ArrayList<Character> chars3 = new ArrayList<Character>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        for (int i = 0; i<food.size(); i++) {
            System.out.printf(" %s ", food.get(i));
        }

        for (char i = 0; i<=25; i++) {
            chars1.add((char)('\u0041' + i));
            chars2.add((char)('a' + i));
            if (i <= 9) chars3.add((char)('0' + i));
        }

        System.out.println();
        System.out.println(food);
        System.out.println(nums1);
        System.out.println(nums2);
        System.out.println(chars1);
        System.out.println(chars2);
        System.out.println(chars3);
    }
}
