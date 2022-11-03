package radiobox;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton sandwichesButton;
    JRadioButton hamburgerButton;
    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon sandwichesIcon;


    Myframe(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(new FlowLayout());

        ImageIcon pizzaIcon  = new ImageIcon("pizza.png");
        ImageIcon hamburgerIcon = new ImageIcon("hamburger.png");
        ImageIcon sandwichesIcon = new ImageIcon("sandwiches.png");

        pizzaButton = new JRadioButton("pizza");
        sandwichesButton = new JRadioButton("sandwiches");
        hamburgerButton = new JRadioButton("hamburger");

        pizzaButton.addActionListener(this);
        sandwichesButton.addActionListener(this);
        hamburgerButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);;                                   
        sandwichesButton.setIcon(sandwichesIcon);
        hamburgerButton.setIcon(hamburgerIcon);   


        ButtonGroup group = new ButtonGroup();
        group.add(hamburgerButton);
        group.add(pizzaButton);
        group.add(sandwichesButton);


        this.add(hamburgerButton);
        this.add(pizzaButton);
        this.add(sandwichesButton);

        this.setVisible(true);
        this.pack();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if(e.getSource() == pizzaButton){
            System.out.println("you have order pizzza!");
        }else if (e.getSource() == hamburgerButton){
            System.out.println("you have order hamburger");
        }else{
            System.out.println("you have order sandwiches");
        }
        
    }
}
