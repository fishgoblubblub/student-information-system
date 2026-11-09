package ui;
import java.awt.*;
import javax.swing.*;
// Place Holder Class Only

public class WelcomePage {
    
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel();
    
    WelcomePage(String userID){
        welcomeLabel.setBounds(0,0,600,200);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,67));
        welcomeLabel.setText("Hello "+userID);
        
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(620, 480);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
