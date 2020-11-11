package io.zipcoder;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void studentSetFirstNameTest(){
        Double [] exams = {100.0, 55.8, 96.0,45.2};
        Student s1 = new Student("Raju","Patel",exams);
        s1.setFirstName("Radha");
        String expected = "Radha";
        String actual = s1.getFirstName();
        assertEquals(expected,actual);
    }
    @Test
    public void studentGetFirstNameTest(){
        Double [] exams = {100.0, 77.8, 96.0};
        Student s1 = new Student("Raghav","Patel",exams);
        String expected = "Raghav";
        String actual = s1.getFirstName();
        assertEquals(expected,actual);
    }
    @Test
    public void studentSetLastNameTest(){
        Double [] exams = {100.0, 77.8, 96.0};
        Student s1 = new Student("Raju","Patel",exams);
        s1.setLastName("Pandya");
        String expected = "Pandya";
        String actual = s1.getLastName();
        assertEquals(expected,actual);
    }
    @Test
    public void studentGetLastNameTest(){
        Double [] exams = {100.0, 77.8, 96.0};
        Student s1 = new Student("Raghav","Patel",exams);
        String expected = "Patel";
        String actual = s1.getLastName();
        assertEquals(expected,actual);
    }

    @Test
    public void getExamScoresTest(){
        Double [] exams = {78.0, 55.0, 96.0};
        Student s1 = new Student("Raghav","Patel",exams);
        String expected = "Exam Scores:\nExam 1 -> 78.0\nExam 2 -> 55.0\nExam 3 -> 96.0\n";
        String actual = s1.getExamScores();
        assertEquals(expected,actual);
    }
    @Test
    public void addExamScoreTest(){
        Double [] exams = {100.0, 77.0, 96.0};
        Student s1 = new Student("Raghav","Patel",exams);
        s1.addExamScore(89.0);
        String expected = "Exam Scores:\nExam 1 -> 100.0\nExam 2 -> 77.0\nExam 3 -> 96.0\nExam 4 -> 89.0\n";
        String actual = s1.getExamScores();
        assertEquals(expected,actual);
    }
    @Test
    public void setExamScoreTest(){
        Double [] exams = {100.0, 77.0, 96.0};
        Student s1 = new Student("Raghav","Patel",exams);
        s1.setExamScore(1,99.0);
        String expected = "Exam Scores:\nExam 1 -> 100.0\nExam 2 -> 99.0\nExam 3 -> 96.0\n";
        String actual = s1.getExamScores();
        assertEquals(expected,actual);
    }
    @Test
    public void getAverageExamScoreTest(){
        Double [] exams = {100.0, 77.0, 96.0};
        Student s1 = new Student("Raghav","Patel",exams);
        Double expected = 91.0;
        Double actual = s1.getAverageExamScore();
        assertEquals(expected,actual);
    }
    @Test
    public void toStringTest(){
        Double [] exams = {100.0, 99.0, 99.0};
        Student s1 = new Student("Raghav","Patel",exams);
        String expected = "Student Name: Raghav Patel\nAverage Score: 99.33\n" +
                "Exam Scores:\nExam 1 -> 100.0\nExam 2 -> 99.0\nExam 3 -> 99.0\n";
        String actual = s1.toString();
        assertEquals(expected,actual);

    }

}