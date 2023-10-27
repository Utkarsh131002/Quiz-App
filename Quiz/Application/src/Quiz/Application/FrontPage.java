package Quiz.Application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FrontPage extends JFrame implements ActionListener {
    JButton rules,back;

    JTextField tfname;

    FrontPage(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i);
        image.setBounds(0,0,600,500);
        add(image);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons\\funny-illustration-3d-cartoon-backpacker.jpg"));
        Image i3 = i2.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel image2 = new JLabel(i4);
        image2.setBounds(1030,310,150,150);
        add(image2);

        // JLabel  label = new JLabel("<html>"+"QUIZ"+"<br>"+"TIME!" +"<html>");
        // label.setBounds(450,340,320,120);
        // label.setFont(new Font("Young Serif",Font.BOLD,50));
        // label.setForeground(Color.white);
        // image.add(label);

        //  JLabel  label2 = new JLabel("<html>"+"QUIZ"+"<br>"+"TIME!" +"<html>");
        // label2.setBounds(0,340,320,120);
        // label2.setFont(new Font("Young Serif",Font.BOLD,50));
        // label2.setForeground(Color.white);
        // image.add(label2);

        JLabel  heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,350,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel  name = new JLabel("Enter Your Name");
        name.setBounds(820,150,350,30);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30,144,254));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);

        rules = new JButton("Rule");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

       
        setVisible(true);
        setSize(1200,500);
        setLocation(100,120);
        setResizable(false);

    //    while(true){
    //     label.setVisible(true);
    //    // image2.setVisible(false);
    //       label2.setVisible(false);
    //     try{
    //         Thread.sleep(500);
    //     }
    //     catch(Exception e){
    //         System.out.println(e);
    //     }
    //     label.setVisible(false);
    //    // image2.setVisible(true);
    //    label2.setVisible(true);
    //      try{
    //         Thread.sleep(500);
    //     }
    //     catch(Exception e){
    //         System.out.println(e);
    //     }
    //    }
    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);

            new SecondPage(name);

        }
        else if(ae.getSource()== back){
            setVisible(false);
        }

    }
    public static void main(String[] args) {
        new FrontPage();
    }
}
