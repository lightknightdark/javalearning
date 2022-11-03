package text;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mytext extends JFrame implements ActionListener {
JButton button;
JTextField textfield;

    Mytext(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.pack();

        JButton button = new JButton("Submit");
        button.addActionListener(this);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setText("Name");
        textField.setEditable(false);

        this.add(textField);
        this.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == button){
            textfield.getText();
        }
        
    }
}
