import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.Flow;

public class CourseGUI extends JFrame {
    //fields

    /*private static Student student;
    private static String courseCode;
    private String semester;
    private String grade;
    private String courseStatus;
    private Degree degree;
    private ArrayList<univ.Course>transcriptList = new ArrayList<>();
    private ArrayList<univ.Course>courseList = new ArrayList<>();*/

    public static JButton buttonNumOfCreditsCompleted;
    public static JButton buttonNumOfCreditsRemaining;
    public static JButton buttonMetRequirement;
    public static JButton buttonViewPlan; //organized by the semester I have, or plan to, take the courses
    public static JButton buttonViewGPA;
    public static JButton buttonCisCourses;
    public static JButton buttonRecent10Credits;

    public static JButton buttonStudent;

    public static JButton buttonAdd;
    public static JButton buttonDelete;
    public static JButton buttonChangeGrade;
    public static JButton buttonFindStudent;

    public static JTextField field;


    public static JTextField fieldCourse;
    public static JTextField fieldTitle;
    public static JTextField fieldStatus;
    public static JTextField fieldCredit;

    public static JTextField fieldFirstName;
    public static JTextField fieldLastName;

    public static JTextField fieldCourseDelete;
    public static JTextField fieldTitleDelete;
    public static JTextField fieldStatusDelete;
    public static JTextField fieldCreditDelete;

    public static JTextField fieldCourseCodeChange;
    public static JTextField fieldNewGrade;


    //private JLabel tempLabel;
    private static JLabel labelAddInstruction;
    private static JLabel labelDeleteInstruction;
    private static JLabel labelChangeGrade;
    private static JLabel labelStudentInfo;

    private static JButton buttonDegreeInformation;
    private static JLabel  labelDegreeInforamtion;


    public CourseGUI() {
        createView();

        setTitle("univ.Course Information");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(900,500);
        //pack();
        setLocationRelativeTo(null);
        setResizable(true);
        //System.out.println("HELLO");
//        for(univ.Course c : courseList) {
//            System.out.println(c.getCourseCode());
//        }
       // System.out.println(courseStatus);
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


        buttonFindStudent = new JButton("Find Student");
        panelForm.add(buttonFindStudent);
        c.gridx++;

        c.gridy++;
        c.gridx = 0;

        labelAddInstruction = new JLabel("Enter univ.Course Information");
        panelForm.add(labelAddInstruction,c);
        c.gridx++;

        fieldCourse = new JTextField("univ.Course",10);
        panelForm.add(fieldCourse,c);
        c.gridx++;

        fieldTitle = new JTextField("Title",10);
        panelForm.add(fieldTitle,c);
        c.gridx++;

        fieldStatus = new JTextField("Status",10);
        panelForm.add(fieldStatus,c);
        c.gridx++;

        fieldCredit = new JTextField("Credit",10);
        panelForm.add(fieldCredit,c);
        c.gridx++;

        buttonAdd = new JButton("Add");
        buttonAdd.addActionListener(new firstFrame.addCourse());
        panelForm.add(buttonAdd,c);

        c.gridy++;
        c.gridx = 0;

        labelAddInstruction = new JLabel("Enter univ.Course Information");
        panelForm.add(labelAddInstruction,c);
        c.gridx++;

        fieldCourseDelete = new JTextField("univ.Course",10);
        panelForm.add(fieldCourseDelete,c);
        c.gridx++;

        fieldTitleDelete = new JTextField("Title",10);
        panelForm.add(fieldTitleDelete,c);
        c.gridx++;

        fieldStatusDelete = new JTextField("Status",10);
        panelForm.add(fieldStatusDelete,c);
        c.gridx++;

        fieldCreditDelete = new JTextField("Credit",10);
        panelForm.add(fieldCreditDelete,c);
        c.gridx++;

        buttonDelete = new JButton("Delete");
        buttonDelete.addActionListener(new firstFrame.deleteCourse());
        panelForm.add(buttonDelete,c);

        c.gridy++;
        c.gridx = 0;

        labelChangeGrade = new JLabel("Enter univ.Course Code to Change Grade");
        panelForm.add(labelChangeGrade,c);
        c.gridx++;

        fieldCourseCodeChange = new JTextField("univ.Course",10);
        panelForm.add(fieldCourseCodeChange,c);
        c.gridx++;

        fieldNewGrade = new JTextField("New Grade",10);
        panelForm.add(fieldNewGrade,c);
        c.gridx++;

        buttonChangeGrade = new JButton("Change Grade");
        buttonChangeGrade .addActionListener(new firstFrame.changeGrade());
        panelForm.add(buttonChangeGrade,c);
        c.gridx++;

        c.gridy++;
        c.gridx = 0;

        labelDegreeInforamtion = new JLabel("View Degree Information");
        panelForm.add(labelDegreeInforamtion,c);
        c.gridx++;

        buttonDegreeInformation = new JButton("Degree Information");
        buttonDegreeInformation.addActionListener(new firstFrame.showDegreeInformation());
        panelForm.add(buttonDegreeInformation,c);
        c.gridx++;

        c.gridy++;
        c.gridx = 0;

    }
/*
    public static class creditsCompleted implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println(courseCode);
            DegreeInfoGUI.field.setText("");
            //System.out.println("HEY");
            //clearField();
        }
    }

    private void clearField() {
        //field.setText("");
    }

    public static class creditsRemaining implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static class requirementsMet implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static class metRequirements implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static class viewGPA implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static class cisGPA implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static class tenRecentGPA implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class addCourse implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            univ.Course course = new univ.Course();
            //add exception
            course.setCourseCode(fieldCourse.getText());
            course.setCourseTitle(fieldTitle.getText());
            course.setCourseStatus(fieldStatus.getText());
            course.setCourseCredit(Double.parseDouble(fieldCredit.getText()));

            courseList.add(course);
        }
    }

    private class deleteCourse implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String temp = fieldCourseDelete.getText();

            for(univ.Course c : courseList) {
                if(temp.equalsIgnoreCase(c.getCourseCode())) {
                    courseList.remove(c);
                }
            }

        }
    }

    private class changeGrade implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String temp = fieldCourseCodeChange.getText();

            for(univ.Course c : courseList) {
                if(temp.equalsIgnoreCase(c.getCourseCode())) {
                    //c.setCourseG
                }
            }
        }
    }

    private class showDegreeInformation implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new DegreeInfoGUI().setVisible(true);
        }
    }*/
}

/*• view a list of *required* courses that are *not* represented in my transcript
        • view the number of credits I must add to my plan of study in order to have a plan that
        allows me to complete my degree.
        • view a list of the prerequisite courses for any required course for my degree and major.
        • view a list of prerequisite courses that I must take in order to take the courses currently in
        my plan of study.
        • view the number of credits I have completed in my program
        • view the number of credits I have remaining to complete my program
        • determine if I have met the completion requirements of my chosen degree
        • view my course plan, organized by the semester I have, or plan to, take the courses
        • view my overall GPA
        • view my GPA for CIS courses
        • view my GPA for my most recent 10 credits */