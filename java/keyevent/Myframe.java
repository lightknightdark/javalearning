package keyevent;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Myframe extends JFrame implements KeyListener{
    JLabel label;
    Myframe(){
    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.addKeyListener(this);
        label = new JLabel();
        label


        this.setVisible(true);
        this.pack();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Youe relesed key char: " + e.getKeyChar());
        System.out.println("Youe relesed key code: " + e.getKeyCode());
        
    }
}
