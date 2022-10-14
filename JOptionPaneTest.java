import javax.swing.JOptionPane;

public class JOptionPaneTest {
    public static void main(String[] args) {
        String radiusStr;
        double area;

        radiusStr = JOptionPane.showInputDialog("Enter the radius of the circle: ");
        double radius = Double.parseDouble(radiusStr);
        area = radius*radius*Math.PI;

        System.out.println("The area is: " + area);
    }
}
