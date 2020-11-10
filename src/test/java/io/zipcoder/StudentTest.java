package io.zipcoder;

import org.junit.Test;

import java.util.logging.Logger;

public class StudentTest {
    private static final Logger LOGGER= Logger.getLogger(StudentTest.class.getName());


    @Test
    public void getExamScoresTest() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScores();

        // Then
        LOGGER.info("\n" + output);
    }

    @Test
    public void getAddExamScoresTest() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        String output = student.getExamScores();

        // Then
        LOGGER.info("\n" + output);
    }

    @Test
    public void setExamScoreTest() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 99.5};
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.setExamScore(1, 88.5);
        String output = student.getExamScores();

        // Then
        LOGGER.info("\n" + output);
    }
    @Test
    public void getAverageTest() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 150.0,250.0,100.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        Double output=student.getAverageExamScore();

        // Then
        LOGGER.info("\n" + output);
    }

    @Test
    public void toStringTest() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 150.0,250.0,100.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output=student.toString();

        // Then
        LOGGER.info("\n" + output);
    }



}