package github.java;

public class Main {
    public static void main(String[] args) {
        Circle c1, c2, c3; // all null

        c1 = new Circle(4.1, "green");
        c2 = new Circle(5.1, "blue");
        c3 = new Circle(6.1, "black");

        Circle c4 = new Circle(14.7, "yellow");

        System.out.println(c1.getArea());
        System.out.println(c1.getColor());
        System.out.println(c2.getArea());
        System.out.println(c3.getArea());
        System.out.println(c4.getArea());
    }

}