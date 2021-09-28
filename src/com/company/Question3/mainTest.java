package com.company.Question3;

import com.company.Question3.Course;
import com.company.Question3.PersonalData;
import com.company.Question3.Student;

public class mainTest {
    public static void main(String[] args) {
        Student s1=new Student("Ali",5005,2.15,new PersonalData(1997,10,5,546));
        Student s2=new Student("Veli",5006,3.15,new PersonalData(1991,11,11,547));
        Student s3=new Student("Ahmet",5007,3.40,new PersonalData(1999,4,7,548));
        Student s4=new Student("Mehmet",5008,2.70,new PersonalData(1994,5,3,549));
        Student s5=new Student("Dursun",5009,2.72,new PersonalData(1995,1,29,550));


        Course k129=new Course("K129",3);
        k129.addStudents(s1);
        k129.addStudents(s2);
        k129.addStudents(s3);
        k129.addStudents(s4);

        k129.list();
        k129.increaseCapacity();
        k129.addStudents(s4);
        k129.addStudents(s5);


        k129.list();

        k129.dropStudent(s1);

        k129.list();
        System.out.println("Numbers of students enrolled to K129: "+k129.getNumbersOfStudent());

        System.out.println("Birth year of best student of K129: "+k129.getBestStudent().getPd().getBirtDate().getYear());

        Course k130=new Course("K130");

        for (int i = 0; i < k129.getNumbersOfStudent(); i++) {
            k130.addStudents(k129.getStudents()[i]);
        }

        k129.clear();
        System.out.println(k129.dropStudent(s1));

        k130.list();

        k130.dropStudent(k130.getBestStudent());
        k130.list();

        System.out.println("GPA of youngest student of K130: "+k130.getYoungestStudent().getGpa());

        System.out.println(k130.toString());
    }

}
