import java.awt.*;

public class AWT extends Frame{
  AWT(){
    Label l=new Label("Username");
    l.setBounds(50,100,90,30);
    add(l);

    TextField t=new TextField();
    t.setBounds(160,100,90,30);
    t.setText("hello");
    add(t);

    Checkbox c1=new Checkbox("Technical");
    Checkbox c2=new Checkbox("Non-Technical");
    Checkbox c3=new Checkbox("Other");
    c1.setBounds(50,160,100,20);
    c2.setBounds(150,160,100,20);
    c3.setBounds(250,160,100,20);
    add(c1); 
    add(c2); 
    add(c3);

    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox c4=new Checkbox("Male",cbg,false);
    Checkbox c5=new Checkbox("Female",cbg,true);
    c4.setBounds(50,250,50,20);
    c5.setBounds(150,250,50,20);
    add(c4);
    add(c5);

    List l1 = new List(3,false);
    l1.add("CS"); l1.add("IT"); l1.add("Chem");
    l1.setBounds(50,50,100,50);
    add(l1);

    setSize(400,500);
    setVisible(true);

    Choice c = new Choice();
    c.add("AJP"); c.add("JSP"); c.add("CNS");
    c.setBounds(100,50,50,50);
    add(c);

    TextArea ta = new TextArea();
    ta.setBounds(50,150,50,50);
    add(ta);

    MenuBar mb = new MenuBar();
    Menu m1 = new Menu("File");
    Menu m2 = new Menu("Edit");
    MenuItem m11 = new MenuItem("New");
    MenuItem m22 = new MenuItem("Open");
    MenuItem m33 = new MenuItem("Save");
    MenuItem m44 = new MenuItem("Undo");
    MenuItem m55 = new MenuItem("Redo");
    m1.add(m11); m1.add(m22); m1.add(m33); 
    m2.add(m44); m2.add(m55);
    mb.add(m1); mb.add(m2);
    setMenuBar(mb);

  }  
  public static void main(String[] args) {
    AWT awt = new AWT();
  }
}