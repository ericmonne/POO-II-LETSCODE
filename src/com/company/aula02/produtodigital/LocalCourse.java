package com.company.aula02.produtodigital;

public class LocalCourse extends DigitalProduct implements ICourse {
    String school;
    String ownership;
    String teacher;
    String[] students;
    boolean[] attendances;
    public String identification;

    @Override
    public String getTeacher() {
        return teacher;
    }

    @Override
    public String listStudents() {
        String studentsString = "";
        for (String student : students){
            studentsString += student + ", ";
        }
        return studentsString;
    }

    @Override
    public String getAttendances() {
       String attendancesString = "";
        for (int i = 0; i < attendances.length; i++) {
            if(attendances[i]){
                attendancesString += students[i] + ", ";
            }
        }
       return attendancesString;
    }

    @Override
    public String getPublisherInfo() {
        return school;
    }

    @Override
    public boolean getProductIsValid() {
        return identification.equals(ownership);
    }
}
