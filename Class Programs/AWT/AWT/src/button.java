import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class button extends JFrame implements ActionListener
{
        Container c;
        JButton jb, jb1, jb2, jb3;

        button()
        {

            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100,100, 400, 400);
            
            c = getContentPane();
            c.setLayout(null);
            c.setBackground(Color.pink);

        JButton b = new JButton("click");
        b.setBounds(100,100, 100, 30);

        JButton b1 = new JButton("click");
        b1.setBounds(100,150, 100, 30);

        JButton b2 = new JButton("click");
        b2.setBounds(100,200, 100, 30);

        JButton b3 = new JButton("click");
        b3.setBounds(100,250, 100, 30);

        c.add(b);
        c.add(b1);
        c.add(b2);
        c.add(b3);

        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        Container c = getContentPane();
        c.setBackground(Color.pink);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jb)
        {
            c.setBackground(Color.YELLOW);
        }
        if(e.getSource()==jb1)
        {
            c.setBackground(Color.BLUE);            
        }
        if(e.getSource()==jb2)
        {
            c.setBackground(Color.RED);
        }        
        if(e.getSource()==jb3)
        {
            c.setBackground(Color.GREEN);
        }
        
    }
    public static void main(String[] args)
    {
        button b = new button();
    }
}
