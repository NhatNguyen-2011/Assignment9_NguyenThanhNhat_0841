package nguyenthanhnhat_0841;

import java.util.ArrayList;

public class CourseArrayList {

    ArrayList<Course> courses = new ArrayList<>();

    public void addCourseToArrayList(Course course) {
        courses.add(course);
    }

    public Course findCourseById(String id) {
        for (Course course : courses) {
            if (course.getId().equals(id)) {
                return course;
            }
        }
        return null;
    }

    public void updateCourseById(String id) {
        Course course = findCourseById(id);
        if (course != null) {
            course.updateCourse();
            System.out.println("Updated SuccessFully!");
        } else {
            System.out.println("Error!");
        }
    }

    public void deleteCourseById(String id) {
        Course course = findCourseById(id);
        if (course != null) {
            courses.remove(course);
            System.out.println("Remove Successfully!");
        } else {
            System.out.println("Error!");
        }
    }

    public void displayAllCourses() {
        for (Course course : courses) {
            course.displayDetails();
        }
    }

    public void displayAvailableCourses() {
        for (Course course : courses) {
            if (course.isIsAvailable() == true) {
                course.displayDetails();
            }
        }
    }

    public double calculateTotalFees() {
        if (courses.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Course course : courses) {
            sum += course.calculateTotalFee();
        }
        return sum;
    }
}
