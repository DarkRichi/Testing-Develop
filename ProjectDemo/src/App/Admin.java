package App;

import javax.swing.*;

public class Admin extends JFrame {
    private JPanel Adminlogin;
    private JLabel Userid;

    public Admin(String id){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Admin");
        setContentPane(Adminlogin);
        setSize(500,500);
        Userid.setText("Admin " + id);
        setVisible(true);

    }

}
