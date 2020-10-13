
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {

    private JFrame frame;
    private JTextField text;
    private JTextField text2;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        this.text = new JTextField("0");
        text.setEnabled(false);

        this.text2 = new JTextField("0");

        container.add(text);
        container.add(text2);
        container.add(createPanel());
        text2.addKeyListener(new KeyboardListener(text2));
        //text2.setText("");
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 3));
        
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton zed = new JButton("Z");
        zed.setEnabled(false);

        ClickListener listener = new ClickListener(text2, text, zed);
        MinusListener minlis = new MinusListener(text2, text, zed);
        resetListener reset = new resetListener(text, zed);

        panel.add(plus);
        panel.add(minus);
        panel.add(zed);

        plus.addActionListener(listener);
        minus.addActionListener(minlis);
        zed.addActionListener(reset);

        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
