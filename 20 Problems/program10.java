import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println((n % 3 == 0 && n % 5 == 0) ? "Divisible by both 3 and 5" : "Not divisible by both");
        sc.close();
    }
}
