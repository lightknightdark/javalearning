package checkbox;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CheckBox extends JFrame implements ActionListener {

    JButton button;
    JCheckBox  checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;
    CheckBox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("x.png");
        checkIcon = new ImageIcon("checkmark.png");

        JButton button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("i am not Robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);




        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if(e.getSource()==button){
            System.out.print( checkBox.isSelected());

        }
        
    }
}
