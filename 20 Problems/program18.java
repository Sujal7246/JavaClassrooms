import java.util.Scanner;

public class program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        for (char c : str.toCharArray()) {
            if (c == ' ') break;
            System.out.print(c);
        }
        sc.close();
    }
}
