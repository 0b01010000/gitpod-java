package github.java;

public class Arithmetic {
    int x = 0;
    int y = 0;

    Arithmetic(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int[] abs() {
        int[] absValues = new int[2];
        absValues[0] = (x < 0 ? -x : x);
        absValues[1] = (y < 0 ? -y : y);
        return absValues;  
    }

    int add() {
        return x + y;
    }

    int subtract() {
        return x - y;
    }

    int multiply() {
        return x * y;
    }

    double divide() {
        return ((double) x / y);
    }

    int modulus() {
        return x % y;
    }
}
