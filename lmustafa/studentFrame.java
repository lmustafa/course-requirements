import javax.swing.*;

public class studentFrame extends JFrame{

    private JButton buttonExistingStudent, buttonCreateNewStudent;

    public studentFrame() {

        createView();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(900,500);
        //pack();
        setLocationRelativeTo(null);
        setResizable(true);
    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        buttonExistingStudent = new JButton("Student Exists");
        buttonExistingStudent.addActionListener(
                new firstFrame.studentExists());
        panel.add(buttonExistingStudent);

        buttonCreateNewStudent = new JButton("Create New Student");
        buttonCreateNewStudent.addActionListener( new firstFrame.createNewStudentFrame());
        panel.add(buttonCreateNewStudent);
    }
}
