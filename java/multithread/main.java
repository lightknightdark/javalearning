package multithread;

public class main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();

        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread1.join(3000);
        thread2.start();
        System.out.println(1/0);
    }
}
