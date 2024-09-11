package ControlRoom;

import javax.swing.*;
import java.awt.*;

public class Admincontrol {

    GraphicsEnvironment GE = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice GD = GE.getDefaultScreenDevice();

    JFrame frame = new JFrame();
    JLabel text = new JLabel("Hello Admin");

    public Admincontrol(){
        text.setBounds(0,0,200,50);
        text.setFont(new Font(null, Font.LAYOUT_NO_LIMIT_CONTEXT,20));
        frame.add(text);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("Admin");
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setVisible(true);

        if (GD.isFullScreenSupported()) {
            GD.setFullScreenWindow(frame);

        }

    }

}
