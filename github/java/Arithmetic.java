package github.java;

public class Arithmetic {
    int[] nums1;
    double[] nums2;

    Arithmetic(int ...ns) {
        this.nums1 =  ns;
    }

    Arithmetic(double ...ns) {
        this.nums2 = ns;
    }

    /**
     * Adds Integer|Double numbers
     * 
     * @return a double value of the sum of the numbers passed to the constructor
     */
    double add() {
        double sum = 0;
        
        if (this.nums1 == null) {
            for (int i = 0; i<this.nums2.length; i++) {
                sum += this.nums2[i];
            }
            return sum;
        } 

        for (int i = 0; i<this.nums1.length; i++) {
            sum += this.nums1[i];
        }

        return sum;

    }
}
