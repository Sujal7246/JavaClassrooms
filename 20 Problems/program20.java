import java.util.Scanner;

public class program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) arr[i] = sc.nextInt();

        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n != largest) {
                second = n;
            }
        }
        System.out.println("Second largest: " + second);
        sc.close();
    }
}
