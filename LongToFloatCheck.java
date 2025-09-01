public class LongToFloatCheck {
    public static void main(String[] args) {
        long num = 9223372036854775807L; 
        float f = num;

        System.out.println("Long value: " + num);
        System.out.println("Stored in float: " + f);
    }
}
