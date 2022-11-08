package thread;

public class MyThread extends Thread {
    @Override
    public void run(){
        if(this.isDaemon()){
            System.out.println("the thread is running in thread 2");
        }else{
            System.out.println("this user thread!");
        }
      
    }
}
