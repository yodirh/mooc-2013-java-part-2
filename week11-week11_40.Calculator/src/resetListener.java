
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;


public class resetListener implements ActionListener {
    
    private JTextField  output;
    private JButton jp;
    public resetListener( JTextField output, JButton jp){
        
        this.output =output;
        this.jp = jp;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        output.setText("0");
        jp.setEnabled(false);
         
    }
    
}
