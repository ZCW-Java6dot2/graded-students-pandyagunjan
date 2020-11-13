package io.zipcoder;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {
    private static final Logger LOGGER= Logger.getLogger(ClassroomTest.class.getName());
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
  /*  @Test
    public void removeStudentTest(){
        Double [] GunjanExamScore = {88.0,99.0,100.0};
        Student gunjan = new Student("Gunjan","White",GunjanExamScore);
        Double [] dhruvExamScore = {94.0,95.0,98.0};
        Student dhruv = new Student("dhruv", "pandya",dhruvExamScore);
        Student [] beforeRemoval = {gunjan,dhruv};
        Classroom classR = new Classroom(beforeRemoval);
        classR.removeStudent("dhruv","pandya");
        Student [] expected = {gunjan,null};
        Student [] actual = classR.getStudents();
        assertEquals(expected,actual);
    }*/
  @Test
  public void removeStudentTest() {
      // : Given
      // : Given
      int maxNumberOfStudents = 2;
      Classroom classroom = new Classroom(maxNumberOfStudents);
      Double[] examScores = { 100.0, 15.0, 250.0, 0.0 };
      Student student = new Student("Dhruv", "Pandya", examScores);
      Double[] examScores1 = { 100.0, 150.0, 20.0, 0.0 };
      Student student1 = new Student("Daksh", "Pandya", examScores1);
      // When
      classroom.addStudent(student);
      classroom.addStudent(student1);
      Student[] preEnrollment = classroom.getStudents();
      classroom.removeStudent(student.firstName,student.lastName);
      Student[] postEnrollment = classroom.getStudents();

      String preEnrollmentAsString = Arrays.toString(preEnrollment);
      String postEnrollmentAsString = Arrays.toString(postEnrollment);

      System.out.println("===========================");
      System.out.println(preEnrollmentAsString);
      System.out.println("===========================");
      System.out.println(postEnrollmentAsString);
  }


    @Test
    public void getStudentsByScoreTest(){
        Double [] GunjanExamScore = {90.0,90.0,90.0};;
        Student Gunjan = new Student("Gunjan","Pandya",GunjanExamScore);
        Double [] dhruvExamScore = {22.5,52.3,88.0};
        Student dhruv = new Student("dhruv", "pandya",dhruvExamScore);
        Double [] dakshExamScore = {94.0,95.0,93.0};
        Student daksh = new Student("Daksh", "pandya",dakshExamScore);
        Student [] school = {Gunjan,dhruv,daksh};
        Classroom classR = new Classroom(school);

        Student [] expected = {dhruv,Gunjan};
       // System.out.print(expected.toString());
        Student [] actual = classR.getStudentsByScore();;
        //System.out.print(actual.toString());

        LOGGER.info("\n" + Arrays.toString(classR.getStudentsByScore()));
    }

    @Test
    public void getGradeBookTest(){
        Double [] GunjanExamScore = {100.0,100.0,100.0};;
        Student Gunjan = new Student("Gunjan","Pandya",GunjanExamScore);
        Double [] dhruvExamScore = {50.5,52.0,60.0};
        Student dhruv = new Student("Dhruv", "Pandya",dhruvExamScore);
        Double [] dakshExamScore = {10.0,10.0,10.0};
        Student daksh = new Student("Daksh", "pandya",dakshExamScore);
        Student [] school = {Gunjan,dhruv,daksh};
        Classroom classR = new Classroom(school);

        Student [] expected = {dhruv,Gunjan};
        // System.out.print(expected.toString());
        Student [] actual = classR.getStudentsByScore();;
        //System.out.print(actual.toString());

        LOGGER.info("\n" + classR.getGradeBook());
    }


}