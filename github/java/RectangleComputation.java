package github.java;

public class RectangleComputation {
    
    public static void main(String[] args) {
        double length, width, area, perimeter;

        length = 10.0;
        width = 5.0;

        area = length * width;
        perimeter = 2.0*length + 2.0*width;

        System.out.print("The area is ");
        System.out.println(area);

        System.out.print("The perimeter is ");
        System.out.println(perimeter);
    }
}
