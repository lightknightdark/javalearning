import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class gui {
    public static void main(String[] args) {

   JFrame jframe = new JFrame();
        jframe.setTitle("Testing");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setResizable(false);
        jframe.setSize(420,420);
        jframe.setVisible(true);

        ImageIcon icon = new ImageIcon("mongo.png");
        jframe.setIconImage(icon.getImage());
      //  jframe.getContentPane().setBackground(Color.green);
      jframe.getContentPane().setBackground(new Color(245,56,65));

     


    }
}
