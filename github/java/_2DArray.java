package github.java;
public class _2DArray {
    public static void main(String[] args) {
        int[][] a = {
            {1, 0, 2, -3},
            {4, 0, 3, 2, -7},
            {-10, 4, 5, -1}
        };

        System.out.println("[");
        for (int j = 0; j<a.length; j++) {
            System.out.print("  [");
            for (int i = 0; i<a[j].length; i++) {
                if ((i + 1) == a[j].length) {
                    System.out.print(a[j][i]);
                } else {
                    System.out.print(a[j][i] + ", ");
                }
            
            }
            if ((j + 1) == a.length) {
                System.out.println("]");
            } else {
                System.out.println("],");
            }
        }
        System.out.println("]");
    }    
}
