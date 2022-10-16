package github.java;

public class Circle {
    private double radius;
    private String color;

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
