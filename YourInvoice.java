package org.example;

import java.util.Scanner;

public class YourInvoice {
    public static void main(String[] args) {
        InvoiceGenerator ig = new InvoiceGenerator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Traveled Distance in KM");
        double distance = sc.nextInt();
        System.out.println("Enter the Time in hour");
        int time = sc.nextInt();
        System.out.println(ig.calculateFare(distance,time));
    }
}
