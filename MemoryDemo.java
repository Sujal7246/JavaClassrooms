public class MemoryDemo {
    public static void main(String[] args) {
        int primitive = 10;
        int primitive2 = primitive;

        int[] reference = {1, 2, 3};
        int[] reference2 = reference;

        System.out.println("Primitive 1: " + primitive);
        System.out.println("Primitive 2: " + primitive2);

        primitive2 = 20;
        System.out.println("After changing primitive2:");
        System.out.println("Primitive 1: " + primitive);
        System.out.println("Primitive 2: " + primitive2);

        System.out.println("\nReference 1: " + reference[0]);
        System.out.println("Reference 2: " + reference2[0]);

        reference2[0] = 99;
        System.out.println("After changing reference2[0]:");
        System.out.println("Reference 1: " + reference[0]);
        System.out.println("Reference 2: " + reference2[0]);
    }
}

