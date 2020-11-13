package io.zipcoder;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.Arrays;


public class Student implements Comparable<Student> {


    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
     /*   for(Double d:testScores)
        {
            this.examScores.add(d);
        }*/

    }

    public Student() {

    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken(Student s) {
        return s.examScores.size();

    }

    public String getExamScores() {
        StringBuilder str = new StringBuilder();
        str.append("Exam Scores:\n");
        int counter = 1;
        for (int i = 0; i < examScores.size(); i++) {
            String strFormat = String.format("%1.1f", examScores.get(i));
            str.append("Exam " + counter + " -> " + strFormat + "\n");
            counter++;

        }

        return str.toString();
    }


    public void addExamScore(double examScore) {
        // Integer addExam = examScores.size() +1;
        this.examScores.add(examScore);
        //  this.getExamScores();
    }

    public void setExamScore(int examNumber, double newScore) {
        this.examScores.set(examNumber, newScore);

    }

    public Double getAverageExamScore() {
        Double sumAverage = 0d;
        for (double d : examScores) {
            sumAverage += d;

        }
        return sumAverage / examScores.size();
        //examScores.set(examNumber,newScore);

    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Student Name: " + firstName + " " + lastName + "\n");
        String storeAvgScore = String.format("%1.2f", getAverageExamScore());
        str.append("Average Score: " + storeAvgScore + "\n");
        str.append(this.getExamScores());
    /*    int counter=1;
        for (int i = 0; i < examScores.size(); i++) {
            String strFormat= String.format("%1.0f", examScores.get(i));
            str.append("    Exam " + counter + " -->  " + strFormat+ "\n");
            counter++;

    }*/

        return str.toString();

    }


    @Override
    public int compareTo(Student student2) {

        return Double.compare(this.getAverageExamScore(), student2.getAverageExamScore());

    }
}
