import univ.Course;

import java.util.ArrayList;

public class BCG extends GeneralDegree {
    protected static final double requiredNumberOfCredits = 15.00;


    BCG() {
        super();
    }

    @Override
    public boolean meetsRequirements(ArrayList<Course> allTheCoursesPlannedAndTaken) {
        return false;
    }

    @Override
    public double numberOfCreditsRemaining(ArrayList<Course> allTheCoursesPlannedAndTaken) {
        return 0;
    }

    @Override
    public ArrayList<Course> remainingRequiredCourses() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }


}
