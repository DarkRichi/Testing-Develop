package ControlRoom;

import javax.swing.*;
import java.awt.*;

public class Usercontrol {
    JFrame frame = new JFrame();
    JLabel welcomeStudent = new JLabel("Welcome Student"),userprofile = new JLabel(""),Student_ID = new JLabel("ID: XXXXXX"),
            Username = new JLabel("Student Named"),Schoolname = new JLabel(),
            gpaScore = new JLabel("GPA"),attendancelist = new JLabel("Attendance");
    JPanel panel = new JPanel(), userpanel = new JPanel(),Gpa = new JPanel(),Attendance = new JPanel();

    public Usercontrol(){
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("User");
        frame.setSize(1920,1080);
        frame.setLayout(null);

        panel.setSize(1920,1080);
        panel.setBackground(new Color(0xBCCFFF));

        userpanel.setBounds(0,0,500,1080);
        userpanel.setBackground(new Color(0,56,255,50));
        userpanel.setLayout(null);

        welcomeStudent.setBounds(0,20,500,50);
        welcomeStudent.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeStudent.setFont(new Font("Inika", Font.BOLD,28));
        welcomeStudent.setForeground(Color.BLACK);
        userpanel.add(welcomeStudent);

        userprofile.setIcon(new ImageIcon("src/Images/profile.png"));
        userprofile.setBounds(20,100,70,70);
        userpanel.add(userprofile);

        Username.setBounds(88,120,370,50);
        Username.setFont(new Font("Inika",Font.BOLD,28));
        Username.setHorizontalAlignment(SwingConstants.CENTER);
        userpanel.add(Username);

        Student_ID.setBounds(88,150,370,50);
        Student_ID.setFont(new Font("Inika",Font.BOLD,28));
        Student_ID.setHorizontalAlignment(SwingConstants.CENTER);
        userpanel.add(Student_ID);

        Schoolname.setBounds(500,10,1420,100);
        Schoolname.setText("University Of Information Technology");
        Schoolname.setFont(new Font("Inika",Font.BOLD,50));
        Schoolname.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(Schoolname);

        Gpa.setBounds(800,200,310,265);
        Gpa.setBackground(Color.WHITE);

        gpaScore.setBounds(0,10,310,50);
        gpaScore.setHorizontalAlignment(SwingConstants.CENTER);
        Gpa.add(gpaScore);
        frame.add(Gpa);

        Attendance.setBounds(1300,200,370,265);
        Attendance.setBackground(Color.WHITE);
        attendancelist.setBounds(0,10,370,265);
        attendancelist.setHorizontalAlignment(SwingConstants.CENTER);
        Attendance.add(attendancelist);
        frame.add(Attendance);

        frame.add(userpanel);
        frame.add(panel);
        frame.setVisible(true);

    }
}
