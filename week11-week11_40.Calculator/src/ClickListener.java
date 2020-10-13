
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ClickListener implements ActionListener {

    private JTextField input;
    private JTextField output;
    private JButton jb;

    public ClickListener(JTextField input, JTextField output, JButton jb) {
        this.input = input;
        this.output = output;
        this.jb = jb;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        try {
            /*if(input.getText().equals("r")){
                input.setText("");
            }*/
            Integer.parseInt(input.getText());
            int j = Integer.parseInt(input.getText());
            int i = j + Integer.parseInt(output.getText());
            output.setText(Integer.toString(i));
            input.setText("");
            jb.setEnabled(true);
        } catch (NumberFormatException ex) {
            input.setText("");

        }

    }

}
