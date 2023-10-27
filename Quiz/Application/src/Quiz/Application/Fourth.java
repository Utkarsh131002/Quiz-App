package Quiz.Application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fourth extends JFrame implements ActionListener {

    Fourth(String name ,int score){

        setBounds(330,100,750,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i.getImage().getScaledInstance(300,250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);

        JLabel heading = new JLabel("Thank You "+ name +" for playing Simple Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("tahoma",Font.PLAIN,26));
        add(heading);

        JLabel libscore = new JLabel("Your score is:"+score);
        libscore.setBounds(350,200,300,30);
        libscore.setFont(new Font("tahoma",Font.PLAIN,26));
        add(libscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(380,270,120,30);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        setVisible(false);
        new FrontPage();

    }

    public static void main(String[] args) {
        new Fourth("user",0);
    }

    

    
}
