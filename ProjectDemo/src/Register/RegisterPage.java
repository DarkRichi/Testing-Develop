package Register;

import ControlRoom.Usercontrol;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.util.*;

public class RegisterPage extends JFrame {
    JPanel headerpanel = new JPanel(),
            shadowhp = new JPanel(),
            footerpanel = new JPanel();
    ImageIcon SchoolIcon = new ImageIcon("src/Register/Vector.png");
    Font titlefont = new Font("Inika", Font.TYPE1_FONT, 58),
            font = new Font("Inika", Font.TYPE1_FONT,22),
            sfont = new Font("Inika",Font.PLAIN,15);
    JLabel title = new JLabel(),
            titleshadow = new JLabel(),
            logo = new JLabel(),
            name = new JLabel(), birth = new JLabel(),day = new JLabel(),month = new JLabel(),year=new JLabel(),
            gender = new JLabel(),timestudy = new JLabel(),
            major = new JLabel(),gmail = new JLabel(), password = new JLabel();
    JTextField InputFirstname = new JTextField(), InputLastname = new JTextField(),InputMajor = new JTextField(),InputGmail = new JTextField();
    JPasswordField InputPW = new JPasswordField();
    String[] gendertype = {"Male","Female","Other"}, studytimeType = {"Morning","Afternoon","Night"};
    String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    JComboBox genderbox = new JComboBox(gendertype),studytimebox = new JComboBox(studytimeType);
    JComboBox<Integer> daybox = new JComboBox<>(),yearbox = new JComboBox<>();
    JComboBox<String> monthbox = new JComboBox<>(months);

    DefaultListCellRenderer Render;

