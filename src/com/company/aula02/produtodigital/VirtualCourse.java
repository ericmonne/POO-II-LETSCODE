package com.company.aula02.produtodigital;

import java.util.ArrayList;

public class VirtualCourse extends DigitalProduct implements ICourse{
    String school;
    private boolean isLoggedIn;
    String[] teachers;
    ArrayList<String> students;
    ArrayList<String> attendances;
    public String identification;

    @Override
    public String getPublisherInfo() {
        return school;
    }

    @Override
    public boolean getProductIsValid() {
        return isLoggedIn;
    }

    @Override
    public String getTeacher() {
        String teachersString = "";
        for(String teacher : teachers){
            teachersString += teacher + ", ";
        }

        return teachersString;
    }

    @Override
    public String listStudents() {
        String studentList = "";
        for(String student: students){
            studentList += student + ", ";
        }

        return studentList;
    }

    @Override
    public String getAttendances() {
        String attendancesList = "";
        for(String student : attendances){
            attendancesList += student += ", ";
        }
        return attendancesList;
    }
}
