import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main_class extends JFrame{

    Main_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1120,630);
        add(img);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(340,155,400,40);
        heading.setFont(new Font("Raleway",Font.BOLD,24));
        img.add(heading);

        JButton add = new JButton("Add Employee");
        add.setBounds(335,270,150,40);
        add.setBackground(Color.black);
        add.setForeground(Color.WHITE);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                new AddEmployee();
                setVisible(false);
            }
        });
        img.add(add);

        JButton view = new JButton("View Employee");
        view.setBounds(585,270,150,40);
        view.setBackground(Color.black);
        view.setForeground(Color.WHITE);
        view.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                new ViewEmployee();
                setVisible(false);
            }
        });
        img.add(view);

        JButton rem = new JButton("Remove Employee");
        rem.setBounds(440,370,150,40);
        rem.setBackground(Color.black);
        rem.setForeground(Color.WHITE);
        rem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                new RemoveEmployee();
            }
        });
        img.add(rem);
        

        setSize(1120,630);
        setLocation(100,90);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main_class();
    }
}
