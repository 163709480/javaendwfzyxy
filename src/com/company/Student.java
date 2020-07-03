package com.company;

public class Student {
    private String name;//学生姓名
    private String StudentNo;//学号
    private String classroom;//班级
    public void show(){
        System.out.println("姓名"+name);
        System.out.println("学号"+StudentNo);
        System.out.println("教室"+classroom);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNo() {
        return StudentNo;
    }

    public void setStudentNo(String studentNo) {
        StudentNo = studentNo;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }




    public Student(String name, String studentNo, String classroom) {
        this.name = name;
        this.StudentNo = studentNo;
        this.classroom = classroom;
    }
}


