public class CharVsString {
    public static void main(String[] args) {
        char c = 'A';
        String s = "A";

        System.out.println("char value: " + c);
        System.out.println("String value: " + s);

        char c2 = 'B';
        String s2 = "Hello";

        System.out.println("char example (single character): " + c2);
        System.out.println("String example (multiple characters): " + s2);

        System.out.println("char is stored as a single 16-bit Unicode character.");
        System.out.println("String is an object that can store a sequence of characters.");
    }
}
