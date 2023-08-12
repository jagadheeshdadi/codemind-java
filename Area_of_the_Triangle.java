import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        float a = triangle.nextFloat();
        float b = triangle.nextFloat();
        float c = triangle.nextFloat();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.printf("%.2f",area);

    }
}