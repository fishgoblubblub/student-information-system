package ui;
import storage.IDandPasswords;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.HashMap;

public class LoginPage implements ActionListener{
    
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("Username:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel();
    JLabel titleLabel = new JLabel("STUDENT INFORMATION SYSTEM");
    
    HashMap<String, String> loginInfo = new HashMap<>();
    
    public LoginPage(HashMap<String, String> loginInfoOriginal){
        loginInfo = loginInfoOriginal;
        
        titleLabel.setBounds(50, 60, 520, 50);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        
        userIDLabel.setBounds(135, 140, 100, 30);
        userPasswordLabel.setBounds(135, 195, 100, 30);
        
        userIDField.setBounds(225, 140, 260, 35);
        userPasswordField.setBounds(225, 195, 260, 35);
        
        loginButton.setBounds(185, 255, 120, 35);
        loginButton.addActionListener(this);
        
        resetButton.setBounds(315, 255, 120, 35);
        resetButton.addActionListener(this);
        
        messageLabel.setBounds(135, 315, 350, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));
        
        frame.add(titleLabel);
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        
        frame.setTitle("Login");   // Sets Title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exits the frame on close
        frame.setSize(620, 480);                              // Sets the x and y dimension of frame
        frame.setResizable(false);                            // prevents frame from being resized
        frame.setLayout(null);                                // Turns off automatic layout management
        frame.setVisible(true);                               // Makes frame visible
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==resetButton){
            userIDField.setText("");
            userPasswordField.setText("");
        }
        
        if(e.getSource()==loginButton){
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());
            
            if(loginInfo.containsKey(userID)){
                if(loginInfo.get(userID).equals(password)){
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login Successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userID);
                } else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong Password");
                } 
            } else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Username not found");
            }
        } 
    }
}