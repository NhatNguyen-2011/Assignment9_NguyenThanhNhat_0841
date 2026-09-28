package nguyenthanhnhat_0841;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        CourseArrayList courseList = new CourseArrayList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========== COURSE MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add a new Online Course");
            System.out.println("2. Add a new Offline Course");
            System.out.println("3. Update a course by ID");
            System.out.println("4. Delete a course by ID");
            System.out.println("5. Display all courses");
            System.out.println("6. Display open/available courses");
            System.out.println("7. Calculate total fees for all courses");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    System.out.println("\n--- Add Online Course ---");
                    OnlineCourse onlineCourse = new OnlineCourse();
                    onlineCourse.addCourse();
                    courseList.addCourseToArrayList(onlineCourse);
                    break;

                case 2:
                    System.out.println("\n--- Add Offline Course ---");
                    OfflineCourse offlineCourse = new OfflineCourse();
                    offlineCourse.addCourse();
                    courseList.addCourseToArrayList(offlineCourse);
                    break;

                case 3:
                    System.out.print("\nEnter Course ID to update: ");
                    String updateId = sc.nextLine();
                    courseList.updateCourseById(updateId);
                    break;

                case 4:
                    System.out.print("\nEnter Course ID to delete: ");
                    String deleteId = sc.nextLine();
                    courseList.deleteCourseById(deleteId);
                    break;

                case 5:
                    System.out.println("\n--- ALL COURSES ---");
                    courseList.displayAllCourses();
                    break;

                case 6:
                    System.out.println("\n--- AVAILABLE COURSES ---");
                    courseList.displayAvailableCourses();
                    break;

                case 7:
                    double totalFees = courseList.calculateTotalFees();
                    System.out.println("\nTotal Fees for all courses: " + totalFees);
                    break;

                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
