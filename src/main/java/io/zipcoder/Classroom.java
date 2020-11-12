package io.zipcoder;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;

public class Classroom {
    Student[] students;

    public Classroom()
    {
        students = new Student[30];

    }

    public Classroom(int maxNumberOfStudents)
    {
        students = new Student[maxNumberOfStudents];

    }
    public Classroom(Student[] student)
    {
       students = student;
    }

  public Student[] getStudents()
  {
      return this.students;
  }


    public Double getAverageExamScore()
    {
        Double avgScore=0d;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            for(int j=0 ;j < s.examScores.size() ;j++) {
                avgScore += s.examScores.get(i);
            }
        }
        return avgScore/ students.length;

    }
 public void addStudent(Student student)
 {

   //  Student[] newStudents= new Student[students.length+1];
   //  int i=0;
/*
     for ( i = 0; i < students.length ; i++) {

       newStudents[i]=students[i];
     }
    newStudents[i-1]= student;
*/
     Student[] newStudents= Arrays.copyOf(students,students.length+1);
     newStudents[newStudents.length-1]=student;
     students=newStudents;

 }


 public void removeStudent(String firstName, String lastName)
 {
     Student[] newStudents= new Student[students.length-1];
     int i=0;
     int j=0;

     for ( i = 0; i < students.length ;) {
        if(students[i]==null)
         {
           i++;

         }
        else if((students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)))
        {
               i++;
        }
         else
        {
            newStudents[j] = students[i];
            i++;
            j++;
        }
     }

     students=newStudents;
     int l=0;
     Student[] studentEndNull=new Student[newStudents.length-1];
     for(int k=0;k< students.length-1;k++) {
         if (students[k] != null) {
         studentEndNull[l]=students[k];
         l++;
         }
     }
     students=studentEndNull;
 }


 public Student[] getStudentsByScore()
 {

  Arrays.sort(this.students);
  return this.students;

 }

}
