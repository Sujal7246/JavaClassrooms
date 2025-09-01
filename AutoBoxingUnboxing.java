public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = a;   // Autoboxing
        System.out.println("Autoboxing: int to Integer: " + obj);

        Integer b = 20;
        int val = b;       // Unboxing
        System.out.println("Unboxing: Integer to int: " + val);
    }
}
