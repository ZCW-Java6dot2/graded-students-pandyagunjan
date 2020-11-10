package io.zipcoder;

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


}