    public RegisterPage(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(1920,1080);
        this.setLayout(null);

        SchoolIcon.getIconHeight();

        title.setText("University Of Information Technology");
        title.setFont(titlefont);
        title.setForeground(Color.WHITE);
        title.setBounds(571,123,1500,76);
        titleshadow.setText("University Of Information Technology");
        titleshadow.setFont(titlefont);
        titleshadow.setForeground(Color.BLACK);
        titleshadow.setBounds(571,128,1500,76);

        logo.setIcon(SchoolIcon);
        logo.setBounds(293,55,216,207);

        headerpanel.setBounds(0,0,1920,333);
        headerpanel.setBackground(new Color(0x536EFF));
        headerpanel.setLayout(null);
        headerpanel.add(title);
        headerpanel.add(logo);
        headerpanel.add(titleshadow);
        shadowhp.setBackground(new Color(0x06094F));
        shadowhp.setBounds(0,333,1920,5);
        shadowhp.setLayout(null);

        name.setText("Name :");
        name.setBounds(552,422,100,25);
        name.setFont(font);

        birth.setText("Birth :");
        birth.setFont(font);
        birth.setBounds(552,511,100,25);

        day.setText("Days:");
        day.setFont(sfont);
        day.setBounds(589,552,100,25);

        month.setText("Months:");
        month.setFont(sfont);
        month.setBounds(793,552,100,25);

        year.setText("Years:");
        year.setFont(sfont);
        year.setBounds(997,552,100,25);

        gender.setText("Genders:");
        gender.setFont(font);
        gender.setBounds(1136,463,100,25);

        major.setText("Majors:");
        major.setFont(font);
        major.setBounds(552,648,100,25);

        timestudy.setText("Time Study:");
        timestudy.setFont(font);
        timestudy.setBounds(1103,697,200,25);

        gmail.setText("Gmail:");
        gmail.setFont(font);
        gmail.setBounds(552,738,100,25);

        password.setText("Password:");
        password.setFont(font);
        password.setBounds(552,818,200,25);

        // Input

        InputFirstname.setBounds(566,463,220,21);
        InputFirstname.setBackground(new Color(0xABC2FC));
        InputFirstname.setFont(sfont);
        InputFirstname.setForeground(Color.GRAY);
        InputFirstname.setText("Enter your first name...");
        InputFirstname.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK));

        InputLastname.setFont(sfont);
        InputLastname.setBackground(new Color(0xABC2FC));
        InputLastname.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK));
        InputLastname.setText("Enter your last name...");
        InputLastname.setForeground(Color.GRAY);
        InputLastname.setBounds(828,463,220,21);

        InputMajor.setText("Enter Your Major...");
        InputMajor.setBackground(new Color(0xABC2FC));
        InputMajor.setFont(sfont);
        InputMajor.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK));
        InputMajor.setForeground(Color.GRAY);
        InputMajor.setBounds(566,697,485,21);

        InputGmail.setText("Enter Your Gmail Address...");
        InputGmail.setBackground(new Color(0xABC2FC));
        InputGmail.setFont(sfont);
        InputGmail.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK));
        InputGmail.setForeground(Color.GRAY);
        InputGmail.setBounds(566,777,485,21);

        InputPW.setText("Enter Your Password...");
        InputPW.setBackground(new Color(0xABC2FC));
        InputPW.setFont(sfont);
        InputPW.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK));
        InputPW.setForeground(Color.GRAY);
        InputPW.setBounds(566,857,485,21);
        InputPW.setEchoChar((char) 0);

        // FocusListener

        InputFirstname.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (InputFirstname.getText().equals("Enter your first name...")){
                    InputFirstname.setText("");
                    InputFirstname.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (InputFirstname.getText().isEmpty()){
                    InputFirstname.setText("Enter your first name...");
                    InputFirstname.setForeground(Color.GRAY);
                }

            }
        });

        InputLastname.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (InputLastname.getText().equals("Enter your last name...")){
                    InputLastname.setText("");
                    InputLastname.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (InputLastname.getText().isEmpty()){
                    InputLastname.setText("Enter your last name...");
                    InputLastname.setForeground(Color.GRAY);
                }
            }
        });

        InputMajor.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (InputMajor.getText().equals("Enter Your Major...")){
                    InputMajor.setText("");
                    InputMajor.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (InputMajor.getText().isEmpty()){
                    InputMajor.setText("Enter Your Major...");
                    InputMajor.setForeground(Color.GRAY);
                }
            }
        });

        InputGmail.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (InputGmail.getText().equals("Enter Your Gmail Address...")){
                    InputGmail.setText("");
                    InputGmail.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (InputGmail.getText().isEmpty()){
                    InputGmail.setText("Enter Your Gmail Address...");
                    InputGmail.setForeground(Color.GRAY);
                }
            }
        });

        InputPW.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (new String(InputPW.getPassword()).equals("Enter Your Password...")){
                    InputPW.setText("");
                    InputPW.setEchoChar('•');
                    InputPW.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (InputPW.getPassword().length == 0){
                    InputPW.setText("Enter Your Password...");
                    InputPW.setForeground(Color.GRAY);
                    InputPW.setEchoChar((char) 0);
                }
            }
        });

        // ComboBox
        Render = new DefaultListCellRenderer();
        Render.setHorizontalAlignment(SwingConstants.CENTER);

        genderbox.setFont(new Font("Inika",Font.PLAIN,20));
        genderbox.setBounds(1230,460,100,30);
        genderbox.setBackground(Color.WHITE);
        genderbox.setRenderer(Render);

        studytimebox.setFont(new Font("Inika",Font.PLAIN,18));
        studytimebox.setBounds(1230,695,115,30);
        studytimebox.setBackground(Color.WHITE);
        studytimebox.setRenderer(Render);

        daybox.setBounds(630,552,100,25);
        daybox.setFont(new Font("Inika",Font.BOLD,18));
        daybox.setRenderer(Render);

        monthbox.setBounds(855,552,100,25);
        monthbox.setFont(new Font("Inika",Font.BOLD,18));
        monthbox.setRenderer(Render);

        yearbox.setBounds(1045,552,100,25);
        yearbox.setFont(new Font("Inika",Font.BOLD,18));
        yearbox.setRenderer(Render);

        int currentyear = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = currentyear - 100; i <= currentyear + 50 ; i++) {
            yearbox.addItem(i);
        }

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectyear  = (int)yearbox.getSelectedItem();
                int selectmonth = monthbox.getSelectedIndex();
                Updateday(daybox,selectmonth,selectyear);
            }
        };
        monthbox.addActionListener(actionListener);
        yearbox.addActionListener(actionListener);

        Updateday(daybox,monthbox.getSelectedIndex(),(Integer) yearbox.getSelectedItem());

        g2button signupbutton = new g2button("Sign Up");
        signupbutton.setBackground(new Color(0xFC1414)); // set the color always show
        signupbutton.setForeground(Color.WHITE);
        signupbutton.setFont(font);

        signupbutton.setBounds(890,930,200,50);
        signupbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Usercontrol usercontrol = new Usercontrol();
                dispose();
            }
        });

        // Display

        footerpanel.setBounds(0,0,1920,1080);
        footerpanel.setBackground(new Color(0xABC2FC));
        footerpanel.setLayout(null);
        footerpanel.add(name);
        footerpanel.add(birth);
        footerpanel.add(day);
        footerpanel.add(month);
        footerpanel.add(year);
        footerpanel.add(gender);
        footerpanel.add(major);
        footerpanel.add(timestudy);
        footerpanel.add(gmail);
        footerpanel.add(password);
        footerpanel.add(InputFirstname);
        footerpanel.add(InputLastname);
        footerpanel.add(InputMajor);
        footerpanel.add(InputGmail);
        footerpanel.add(InputPW);
        footerpanel.add(genderbox);
        footerpanel.add(studytimebox);
        footerpanel.add(daybox);
        footerpanel.add(monthbox);
        footerpanel.add(yearbox);
        footerpanel.add(signupbutton);

        this.add(headerpanel);
        this.add(shadowhp);
        this.add(footerpanel);

        this.setVisible(true);
    }

    public static void Updateday (JComboBox<Integer> daybox, int months, int years) {
        daybox.removeAllItems();
        int DinM;
        switch (months) {
            case 1: // February
                if ((years % 4 == 0 && years % 100 != 0) || (years % 400 == 0)) {
                    DinM = 29; // Leap year
                } else {
                    DinM = 28;
                }
                break;
            case 3: case 5: case 8: case 10: // April, June, September, November
                DinM = 30;
                break;
            default: // All other months
                DinM = 31;
                break;
        }
        for (int i = 1; i <= DinM; i++) {
            daybox.addItem(i);
        }

    }
    public class g2button extends JButton{
        private g2button(String label){
            super(label);
            setFocusPainted(false); // remove ouline
            setBorderPainted(false); // remove border
            setContentAreaFilled(false); // disable content fill
            setOpaque(false); // ensure background paint

            addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    setBackground(new Color(0x57cc99));

                }

                @Override
                public void mouseExited(MouseEvent e) {
                    setBackground(new Color(0xFC1414)); // set the color change back

                }
            });
        }
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2.setColor(getBackground());
            g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), getHeight(), getHeight()));

            super.paintComponent(g);
            g2.dispose();
        }

    }


}
