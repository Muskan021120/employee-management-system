package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame {
    main_class(){
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120,630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1120,
        630);
        add(image);
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(340,155,400,40);
        heading.setFont(new Font("Releway",Font.BOLD,25));
       image.add(heading);
       JButton add = new JButton("Add Employee");
       add.setBounds(335,270,150,40);
       add.setForeground(Color.WHITE);
       add .setBackground(Color.black);
       add.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               new addemployee();
               setVisible(false);
           }
       });
       image.add(add);

        JButton view = new JButton("View Employee");
        view.setBounds(565,270,150,40);
        view.setForeground(Color.WHITE);
        view .setBackground(Color.black);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new view_Employee();
                setVisible(false);

            }
        });
        image.add(view);


        JButton remove = new JButton("Remove Employee");
        remove.setBounds(440,370,150,40);
        remove.setForeground(Color.WHITE);
        remove .setBackground(Color.black);
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        image.add(remove);
     setSize(1120,630);//home class
        setLocation(250,100);
        setLayout(null);
     setVisible(true);
    }
    public static void main(String[] args){
      new main_class();

    }

}
