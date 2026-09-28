package nguyenthanhnhat_0841;

import java.util.Date;
import java.util.Scanner;

public class OfflineCourse extends Course {

    private String classroomNumber;
    private double materialFeePerStudent;

    public OfflineCourse() {
    }

    public OfflineCourse(String classroomNumber, double materialFeePerStudent, String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        super(id, feePerStudent, startDate, isAvailable, enrolledStudents);
        this.classroomNumber = classroomNumber;
        this.materialFeePerStudent = materialFeePerStudent;
    }

    public String getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public double getMaterialFeePerStudent() {
        return materialFeePerStudent;
    }

    public void setMaterialFeePerStudent(double materialFeePerStudent) {
        this.materialFeePerStudent = materialFeePerStudent;
    }

    @Override
    public void addCourse() {
        super.addCourse();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter classroom number: ");
        setClassroomNumber(sc.nextLine());
        System.out.print("Enter material fee per student: ");
        setMaterialFeePerStudent(sc.nextDouble());
    }

    @Override
    public void updateCourse() {
        super.updateCourse();
        Scanner sc = new Scanner(System.in);
        System.out.print("Update classroom number: ");
        setClassroomNumber(sc.nextLine());
        System.out.print("Update material fee per student: ");
        setMaterialFeePerStudent(sc.nextDouble());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Classroom number: " + getClassroomNumber());
        System.out.println("Material fee per student: " + getMaterialFeePerStudent());
    }

    public double calculateTotalFee() {
        return (getFeePerStudent() * getMaterialFeePerStudent()) * getEnrolledStudents();
    }

}
