package thread;
public class thread {
   public static void main(String[] args) throws InterruptedException {
 //   System.out.println(Thread.activeCount());
  //  Thread.currentThread().setName("Mainrename");
   //     System.out.println(Thread.currentThread().getName());
   //     Thread.currentThread().setPriority(1);
   //     System.out.println(Thread.currentThread().getPriority());

    //    System.out.println(Thread.currentThread().isAlive());


     //   for(int i = 3;i>0;i--){
    //        System.out.println(i);
    //        Thread.sleep(1000);
    //    }

    //    System.out.println("hte thread sleep 1000 milli second");


        MyThread thread2 = new MyThread();
        thread2.setDaemon(false);
        System.out.println(thread2.isDaemon());
        
        thread2.start();
        thread2.setName("2 nd thread");
        thread2.setPriority(1);
       // thread2.run();
       System.out.println(thread2.getPriority());
    
        System.out.println(thread2.isAlive());
        System.out.println(thread2.getName());

        System.out.println(Thread.activeCount());
    }
}
