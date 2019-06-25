import univ.Course;

import java.util.ArrayList;

public abstract class Degree {
    String title;
    ArrayList<String> listOfRequiredCourseCodes;  //this should probably be an ArrayList<univ.Course>

    public Degree() {
        this.title = null;
        this.listOfRequiredCourseCodes = new ArrayList<>();
    }

    //delete saveState

    public void setDegreeTitle(String title) {
        if (title != null && !title.isEmpty())
            this.title = title;
    }
    public String getDegreeTitle() { return this.title; }

    public void setRequiredCourses(ArrayList<String> listOfRequiredCourseCodes) {
        if (listOfRequiredCourseCodes != null && !listOfRequiredCourseCodes.isEmpty())
            this.listOfRequiredCourseCodes = listOfRequiredCourseCodes;
    }


    public ArrayList<Course> getRequiredCourses()
    {
        /*
        ArrayList<univ.Course> getRequiredCourses() {
        ArrayList<univ.Course> requiredCourses = new ArrayList<>();

        for(String code : listOfRequiredCourseCodes) {
            univ.Course course = new univ.Course();
            course.setCourseGrade(code);
            requiredCourses.add(course);
        }

        //make an arraylist of courses using array of coursecodes..should be searching something, the course catalog
        return requiredCourses;
         */

        //needs to be implemented.
        /***algorithm
         for each course code in listOfRequiredCourseCodes:
         find the course in the course catalog
         add the found course to an arraylist
         return the arraylist

         **/

        return new ArrayList<Course>();
    }

    public abstract boolean meetsRequirements(ArrayList<Course> allTheCoursesPlannedAndTaken);
    public abstract double numberOfCreditsRemaining(ArrayList<Course> allTheCoursesPlannedAndTaken);
    public abstract ArrayList<Course> remainingRequiredCourses();

    @Override
    public abstract String toString();
    @Override
    public abstract boolean equals(Object o);
    @Override
    public abstract int hashCode();

}