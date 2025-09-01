public class VolatileDemo {
    volatile boolean running = true;

    public void runTask() {
        System.out.println("Thread started");
        while (running) {
        }
        System.out.println("Thread stopped");
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileDemo obj = new VolatileDemo();

        Thread t = new Thread(() -> obj.runTask());
        t.start();

        Thread.sleep(1000);
        obj.running = false; // change visible to thread immediately
    }
}
