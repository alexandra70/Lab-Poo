package people;


import database.Database;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private Database database;
    private String firstName;
    private String lastName;
    private List<String> subjects;

    public Teacher(String firstName, String lastName, List<String> subjects) {
        this.database = Database.getDatabase();
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    // TODO: copy constructor
    public Teacher(Teacher teacher) {
        this.firstName = teacher.firstName;
        this.lastName = teacher.lastName;
        this.subjects = new ArrayList<>(teacher.subjects);
    }

    @Override
    public String toString() {
        return "Teacher: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<Teacher> getAllTeachers() {
        // TODO
        return this.database.findAllTeachers();
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        // TODO
        return this.database.findTeachersBySubject(subject);
    }

    public List<Student> getAllStudents() {
        // TODO
        return this.database.findAllStudents();
    }

    public List<Student> getStudentsBySubject(String subject) {
        // TODO
        return this.database.getStudentsBySubject(subject);
    }

    public List<Student> getStudentsByAverageGrade() {
        // TODO
        return this.database.getStudentsByAverageGrade();
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        // TODO
        return this.database.getStudentsByGradeForSubject(subject);
    }
}
