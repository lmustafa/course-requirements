import java.util.ArrayList;
import univ.Course;

/**
 * The Student class implements a class that
 * allows the user to create a Student
 *
 * @author  Laiba Mustafa
 * @version 1.0
 * @since   2018-10-25
 */


public class Student {

    private String first;
    private String last;
    private Integer studentNum;
    private ArrayList<univ.Course> classesTaken = new ArrayList<>();
    private ArrayList<univ.Course> classesPlanToTake = new ArrayList<>();


    public Student() {
    }

    /**
     * This method is used to return the arrayList of Courses
     * @return ArrayList</> This returns the Courses
     */
     ArrayList<univ.Course>getClassesTaken() {
        return this.classesTaken;
    }

    /**
     * This method is used to return the arrayList of Courses
     * @return ArrayList</> This returns the Courses
     */
    ArrayList<univ.Course>getClassesPlanToTake()
    {
        return this.classesPlanToTake;
    }

    /**
     * This method is used to return the full name
     * @return String This returns the full name
     */
    String getFullName() {
        return first + " " + last;
    }

    /**
     * This method is used to set the value of the first name
     * @param first is the new value of the first variable
     */
    void setFirstName(String first) {
        this.first = first;
    }

    /**
     * This method is used to set the value of the last name
     * @param last is the new value of the last variable
     */
    void setLastName(String last) {
        this.last = last;
    }

    /**
     * This method is used to return the first name
     * @return String This returns the first name
     */
    String getFirstName() {
        return this.first;
    }

    /**
     * This method is used to return the last name
     * @return String This returns the last name
     */
    String getLastName() {
        return this.last;
    }

    /**
     * This method is used to set the value of the student number
     * @param studentNum is the new value of the student number
     */
    void setStudentNumber(Integer studentNum) {
        this.studentNum = studentNum;
    }

    /**
     * This method is used to return the student number
     * @return Integer This returns the student number
     */
    Integer getStudentNumber() {
        return this.studentNum;
    }

    /*Student will additionally need methods for getting and setting the Transcript and the Plan of
    Study for a student. Those methods can be defined by you. */

}
