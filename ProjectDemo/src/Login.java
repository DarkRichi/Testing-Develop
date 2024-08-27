import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JPanel JPanelmain;
    private JButton resetButton;
    private JButton signInButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel messages;

    public Login() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JPanelmain);
        setTitle("Admin Login");
        setSize(440, 160);

        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==signInButton){
                    dispose();
                    Admin admin = new Admin();
                    messages.setText("Success Login");

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

    public static void main(String[] args) {
        Login login = new Login();
    }
}