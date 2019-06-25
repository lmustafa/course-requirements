import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DegreeInfoGUI extends JFrame {


    //public static JLabel field;
    private JButton buttonNumOfCreditsCompleted;
    private JButton buttonNumOfCreditsRemaining;
    private JButton buttonMetRequirement;
    private JButton buttonViewPlan; //organized by the semester I have, or plan to, take the courses
    private JButton buttonViewGPA;
    private JButton buttonCisCourses;
    private JButton buttonRecent10Credits;

    public static JTextField field;

    private int clicks = 0;

    public DegreeInfoGUI() {
        createView();

        setTitle("Click Me");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(900,500);
        //pack();
        setLocationRelativeTo(null);
        //setResizable(false);
    }

    private void createView() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        getContentPane().add(panel);

        //North
        JPanel panelNorth = new JPanel();
        panel.add(panelNorth,BorderLayout.NORTH);

        buttonNumOfCreditsCompleted = new JButton("Credits Completed");
        buttonNumOfCreditsCompleted.addActionListener(new firstFrame.creditsCompleted());
        panelNorth.add(buttonNumOfCreditsCompleted);

        buttonNumOfCreditsRemaining = new JButton("Credits Remaining");
        buttonNumOfCreditsRemaining.addActionListener(new firstFrame.creditsRemaining());
        panelNorth.add(buttonNumOfCreditsRemaining);

        buttonMetRequirement = new JButton("Requirements Met");
        buttonMetRequirement.addActionListener(new firstFrame.metRequirements());
        buttonMetRequirement.addActionListener(new firstFrame.requirementsMet());
        panelNorth.add(buttonMetRequirement);

        buttonViewGPA = new JButton("GPA");
        buttonViewGPA.addActionListener(new firstFrame.viewGPA());
        panelNorth.add(buttonViewGPA);

        buttonCisCourses = new JButton("GPA CIS");
        buttonCisCourses.addActionListener(new firstFrame.cisGPA());
        panelNorth.add(buttonCisCourses);

        buttonRecent10Credits = new JButton("GPA 10 Most Recent Credits");
        buttonRecent10Credits.addActionListener(new firstFrame.tenRecentGPA());
        panelNorth.add(buttonRecent10Credits);
        //

        JPanel panelCenter = new JPanel(new BorderLayout());
        panel.add(panelCenter,BorderLayout.CENTER);

        field = new JTextField();
        panelCenter.add(field,BorderLayout.CENTER);
    }
//
//    private class creditsCompleted implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            field.setText("17");
//            //clearField();
//        }
//    }
//
//    private void clearField() {
//        field.setText("");
//    }
//
//    private class creditsRemaining implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//        }
//    }
//
//    private class requirementsMet implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//        }
//    }
//
//    private class metRequirements implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//        }
//    }
//
//    private class viewGPA implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//        }
//    }
//
//    private class cisGPA implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//        }
//    }
//
//    private class tenRecentGPA implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//        }
//    }
}
