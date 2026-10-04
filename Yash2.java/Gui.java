import java.awt.*;
public class Gui extands Frame {
    public Gui(){
        Frame f=new Frame();
        Button b=new Button(10,10,10);
        TextField f=new TextField(20,20,20);
        f.add(b);
        f.add(f);
        f.setVisible(true);
        f.setLayout(Null);
    }
    public static void main(String[] args){
        Gui g=new Gui();
    }
}
