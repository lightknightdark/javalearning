import java.util.TimerTask;
import java.util.*;


public class Timer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 10;

            @Override
            public void run() {
                // TODO Auto-generated method stub
                if(counter >0){
                    System.out.println(counter + " second");
                    counter --;
                }else{
                    System.out.println("Happy new year!");
                    timer.cancel();
                }
             
            }
            
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2022);
        date.set(Calendar.MONDAY,12);
        date.set(Calendar.DAY_OF_MONTH,31);
        date.set(Calendar.HOUR_OF_DAY,23);
        date.set(Calendar.MINUTE,59);
        date.set(Calendar.SECOND,50);
        date.set(Calendar.MILLISECOND,0);


     timer.schedule(task,date.getTime());
     timer.scheduleAtFixedRate(task,0,1000);  
     timer.scheduleAtFixedRate(task,date.getTime(),100);
        
    }
    
}
