package nguyenthanhnhat_0841;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Course implements ICourse {

    private String id;
    private double feePerStudent;
    private Date startDate;
    private boolean isAvailable;
    private int enrolledStudents;

    public Course() {
    }

    public Course(String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        this.id = id;
        this.feePerStudent = feePerStudent;
        this.startDate = startDate;
        this.isAvailable = isAvailable;
        this.enrolledStudents = enrolledStudents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getFeePerStudent() {
        return feePerStudent;
    }

    public void setFeePerStudent(double feePerStudent) {
        this.feePerStudent = feePerStudent;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(int enrolledStudent) {
        this.enrolledStudents = enrolledStudent;
    }

    @Override
    public void addCourse() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter ID: ");
            setId(sc.nextLine());

            System.out.print("Enter fee per student: ");
            setFeePerStudent(sc.nextDouble());
            sc.nextLine();

            System.out.print("Enter start date (dd/MM/yyyy): ");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            setStartDate(sdf.parse(sc.nextLine()));

            System.out.print("Enter available (true/false): ");
            setIsAvailable(Boolean.parseBoolean(sc.nextLine()));

            System.out.print("Enter enrolled student: ");
            setEnrolledStudents(sc.nextInt());
            sc.nextLine();

        } catch (ParseException ex) {
            System.out.println("Invalid date format! Please enter dd/MM/yyyy.");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number format!");
        }
    }

    @Override
    public void updateCourse() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Updated fee per student: ");
            setFeePerStudent(sc.nextDouble());
            sc.nextLine();

            System.out.print("Updated start date (dd/MM/yyyy): ");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            setStartDate(sdf.parse(sc.nextLine()));

            System.out.print("Updated available (true/false): ");
            setIsAvailable(Boolean.parseBoolean(sc.nextLine()));

            System.out.print("Updated enrolled student: ");
            setEnrolledStudents(sc.nextInt());
            sc.nextLine();

        } catch (ParseException ex) {
            System.out.println("Invalid date format! Please enter dd/MM/yyyy.");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number format!");
        }
    }

    @Override
    public void displayDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: " + getId());
        System.out.println("Fee per student: " + getFeePerStudent());
        System.out.println("Start date: " + sdf.format(getStartDate()));
        System.out.println("Available: " + isIsAvailable());
        System.out.println("Enroll student: " + getEnrolledStudents());
    }

}
