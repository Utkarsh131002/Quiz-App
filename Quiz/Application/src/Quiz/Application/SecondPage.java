package Quiz.Application;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SecondPage  extends JFrame implements ActionListener{
    String name;
    JButton back,start;

    SecondPage(String name){
        this.name = name;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        JLabel  heading = new JLabel("Welcome "+ name +" to Simple Minds");
        heading.setBounds(50,20,700,40);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons\\funny-illustration-3d-cartoon-backpacker.jpg"));
        Image i3 = i2.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel image2 = new JLabel(i4);
        image2.setBounds(550,350,200,200);
        add(image2);

        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText( "<html>"+ 
        "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
        "4. Crying is allowed but please do so quietly." + "<br><br>" +
        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
        "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
    "<html>" );
        add(rules);


        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setVisible(true);
        setSize(800,600);
        setLocation(310,80);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== start){
            setVisible(false);
            new Third(name);
            
        }
        else{
            setVisible(false);
            new FrontPage();
        }
    }
    public static void main(String[] args) {
        new SecondPage("user");
    }
}
