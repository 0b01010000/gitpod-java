public class Calculator {

    static double sum(double ...varargs) {
        double r = 0.0;
        for (double n : varargs) {
            r += n;
        }
        return r;
    }

    static double add(double x, double y) {
        return x + y;
    }

    static double subtract(double x, double y) {
        return x - y;
    }

    static double mutiply(double x, double y) {
        return x * y;
    }

    static double divide(double x, double y) {
        return x / y;
    }

    static double module(double x, double y) {
        return x % y;
    }

    static double toThePower(double x, double y) {
        return Math.pow(x, y);
    }

    public static void main(String[] args) {
        double x = 3.0;
        double y = 5.0;

        System.out.println(sum(x, y)); // 8.0
        System.out.println(sum(7.5,7.0,4.0,5.2,6.0,8.0)); // 37.7
        System.out.println(add(x, y)); // 8.0
        System.out.println(subtract(x, y)); // -2.0
        System.out.println(mutiply(x, y)); // 15.0
        System.out.println(divide(x, y)); // 0.6
        System.out.println(module(x, y)); // 3
        System.out.println(toThePower(x, y)); // 3.0*3.0*3.0*3.0*3.0 = 27.0*9.0 = 243.0
    }
    
}
