import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class Login {
    private static final String Username = "Username"; //Username must be at least 5 characters long
    private static final String Password = "Password123$"; //Password must include a special character
    // and be 12 characters long

    public static void main(String[] args) {
        // JFrame
        JFrame frame = new JFrame("J's Restaurant Login");
        frame.setSize(300, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        //Welcome Title label
        JLabel titleLabel = new JLabel("Welcome To J's! Please Enter Login Info");
        titleLabel.setBounds(20, 0, 300, 25);
        frame.add(titleLabel);

        // Username Label and Field
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 80, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(100, 20, 160, 25);
        frame.add(userText);

        // The password label and field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 50, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 160, 25);
        frame.add(passwordText);

        // Login Button
        JButton loginButton = new JButton("Submit");
        loginButton.setBounds(100, 90, 80, 25);
        frame.add(loginButton);

        // Message Label
        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(20, 120, 250, 25);
        frame.add(messageLabel);

        // Action Listener for Login Button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                if (username.length()<5){
                    messageLabel.setText("Invalid username or password.");
                    return;
                }

                if (password.length()<12){
                    messageLabel.setText("Invalid username or password.");
                    return;
                }

                if (!containsSpecialCharacter(password)) {
                    messageLabel.setText("Invalid password.");
                    return;
                }

                if (authenticate(username, password)) {
                    messageLabel.setText("Login successful!");
                } else {
                    messageLabel.setText("Invalid username or password.");
                }
            }
        });

        frame.setLocationRelativeTo(null); // To center the frame
        frame.setVisible(true);
    }

    public static boolean authenticate(String username, String password) {
        return true;
    }

    public static boolean containsSpecialCharacter(String password) {
        // Checks if password contains at least one character that is NOT a letter or digit
        return password.matches(".*[^a-zA-Z0-9].*");
    }
}