import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        double area = PI * radius * radius;

        System.out.println("Area of circle: " + area);
    }
}
