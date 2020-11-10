package io.zipcoder;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.logging.Logger;

public class ClassroomTest {
    private static final Logger LOGGER= Logger.getLogger(ClassroomTest.class.getName());
    @Test
    public void getAverageTest() {
        // : Given
        Double[] s1Scores = { 100.0, 70.0,80.0};
        Double[] s2Scores = { 225.0, 75.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScore();


        // Then
        LOGGER.info("\n" + output);
    }

    @Test
    public void addStudentTest() {
        // : Given
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Daksh", "Pandya", examScores);

        // When
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();

        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
        // Then
       // LOGGER.info("\n" + postEnrollment);
    }
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
        // Then
        // LOGGER.info("\n" + postEnrollment);
    }
    @Test
    public void getStudentsByScoreTest() {
        Classroom classroom = new Classroom(2);
        Double[] examScores = {100.0, 15.0, 250.0, 0.0};
        Student student = new Student("Dhruv", "Pandya", examScores);
        Double[] examScores1 = {100.0, 150.0, 20.0, 0.0};
        Student student1 = new Student("Daksh", "Pandya", examScores1);
        // When
        classroom.addStudent(student);
        classroom.addStudent(student1);

        Student[] preEnrollment = classroom.getStudents();
        // Then
        LOGGER.info("\n" + classroom.getStudentsByScore());

        // Then
    }

}
