package github.java;

public class Arithmetic {
    int[] nums1;
    double[] nums2;

    Arithmetic(int ...ns) {
        this.nums1 = ns;
    }

    Arithmetic(double ...ns) {
        this.nums2 = ns;
    }

    /**
     * Adds Integer numbers
     * 
     * @return the sum of all the numbers passed to the constructor
     */
    int add() {
        int sum = 0;
        for (int i = 0; i<this.nums1.length; i++) {
            sum += this.nums1[i];
        }
        return sum;
    }

    /**
     *  Adds Float Point Numbers
     * 
     * @return the sum of all the numbers passed to the constructor
     */
    double addFloatPointNums() {
        double sum = 0;
        for (int i = 0; i<this.nums2.length; i++) {
            sum += this.nums2[i];
        }
        return sum;
    }
}
