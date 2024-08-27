import javax.swing.*;

public class Admin extends JFrame {
    private JPanel Adminlogin;

    public Admin(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Admin");
        setContentPane(Adminlogin);
        setSize(500,500);
        setVisible(true);

    }

    public static void main(String[] args) {
        Admin admin = new Admin();
    }

}
