public class TypeCastingDemo {
    public static void main(String[] args) {
        int intVal = 100;
        double doubleVal = intVal;
        System.out.println("Implicit Casting (int to double): " + doubleVal);

        double d = 99.99;
        int i = (int) d;
        System.out.println("Explicit Casting (double to int): " + i);
    }
}
