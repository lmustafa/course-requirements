import univ.Course;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class firstFrame extends JFrame {


    private static Student student;
    private static String courseCode;
    private String semester;
    private String grade;
    private String courseStatus;
    private static Degree degree;
    private ArrayList<Course> transcriptList = new ArrayList<>();
    private static ArrayList<Course>courseList = new ArrayList<>();


    private JButton buttonPlanner, buttonAdministrator;

    public firstFrame() {

        createView();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900,500);
        //pack();
        setLocationRelativeTo(null);
        setResizable(true);
    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        buttonPlanner = new JButton("Planner");
        buttonPlanner.addActionListener(
                new callStudentFrame());
        panel.add(buttonPlanner);

        buttonAdministrator = new JButton("Administrator");
        panel.add(buttonAdministrator);
    }

    public static class chooseNewDegree implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String temp = frameNewStudent.fieldDegree.getText();
            if(temp.equalsIgnoreCase("BCG")) {
                degree = new BCG();
            }
            else if(temp.equalsIgnoreCase("CS")) {
                //degree = new CS DEGREE
            }
            else if(temp.equalsIgnoreCase("SEND")) {
                //degree = new SEND DEGREE
            }
        }
    }

    public static class studentExists implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new CourseGUI().setVisible(true);
        }
    }

    public static class createNewStudentFrame implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new frameNewStudent().setVisible(true);
        }
    }

    /***/

    public static class creditsCompleted implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println(courseCode);
            DegreeInfoGUI.field.setText("");
            /* field.setText("17"); */
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

    public static class addCourse implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Course course = new Course();
            //add exception
            course.setCourseCode(CourseGUI.fieldCourse.getText());
            course.setCourseTitle(CourseGUI.fieldTitle.getText());
            course.setCourseStatus(CourseGUI.fieldStatus.getText());

            courseList.add(course);
        }
    }

    public static class deleteCourse implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String temp = CourseGUI.fieldCourseDelete.getText();

            for(Course c : courseList) {
                if(temp.equalsIgnoreCase(c.getCourseCode())) {
                    //
                }
            }

        }
    }

    public static class changeGrade implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String temp = CourseGUI.fieldCourseCodeChange.getText();

            for(Course c : courseList) {
                if(temp.equalsIgnoreCase(c.getCourseCode())) {
                    //c.setCourseG
                }
            }
        }
    }

    public static class showDegreeInformation implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new DegreeInfoGUI().setVisible(true);
        }
    }

    public static class createNewStudent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
                student = new Student();
                student.setFirstName(frameNewStudent.fieldFirstName.getText());
                student.setLastName(frameNewStudent.fieldLastName.getText());
            //save somewhere
        }
    }


    private class callStudentFrame implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new studentFrame().setVisible(true);
        }
    }
}
