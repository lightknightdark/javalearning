package new_window;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window { 
    JFrame frame = new JFrame();
    JLabel label = new JLabel(" YOOOO!");

    Window(){
        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font("null", Font.PLAIN,20));

        frame.add(label);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
