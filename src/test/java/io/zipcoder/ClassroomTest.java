package io.zipcoder;

import org.junit.Test;
import static org.junit.Assert.*;


public class ClassroomTest {

    @Test
    public void ClassroomMaxStudentTest(){
        Classroom classroom = new Classroom(30);
        Integer expected = 30;
        Integer actual = classroom.getStudents().length;
        assertEquals(expected,actual);
    }
    @Test
    public void ClassroomStudentArrTest(){
        Double [] mebExamScore = {88.0,99.0,100.0};
        Student me = new Student("Gunjan","Pandya",mebExamScore);
        Double [] chanExamScore = {94.0,95.0,98.0};
        Student chan = new Student("Jackey", "Chan",chanExamScore);
        Student [] classroom = {me,chan};
        Student [] expected = {me,chan};
        Classroom classR = new Classroom(classroom);
        Student [] actual = classR.getStudents();
        assertEquals(expected,actual);
    }
    @Test
    public void classroomGetStudentTest(){
        Double [] mebExamScore = {88.0,99.0,100.0};
        Student me = new Student("Gunjan","Pandya",mebExamScore);
        Double [] chanExamScore = {94.0,95.0,98.0};
        Student chan = new Student("Jackey", "Chan",chanExamScore);
        Student [] classroom = {me,chan};
        Student [] expected = {me,chan};
        Classroom classR = new Classroom(classroom);
        Student [] actual = classR.getStudents();
        assertEquals(expected,actual);
    }
    @Test
    public void getAverageExamScoreTest(){
        Double [] mebExamScore = {88.0,99.0,100.0};
        Student me = new Student("Gunjan","Pandya",mebExamScore);
        Double [] chanExamScore = {94.0,95.0,98.0};
        Student chan = new Student("Jackey", "Chan",chanExamScore);
        Student [] classroom = {me,chan};
        Double GunjanAve = me.getAverageExamScore();
        Double dhruvAve = chan.getAverageExamScore();
        Classroom classR = new Classroom(classroom);
        Double expected = 274.5;
        Double actual = classR.getAverageExamScore();
        assertEquals(expected,actual);
    }
    @Test
    public void addStudentTest(){
        Double [] GunjanExamScore = {88.0,99.0,100.0};
        Student gunjan = new Student("Gunjan","Pandya",GunjanExamScore);
        Double [] dhruvExamScore = {94.0,95.0,98.0};
        Student dhruv = new Student("dhruv", "pandya",dhruvExamScore);
        Student [] preEnrol = {gunjan};
        Classroom classR = new Classroom(preEnrol);
        classR.addStudent(dhruv);
        Student [] expected = {gunjan,dhruv};
        Student [] actual = classR.getStudents();
        assertEquals(expected,actual);
    }
    /*@Test
    public void removeStudentTest(){
        Double [] GunjanExamScore = {88.0,99.0,100.0};
        Student gunjan = new Student("Gunjan","White",GunjanExamScore);
        Double [] dhruvExamScore = {94.0,95.0,98.0};
        Student dhruv = new Student("dhruv", "pandya",dhruvExamScore);
        Student [] beforeRemoval = {gunjan,dhruv};
        Classroom classR = new Classroom(beforeRemoval);
        classR.removeStudent("dhruv","pandya");
        Student [] expected = {gunjan};
        Student [] actual = classR.getStudents();
        assertEquals(expected,actual);
    }
    @Test
    public void getStudentsByScoreTest(){
        Double [] GunjanExamScore = {90.0,90.0,90.0};;
        Student Gunjan = new Student("Gunjan","White",GunjanExamScore);
        Double [] dhruvExamScore = {94.0,95.0,93.0};
        Student dhruv = new Student("dhruv", "pandya",dhruvExamScore);
        Student [] school = {Gunjan,dhruv};
        Classroom classR = new Classroom(school);

        Student [] expected = {dhruv,Gunjan};
        Student [] actual = classR.getStudentsByScore();;
        assertEquals(expected,actual);
    }
  /*  @Test
    public void getGradeBookTest(){
        Double [] GunjanExamScore = {90.0,90.0,90.0};;
        Student Gunjan = new Student("Gunjan","White",GunjanExamScore);
        Double [] dhruvExamScore = {94.0,95.0,93.0};
        Student dhruv = new Student("dhruv", "pandya",dhruvExamScore);
        Double [] joeExamScore = {77.0,69.0,80.0};
        Student joe = new Student("Joe","Momma",joeExamScore);
        Student [] school = {Gunjan,dhruv,joe};
        Classroom classR = new Classroom(school);

        String expected = "Student name: Ned Flanders\n" +
                "> Average score: 99.0\n" +
                "> Exam scores:\n" +
                "Exam 1 -> 99.0\n" +
                "Exam 2 -> 98.0\n" +
                "Exam 3 -> 100.0\n" +
                "GRADE: A\n" +
                "Student name: dhruv pandya\n" +
                "> Average score: 94.0\n" +
                "> Exam scores:\n" +
                "Exam 1 -> 94.0\n" +
                "Exam 2 -> 95.0\n" +
                "Exam 3 -> 93.0\n" +
                "GRADE: B\n" +
                "Student name: Gunjan White\n" +
                "> Average score: 90.0\n" +
                "> Exam scores:\n" +
                "Exam 1 -> 90.0\n" +
                "Exam 2 -> 90.0\n" +
                "Exam 3 -> 90.0\n" +
                "GRADE: C\n";

        String actual = classR.getGradeBook();
        assertEquals(expected,actual);
    }*/

}