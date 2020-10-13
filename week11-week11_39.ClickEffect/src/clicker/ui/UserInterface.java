package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calc;
    public UserInterface(Calculator calc){
        this.calc = calc;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());

        JLabel nameText = new JLabel("0");
        JButton addButton = new JButton("Click");
        
        ClickListener listener = new ClickListener(calc, nameText );
        addButton.addActionListener(listener);

        container.add(nameText, BorderLayout.NORTH);
        container.add(addButton, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
