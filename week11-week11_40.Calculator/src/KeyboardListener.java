
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

public class KeyboardListener implements KeyListener{
    
    
    private Component component;
    private JTextField jt;
    
    public KeyboardListener(JTextField jt){
        this.jt=jt;
        this.component = component;
        
    }
    
    @Override
    public void keyPressed(KeyEvent e){
       System.out.println("Keystroke " + e.getKeyCode() +  " pressed.");
        
        if(e.getKeyCode() == KeyEvent.VK_R){
            jt.setText("");
           
            
        }
        
    }
    
    @Override
    public void keyReleased(KeyEvent e){

    }
    
    @Override
    public void keyTyped(KeyEvent e){

    }
    
}
