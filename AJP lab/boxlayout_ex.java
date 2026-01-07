import java.awt.*;
import javax.swing.*;
public class boxlayout_ex {

    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        panel.add(button1);
        panel.add(Box.createRigidArea(new Dimension(0, 20))); 
        panel.add(button2);
        panel.add(Box.createRigidArea(new Dimension(0, 20))); 
        panel.add(button3);

        frame.add(panel);

        frame.setVisible(true);
    }
}