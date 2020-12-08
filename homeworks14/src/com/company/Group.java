package com.company;

import java.time.LocalDate;

public class Group {
    // •	Массив объектов «Студента»
    //        •	«Курс»
    //      •	Дата начала
// •	Длительность в месяцах

    Student[] student;
    String course;
    String startDate;
    int duration;

    public Group(){}
    public Group(Student[] student, String course, String startDate, int duration){
        this.student = student;
        this.course = course;
        this.startDate = startDate;
        this.duration = duration;
    }

    public void setStudent(Student[] student){
        this.student = student;
    }
    public Student[] getStudent(){
        return student;
    }

    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }

    public void setStartDate(String startDate){
        this.startDate = startDate;
    }
    public String getStartDate(){
        return startDate;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }
    public int getDuration(){
        return duration;
    }






}

