import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class label {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("mongo.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel();
        label.setText("Bro");
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boil",Font.PLAIN,30));
        label.setIconTextGap(50);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
     //   label.setBounds(0,0,250,250);

        
      
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setSize(500, 500);
       // frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("label");
        frame.add(label);
        frame.setIconImage(icon.getImage());
        frame.pack();


    }
}
