public class program15 {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 50:");
        for (int i = 2; i <= 50; i++) {
            boolean prime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) System.out.print(i + " ");
        }
    }
}
