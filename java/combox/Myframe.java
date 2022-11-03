package combox;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame implements ActionListener {

    JComboBox comBox ;

    Myframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(new FlowLayout());
        String[] drinks = {"coffee", "mike", "Tea"};

        comBox = new JComboBox(drinks);
        comBox.addActionListener(this);

        comBox.setEnabled(true);
        comBox.addItem("water");
        comBox.insertItemAt("red tea", 0);
        comBox.setSelectedIndex(0);
        comBox.removeItem("Tea");
        comBox.removeItemAt(0);
      //  comBox.removeAllItems();
        System.out.println(comBox.getItemCount());

        this.add(comBox);
        this.setVisible(true);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == comBox ){
            System.out.println(comBox.getSelectedItem());
            System.out.println(comBox.getSelectedIndex());
        }
        
    }
    
}
