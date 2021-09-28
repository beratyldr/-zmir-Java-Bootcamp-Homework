package com.company.Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
    private String name;
    private Student[] students;
    private int capacity=40;
    private int numbersOfStudent=0;

    public Course(String name){
        this.name=name;
        students=new Student[capacity];
    }

    public Course(String name,int capacity){
        this.name=name;
        this.capacity=capacity;
        students= new Student[capacity];
    }

    public boolean addStudents(Student student){
        boolean containsStudent=false;

        if(students==null)
        {
            students[0]=student;
            numbersOfStudent++;
            return true;
        }
        if(students!=null) {
            for (Student item : students) {
                if(item!=null) {
                    if (student.getId() != item.getId()) {
                        containsStudent = true;
                    } else {
                        containsStudent = false;
                    }
                }
                else{
                    containsStudent=true;
                }
            }
        }

        if(containsStudent && numbersOfStudent<capacity){
            students[numbersOfStudent]=student;
            numbersOfStudent++;
            return true;
        }
        else {
            return false;
        }

    }
    public boolean dropStudent(Student student){
        if(students!=null) {
            for (int i = 0; i < students.length; i++) {
                if (student.getId() == students[i].getId()) {
                    List<Student> tempList = new ArrayList<Student>(Arrays.asList(students));
                    tempList.remove(i);
                    students = tempList.toArray(new Student[0]);
                    System.out.println("\nStudent drop from list\n");
                    numbersOfStudent--;
                    return true;
                }
            }
        }
        return false;
    }

    public void increaseCapacity(){

        capacity+=5;
        Student[] temp=Arrays.copyOf(students,capacity);
        students=temp;
        System.out.println("\nThe capacity of K129 is increased "+capacity+"\n");

    }
    public Student getBestStudent(){
        double maxGPA=0.0;
        int index=0;
        for (int i = 0; i < students.length; i++) {
            if(students[i]!=null){
                if(students[i].getGpa()>maxGPA){
                    maxGPA=students[i].getGpa();
                    index=i;
                }
            }
        }
        return students[index];
    }

    public Student getYoungestStudent(){
        int dif=0;
        int index=0;
        if(students!=null){
            for (int i = 0; i < students.length; i++) {
                for (int j = 0; j < students.length; j++) {
                      if(students[i]!=null &&students[j]!=null &&dif<students[i].getPd().getBirtDate().compareTo(students[j].getPd().getBirtDate())){
                           dif=students[i].getPd().getBirtDate().compareTo(students[j].getPd().getBirtDate());
                           index=i;
                      }
                }
            }
        }
        return students[index];
    }

    public void clear(){
        students=null;
    }
    public void list(){
        if(students!=null) {
            for (Student item : students) {
                if (item!=null){
                    System.out.println(item.toString());
                }
            }
        }
    }

    public String getCourseName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getNumbersOfStudent() {
        return numbersOfStudent;
    }

    @Override
    public String toString() {
        return "\nCourse{ Name: "+name+" Capacity: "+capacity+" Numbers of Student: "+numbersOfStudent+"}";
    }
}
