package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
         frame.pack();
        frame.setVisible(true);
        
    }
    
    public void createComponents(Container container){
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
         
        container.add(new JLabel("Are you?"));
        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
        container.add(yes);
        container.add(no);
        
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(yes);
        buttonGroup1.add(no);
        
        container.add(new JLabel("Why?"));
        JRadioButton nr = new JRadioButton("No reason.");
        JRadioButton bf = new JRadioButton("Because it is fun!");
        container.add(nr);
        container.add(bf);
        
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(nr);
        buttonGroup2.add(bf);
        
        container.add(new JButton("Done!"));
        
    }


    public JFrame getFrame() {
        return frame;
    }
}
