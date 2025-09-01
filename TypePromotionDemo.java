public class TypePromotionDemo {
    public static void main(String[] args) {
        byte b = 10;
        byte b2 = 20;
        int result = b + b2;
        System.out.println("byte + byte promoted to int: " + result);

        char c = 'A';
        int resChar = c + 1;
        System.out.println("char + int promoted to int: " + resChar);

        int i = 100;
        long l = 200;
        long resLong = i + l;
        System.out.println("int + long promoted to long: " + resLong);

        float f = 10.5f;
        double d = 20.5;
        double resDouble = f + d;
        System.out.println("float + double promoted to double: " + resDouble);
    }
}
