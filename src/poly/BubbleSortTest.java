package poly;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class BubbleSortTest {

    private static Comparable[] arrComparable = new Comparable[3];

    public static void main(String[] args) {
        Point p1 = new Point(11, 3);
        System.out.println(p1);
        Point p2 = new Point(9, 4);
        System.out.println(p2);
        System.out.println(p1.greater(p2));
        Circle c1 = new Circle(p1, 13);
        System.out.println(c1);
        Circle c2 = new Circle(p2, 13);
        System.out.println(c2);
        System.out.println(c1.greater(c2));
        Cylinder cyl1 = new Cylinder(c1, 9);
        System.out.println(cyl1);
        Cylinder cyl2 = new Cylinder(c2, 8);
        System.out.println(cyl2);
        System.out.println(cyl1.greater(cyl2));

        Random random = new Random();
        for (int i = 0; i < arrComparable.length; i++) {
            int x = random.nextInt(40) + 10;
            int y = random.nextInt(40) + 10;
            arrComparable[i] = new Point(x, y);
        }
        BubbleSort.sortArray(arrComparable);
        JOptionPane.showMessageDialog(null, Arrays.toString(arrComparable));

        for (int i = 0; i < arrComparable.length; i++) {
            Point center = new Point((Point) arrComparable[i]);
            int radius = random.nextInt(20) + 10;
            arrComparable[i] = new Circle(center, radius);
        }
        BubbleSort.sortArray(arrComparable);
        JOptionPane.showMessageDialog(null, Arrays.toString(arrComparable));

        for (int i = 0; i < arrComparable.length; i++) {
            Circle base = new Circle((Circle) arrComparable[i]);
            int height = random.nextInt(50) + 10;
            arrComparable[i] = new Cylinder(base, height);
        }
        BubbleSort.sortArray(arrComparable);
        JOptionPane.showMessageDialog(null, Arrays.toString(arrComparable));
    }
}
