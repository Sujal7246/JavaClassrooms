import java.util.Scanner;

public class program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        System.out.println("Numbers are:");
        for (int n : arr) System.out.print(n + " ");
        sc.close();
    }
}
