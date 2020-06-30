package com.aipalbot.student.firstoop;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student student;
        
        Student s1 = new Student(); // POJO Plain Old Java Object
        s1.setName("John");
        s1.setDept("EEE");
        s1.setLevel("300L");
        
        Student s2 = new Student();
        s2.setName("Julius");
        s2.setDept("CSC");
        s2.setLevel("300L");
        
        Student s3 = new Student();
        s3.setName("Juliet");
        s3.setDept("EEE");
        s3.setLevel("300L");
        //test -- I am happy I'm in my branch
        
        List<Student> students = new ArrayList<>(); //represents array
        students.add(s1);
        students.add(s2);
        students.add(s3);
        
        for(Student s: students) //int i=0
        {
        	System.out.println("****************************************");
        	System.out.println("Name: " + s.getName());
        	System.out.println("Dept: " + s.getDept());
        	System.out.println("Level: " + s.getLevel());
        }
        
//        for(int i=0; i<students.size(); i++) {
//         	System.out.println("****************************************");
//        	System.out.println("Name: " + students.get(i).getName());
//        	System.out.println("Dept: " + students.get(i).getDept());
//        	System.out.println("Level: " + students.get(i).getLevel());
//        }
        
        
        
        
        
       
    }
}
