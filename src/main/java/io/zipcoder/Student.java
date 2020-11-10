package io.zipcoder;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;


public class Student {


    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName ,String lastName,Double[] testScores)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        examScores=new ArrayList<>();
        for(Double d:testScores)
        {
            examScores.add(d);
        }

    }
public Student() {

}
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken(Student s)
    {
      return s.examScores.size();

    }
 public String getExamScores()
 {
     StringBuilder str= new StringBuilder();
      str.append("Exam Scores:\n");
      int counter=1;
      for (int i = 0; i < examScores.size(); i++) {
          String strFormat= String.format("%1.0f", examScores.get(i));
           str.append("    Exam " + counter + " -->  " + strFormat+ "\n");
           counter++;

     }

     return str.toString();
 }



 public void addExamScore(double examScore)
 {
    // Integer addExam = examScores.size() +1;
     examScores.add(examScore);
   //  this.getExamScores();
 }

 public void setExamScore(int examNumber,double newScore)
 {
     examScores.set(examNumber,newScore);

 }

}
