package file;

import java.awt.*;
import javax.swing.*;
import javax.xml.stream.FactoryConfigurationError;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

public class Myframe extends JFrame implements ActionListener {
    JButton button;

    Myframe() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Sumbit file");
        button.addActionListener(this);
        this.add(button);
        this.setVisible(true);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == button) {
            JFileChooser fileChooser = new JFileChooser();
            // int response = fileChooser.showOpenDialog(null);
            // if(response== JFileChooser.APPROVE_OPTION){
            // File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
            // System.out.println(file);
            // File filename = new File(fileChooser.getSelectedFile().getName());
            // System.out.println(filename);

            // }

            fileChooser.setCurrentDirectory(new File("C:\\Users\\yeung\\Desktop"));

            int response = fileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
                File filename = new File(fileChooser.getSelectedFile().getName());
                System.out.println(filename);

            }

        }

    }

}
