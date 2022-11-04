package com.bridgelabz.hospitalmanagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    enum Department {
        ONCOLOGY,
        NEUROLOGY,
        CARDIOLOGY,
        GYNECOLOGY
    }
public class Patient {

    private String name;
    private String age;
    private String phoneNo;
    private String city;
    private String state;
    private Department dept;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public Department getDept() {
        switch (dept) {
            case ONCOLOGY:
                System.out.println("Patient having cancer and treatment is ongoing.");
                break;
            case NEUROLOGY:
                System.out.println("Patient having diseases of brain and treatment is ongoing.");
                break;
            case CARDIOLOGY:
                System.out.println("Patient having diseases of heart and treatment is ongoing.");
                break;
            case GYNECOLOGY:
                System.out.println("Patient having diseases of human reproductive system and treatment is ongoing.");
                break;
            default:
                System.out.println("Patient having other diseases");
                break;
        }
        return null;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", dept=" + dept +
                '}';
    }

    static Patient patient = new Patient();
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, String> list = new HashMap<>();

    public static void addPatient() {
        System.out.println("Enter Name :");
        patient.setName(sc.next());
        System.out.println("Enter Age:");
        patient.setAge(sc.next());
        System.out.println("Enter PhoneNumber :");
        patient.setPhoneNo(sc.next());
        System.out.println("Enter City :");
        patient.setCity(sc.next());
        System.out.println("Enter State:");
        patient.setState(sc.next());
        System.out.println("Enter Department:");
        patient.setDept(Department.valueOf(sc.next()));
        System.out.println("Enter Hospital Name :");
        list.put(sc.next(), list.get(patient));

    }

    public static void showDetails() {
        for (Map.Entry<String, String> entry : list.entrySet()) {
            System.out.println("-----------------------");
            System.out.println("Hospital Name : " + entry.getKey());
            System.out.println(patient);
            System.out.println("------------------------");
        }
    }

}