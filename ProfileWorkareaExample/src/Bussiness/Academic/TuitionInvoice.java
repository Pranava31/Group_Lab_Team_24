/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness.Finance;

import Business.Profiles.StudentProfile;

/**
 * Represents a tuition invoice generated when a student enrolls in a course.
 */
public class TuitionInvoice {

    private StudentProfile student;
    private double amount;
    private boolean paid;
    private String term;

    public TuitionInvoice(StudentProfile student, double amount, String term) {
        this.student = student;
        this.amount = amount;
        this.term = term;
        this.paid = false;
    }

    // ======== Getters ========
    public StudentProfile getStudent() {
        return student;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return paid;
    }

    public String getTerm() {
        return term;
    }

    // ======== Methods ========
    public void markPaid() {
        this.paid = true;
        student.payTuition(amount);
    }

    public void refund() {
        if (paid) {
            student.payTuition(-amount);
            paid = false;
        }
    }

    @Override
    public String toString() {
        return student.getPerson().getName() + " | Term: " + term + " | $" + amount + " | Paid: " + paid;
    }
}
