import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class inpudialog extends JFrame implements ActionListener{
    inpudialog(){
        setVisible(true);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout f = new FlowLayout();
        setLayout(f);

        JButton b1 = new JButton("Click Here");
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String str = JOptionPane.showInputDialog("Enter your name : ");

        if (str.length()>0){
            System.out.println("The name of user is" + str);
        }
    }
    public static void main(String[] args) {
        inpudialog obj = new inpudialog();
    }
}