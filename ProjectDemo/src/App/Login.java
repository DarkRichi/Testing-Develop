package App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Login extends JFrame{
    private JPanel JPanelmain;
    private JButton resetButton;
    private JButton signInButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel messages;

    HashMap<String,String> logininfo = new HashMap<String,String>();

    Login(HashMap<String,String> logininfoOriginal) {

        logininfo = logininfoOriginal;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JPanelmain);
        setTitle("Admin Login");
        setSize(440, 160);

        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource()==signInButton){
                    String id = textField1.getText();
                    String pw = String.valueOf(passwordField1.getPassword());

                    if (logininfo.containsKey(id)){
                        if (logininfo.get(id).equals(pw)){
                            messages.setForeground(Color.GREEN);
                            messages.setText("Success Login");
                            Admin admin = new Admin(id);
                            dispose();


                        }else {
                            messages.setForeground(Color.RED);
                            messages.setText("Wrong password");
                        }
                    }else {
                        messages.setForeground(Color.RED);
                        messages.setText("User not found");
                    }

                }
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == resetButton) {
                    textField1.setText("");
                    passwordField1.setText("");

                }
            }
        });
        setVisible(true);
    }

}