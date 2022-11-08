package meun;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Myframe extends JFrame implements ActionListener {
    
    JMenuBar meunBar ;
    JMenu fileMenu ;
    JMenu editMenu ;
    JMenu helpMenu ;
    JMenuItem loadItem ;
    JMenuItem saveItem ;
    JMenuItem exitItem ;
    ImageIcon loadIcon;
    ImageIcon exitIcon;
    ImageIcon saveIcon;
Myframe(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("load.png");
        saveIcon = new ImageIcon("save.png");
        exitIcon = new ImageIcon("exit.png");

        meunBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        fileMenu.setMnemonic(KeyEvent.VK_F);
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);

        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);


        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        meunBar.add(helpMenu);
        meunBar.add(editMenu);
        meunBar.add(fileMenu);
        

        this.setJMenuBar(meunBar);
        this.setVisible(true);
        this.pack();
}
  

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==loadItem){
            System.out.println("you load the fiel");
        } else if (e.getSource()==saveItem){
            System.out.println("You save the file");
        }else if (e.getSource()==exitItem){
            System.exit(0);;
        }
        
    }
   
    
}
