package nguyenthanhnhat_0841;

import java.util.Date;
import java.util.Scanner;

public class OnlineCourse extends Course {

    private String platFormName;
    private double discountPerccent;

    public OnlineCourse() {
    }

    public OnlineCourse(String platFormName, double discountPerccent, String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        super(id, feePerStudent, startDate, isAvailable, enrolledStudents);
        this.platFormName = platFormName;
        this.discountPerccent = discountPerccent;
    }

    public String getPlatFormName() {
        return platFormName;
    }

    public void setPlatFormName(String platFormName) {
        this.platFormName = platFormName;
    }

    public double getDiscountPerccent() {
        return discountPerccent;
    }

    public void setDiscountPerccent(double discountPerccent) {
        this.discountPerccent = discountPerccent;
    }

    @Override
    public void addCourse() {
        super.addCourse();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter platform name: ");
        setPlatFormName(sc.nextLine());
        System.out.print("Enter discount percent: ");
        setDiscountPerccent(sc.nextDouble());
    }

    @Override
    public void updateCourse() {
        super.updateCourse();
        Scanner sc = new Scanner(System.in);
        System.out.print("Update platform name: ");
        setPlatFormName(sc.nextLine());
        System.out.print("Update discount percent: ");
        setDiscountPerccent(sc.nextDouble());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform name: " + getPlatFormName());
        System.out.println("Discount percent: " + getDiscountPerccent());
    }

    public double calculateTotalFee() {
        return getFeePerStudent() * getEnrolledStudents() * (1 - getDiscountPerccent() / 100);
    }

}
