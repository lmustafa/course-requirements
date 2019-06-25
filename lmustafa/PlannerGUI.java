import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlannerGUI extends JFrame {

    private JButton buttonStudent, buttonCreateNewStudent;

    public PlannerGUI() {
        createView();

        setTitle("Planner");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,300);
        //pack();
        setLocationRelativeTo(null);
        //setResizable(false);
    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        buttonStudent = new JButton("Student");
        buttonStudent.addActionListener(
                new enterStudentInfo());
        panel.add(buttonStudent);

        buttonCreateNewStudent = new JButton("Create New Student");
        buttonCreateNewStudent.addActionListener(new createNewStudent());
        panel.add(buttonCreateNewStudent);
    }

    private class enterStudentInfo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class createNewStudent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

}
