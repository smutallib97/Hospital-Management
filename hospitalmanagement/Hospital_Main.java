package com.bridgelabz.hospitalmanagement;

import java.util.Scanner;

public class Hospital_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();
        int ch;
        do {
            System.out.println("1. Add Patient Details \n2. Show Details \n3. Exit ");
            System.out.println("Enter choice :");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    Patient.addPatient();
                    break;
                case 2:
                    Patient.showDetails();
                    break;
                case 3:
                    System.out.println("Thank You Visit again!!!!");
                    break;
                default:
                    System.out.println("Enter Valid input");
                    break;
            }
        }while (ch != 3) ;
    }
}
