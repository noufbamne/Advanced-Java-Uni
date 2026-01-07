import java.awt.*;
public class Card_Layout extends Frame {
    Card_Layout(){
        // setDefaultCloseOperation(EXIT_ON_CLOSE); 
        Button b1 = new Button("sourav");
        add(b1);
        Button b2 = new Button("Aryan");
        add(b2);
        Button b3 = new Button("Nouf");
        add(b3);
        setLayout(new CardLayout(50,50));
        setVisible(true);
    
          
    }
    public static void main(String[] args) {
        Card_Layout obj = new Card_Layout();
    }
}
