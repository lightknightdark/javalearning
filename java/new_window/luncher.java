package new_window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class luncher implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("Button here");
    luncher(){

        button.setFocusable(false);
        button.setBounds(100, 160, 200, 40);
        button.addActionListener(this);


        frame.add(button);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == button){
            frame.dispose();
            Window newWindow = new Window();
        }
        
    }
}
