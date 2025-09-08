import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Square: " + (n * n));
        System.out.println("Cube: " + (n * n * n));
        sc.close();
    }
}
