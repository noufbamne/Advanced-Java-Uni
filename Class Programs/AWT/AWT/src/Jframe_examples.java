import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Jframe_examples extends JFrame implements ActionListener{
    Jframe_examples(){
   
        JButton b1=new JButton("click");
        b1.setBounds(100,100,100,30);
        b1.addActionListener(this);
        
        JFrame f=new JFrame();
        f.add(b1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = f.getContentPane();
        c.setBackground(Color.pink);

        JLabel l1=new JLabel();
        l1.setText("hello");
        l1.setBounds(100,100,100,30);
        c.add(l1);    

        Font f1=new Font("Arial",Font.ITALIC,20);
        l1.setFont(f1);
        l1.setBackground(Color.RED);
        l1.setForeground(Color.BLUE);

    }
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
    public static void main(String[] args) {
        new Jframe_examples();
    }
}

