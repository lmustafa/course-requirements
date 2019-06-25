import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseFrame extends JFrame {

    private JButton buttonCounter, buttonReset;
    private JLabel labelCount;

    private int clicks = 0;

    public CourseFrame() {
        createView();

        setTitle("Click Me");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        //setResizable(false);
    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        labelCount = new JLabel();
        labelCount.setPreferredSize(new Dimension(200,300));
        panel.add(labelCount);
        updateCounter();

        buttonCounter = new JButton("Click me");
        buttonCounter.addActionListener(
                new ButtonCounterActionListener());
        panel.add(buttonCounter);

        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        clicks = 0;
                        updateCounter();
                        new NewFrame().setVisible(true);
                    }
                }
        );
        panel.add(buttonReset);
    }

    private void updateCounter() {
        labelCount.setText("Clicked " + clicks + " times");
    }

    private class ButtonCounterActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clicks++;
            updateCounter();
        }
    }
}
