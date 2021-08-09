package com.example.recyclerview;

public class RecyclerPojoClass {
    private String studentName;
    private String studentRollNumber;

    RecyclerPojoClass(String studentName,String studentRollNumber){
        this.studentName=studentName;
        this.studentRollNumber=studentRollNumber;
    }

    public String getName(){
        return studentName;
    }
    public String getRoll(){
        return studentRollNumber;
    }

    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public void setStudentRollNumber(String studentRollNumber){
        this.studentRollNumber=studentRollNumber;
    }
}