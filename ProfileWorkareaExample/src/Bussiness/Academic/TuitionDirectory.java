/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness.Finance;

import Business.Profiles.StudentProfile;
import java.util.ArrayList;

/**
 * Directory for managing all tuition invoices and payments.
 */
public class TuitionDirectory {

    private ArrayList<TuitionInvoice> invoiceList;

    public TuitionDirectory() {
        invoiceList = new ArrayList<>();
    }

    public TuitionInvoice createInvoice(StudentProfile student, double amount, String term) {
        TuitionInvoice invoice = new TuitionInvoice(student, amount, term);
        invoiceList.add(invoice);
        student.addTuitionCharge(amount);
        return invoice;
    }

    public ArrayList<TuitionInvoice> getInvoicesByStudent(StudentProfile student) {
        ArrayList<TuitionInvoice> results = new ArrayList<>();
        for (TuitionInvoice ti : invoiceList) {
            if (ti.getStudent().equals(student)) {
                results.add(ti);
            }
        }
        return results;
    }

    public void markInvoicePaid(TuitionInvoice ti) {
        if (ti != null && !ti.isPaid()) {
            ti.markPaid();
        }
    }

    public ArrayList<TuitionInvoice> getInvoiceList() {
        return invoiceList;
    }

    public double getTotalTuitionCollected() {
        double sum = 0.0;
        for (TuitionInvoice ti : invoiceList) {
            if (ti.isPaid()) {
                sum += ti.getAmount();
            }
        }
        return sum;
    }

    public double getOutstandingTuition() {
        double sum = 0.0;
        for (TuitionInvoice ti : invoiceList) {
            if (!ti.isPaid()) {
                sum += ti.getAmount();
            }
        }
        return sum;
    }
}

