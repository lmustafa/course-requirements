import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frameNewStudent extends JFrame {

    private JButton buttonCreateStudent;

    private JButton buttonDegree;
    private JButton buttonBCS;
    private JButton buttonCS;
    private JButton buttonSENG;



    private JLabel labelStudentInfo;
    private JLabel labelChooseDegree;

    public static JTextField fieldFirstName;
    public static JTextField fieldLastName;
    public static JTextField fieldStudentNum;
    public static JTextField fieldDegree;

    public frameNewStudent() {
        createView();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(900,500);
        //pack();
        setLocationRelativeTo(null);
        setResizable(true);
    }

    private void createView() {
        JPanel panelMain = new JPanel();
        getContentPane().add(panelMain);

        JPanel panelForm = new JPanel(new GridBagLayout());
        panelMain.add(panelForm);

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;

        labelStudentInfo = new JLabel("Enter Student Information");
        panelForm.add(labelStudentInfo,c);
        c.gridx++;

        fieldFirstName = new JTextField("First Name",10);
        panelForm.add(fieldFirstName,c);
        c.gridx++;

        fieldLastName = new JTextField("Last Name",10);
        panelForm.add(fieldLastName,c);
        c.gridx++;

        fieldStudentNum = new JTextField("Student Number",10);
        panelForm.add(fieldStudentNum,c);
        c.gridx++;

        buttonCreateStudent = new JButton("Create Student");
        buttonCreateStudent.addActionListener(new firstFrame.createNewStudent());
        panelForm.add(buttonCreateStudent,c);
        c.gridx++;

        c.gridy++;
        c.gridx = 0;

        labelChooseDegree = new JLabel("Choose Degree");
        panelForm.add(labelChooseDegree,c);
        c.gridx++;

        fieldDegree = new JTextField("Degree",10);
        panelForm.add(fieldDegree,c);
        c.gridx++;

        buttonBCS = new JButton("Choose Degree");
        buttonBCS.addActionListener(new firstFrame.chooseNewDegree());
        panelForm.add(buttonBCS,c);
        c.gridx++;

        c.gridy++;
        c.gridx = 0;
    }



}
