/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package limeeditor;

import java.util.Hashtable;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Samitha
 */
public class LimeEditor extends JFrame{

private JTextComponent textComp;
private Hashtable actionHash = new Hashtable();
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public LimeEditor(){
        super("Swing Editor Samitha");
        textComp = createTextComponent();
    }
    
         // Create the JTextComponent subclass.
    protected JTextComponent createTextComponent(){
        JTextArea ta = new JTextArea();
        ta.setLineWrap(true);
        return ta;
    }
}
