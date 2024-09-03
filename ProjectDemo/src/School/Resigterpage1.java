package School;

import javax.swing.*;
import java.awt.*;


public class Resigterpage1 extends JFrame {

    JFrame frame = new JFrame();
    JPanel headerpanel, panel1 = new JPanel();
    Font titlefont = new Font("Inika", Font.BOLD, 58),
            font = new Font("Inika", Font.BOLD, 20);
    JLabel title = new JLabel("University Of Information Technology"),
            logo = new JLabel(),
            name = new JLabel("Name :"),
            birth = new JLabel("Birth :"),
            day = new JLabel("Days :"),
            month = new JLabel("Months :"),
            year = new JLabel("Years :"),
            gender = new JLabel("Gender :"),
            major = new JLabel("Major :"),
            email = new JLabel("Email :"),
            password = new JLabel("Password :"),
            time = new JLabel("Time :");
    ImageIcon schoollogo = new ImageIcon("src/School/Vector.png");

    // Frame Setting
    public Resigterpage1() {

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.setLayout(null);
        frame.setUndecorated(true);

        headerpanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g.create();

                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                Color shadowColor = new Color(0x06094F);
                int shadowSize = 235;

                g2d.setColor(shadowColor);
                g2d.fillRoundRect(0, shadowSize,
                        getWidth(), getHeight(),
                        0, 20);
                        g2d.dispose();
                        title.setFont(titlefont);
                        title.setBounds(350, 50, 1500, 200);
                        logo.setText("");
                        logo.setIcon(schoollogo);


            }
        };
        headerpanel.setBackground(new Color(0x536EFF));
        headerpanel.setSize(1900, 240);
        headerpanel.add(logo);
        headerpanel.add(title);
        headerpanel.setLayout(null);

        panel1.setBackground(new Color(0xABC2FC));
        panel1.setSize(1920, 1080);

        // Display


        frame.add(headerpanel);
        frame.add(panel1);
        frame.setVisible(true);

    }

}
