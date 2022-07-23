package programs.gui;
import javax.swing.JOptionPane;

public class guiinput {
    public static void main(String[] args) {
        
    
    String name= JOptionPane.showInputDialog("your name please");
    JOptionPane.showMessageDialog(null, name+" "+"you're a" +" " + "gay");
    int age = Integer.parseInt(JOptionPane.showInputDialog( "your age bro"));
    JOptionPane.showMessageDialog(null, "stfu" +" "+age+" "+"years old kiddo");

    }
}
