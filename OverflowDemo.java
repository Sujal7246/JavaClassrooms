public class OverflowDemo {
    public static void main(String[] args) {
        int num = Integer.MAX_VALUE;
        System.out.println("Max int: " + num);
        num = num + 1;
        System.out.println("After overflow: " + num);
    }
}
