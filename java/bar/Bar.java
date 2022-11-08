package bar;
import java.awt.*;
import javax.swing.*;

public class Bar {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    Bar(){
        bar.setValue(0);
        bar.setBounds(0, 0, 420, 420);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boil",Font.BOLD,25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setSize(420,420);
       frame.add(bar);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.pack();

        fill();

    }

    public void fill(){
        int counter = 0;
        while(counter<=100){
            bar.setValue(counter);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException error){
                error.printStackTrace();
            }
            counter +=20;
        }
        bar.setString("Done!");

    }
}
