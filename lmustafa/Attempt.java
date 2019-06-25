import univ.Course;

public class Attempt {

    private String grade;
    private String semester;
    private Course theCourse;

    public Attempt() {
    }

    void setAttemptGrade(String grade)  {
        if (grade == null) {
            this.grade = null;
            return;
        }

        int gradeNum;
        try {
            gradeNum = Integer.parseInt(grade);
            if (gradeNum <= 100 && gradeNum >= 0) {
                this.grade = grade;
            }
        } catch (Exception ignored) {
            System.out.println("Grades must be between 0 and 100.");
        }
    }// a number, P, F, INC or MNR

    String getAttemptGrade() {
        return this.grade;
    }

    void setSemesterTaken(String semester) {
        if (semester != null && !semester.isEmpty()) {
            this.semester = semester;
        }
    }

    String getSemesterTaken() {
        return this.semester;
    }

    void setCourseAttempted(Course theCourse) {
        //if?
        theCourse = this.theCourse;
    }

    Course getCourseAttempted() {
        return this.theCourse;
    }


}
