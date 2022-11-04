package com.bridgelabz.hospitalmanagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hospital {
    private String hospitalName;
    private String department;
    public String getHospitalName(){
        return hospitalName;
    }
    public void setHospitalName(){
        this.hospitalName = hospitalName;
    }
    public String getdepartment(){
        return department;
    }
    public void setDepartment(){
        this.department = department;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    Scanner sc = new Scanner(System.in);
    public Map<String, Hospital> List = new HashMap<String, Hospital>();

}
