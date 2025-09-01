public class StaticVsInstance {
    int instanceVar = 10;       
    static int staticVar = 20;  

    public static void main(String[] args) {
        StaticVsInstance obj1 = new StaticVsInstance();
        StaticVsInstance obj2 = new StaticVsInstance();

        System.out.println("Object 1 - InstanceVar: " + obj1.instanceVar + ", StaticVar: " + obj1.staticVar);
        System.out.println("Object 2 - InstanceVar: " + obj2.instanceVar + ", StaticVar: " + obj2.staticVar);

        obj1.instanceVar = 100;
        obj1.staticVar = 200;

        System.out.println("After modification:");
        System.out.println("Object 1 - InstanceVar: " + obj1.instanceVar + ", StaticVar: " + obj1.staticVar);
        System.out.println("Object 2 - InstanceVar: " + obj2.instanceVar + ", StaticVar: " + obj2.staticVar);
