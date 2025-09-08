import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        int largest = (x >= y && x >= z) ? x : (y >= x && y >= z) ? y : z;
        System.out.println("Largest: " + largest);
        sc.close();
    }
}
