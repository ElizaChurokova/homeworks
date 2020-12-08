package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Lesson {
    LocalDate localDate;
    Student[] student;
    LocalTime startTime;
    boolean taskGiven;
    boolean examDone;

    public Lesson(){}

    public Lesson(LocalDate localDate, Student[] student, LocalTime startTime, boolean taskGiven, boolean examDone){
        this.localDate = localDate;
        this.student = student;
        this.startTime = startTime;
        this.taskGiven = taskGiven;
        this.examDone = examDone;
    }

    @Override
    public String toString(){
        String message = "This lesson starts at " + this.startTime + ". " + student.length + " students participated at this lesson";
        return message;
    }


    public void setLocalDate(LocalDate localDate){
        this.localDate = localDate;
    }
    public LocalDate getLocalDate(){
        return localDate;
    }

    public void setStudent(Student[] student){
        this.student = student;
    }
    public Student[] getStudent(){
        return student;
    }

    public void setStartTime(LocalTime startTime){
        this.startTime = startTime;
    }
    public LocalTime getStartTime(){
        return startTime;
    }

    public void setTaskGiven(boolean taskGiven){
        this.taskGiven = taskGiven;
    }
    public boolean getTaskGiven(){
        return taskGiven;
    }

    public void setExamDone(boolean examDone){
        this.examDone = examDone;
    }
    public boolean getExamDone(){
        return examDone;
    }





    //LocalDate Localdate = LocalDate.of(int year; int month; int date);


}
