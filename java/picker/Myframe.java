package picker;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Myframe extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    Myframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("this is some text :D");
        label.setFont(new Font("MV Boil",Font.PLAIN,100));
        label.setOpaque(true);
        this.add(button);
        this.add(label);
        this.setVisible(true);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==button){
            JColorChooser colorpicker = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "choose color", Color.BLACK);
            label.setForeground(color);
          //  label.setBackground(color);
        }
        
        
    }
    
}

