package people;

import database.Database;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private Database database; //am o referinta a obiectului database in clasa student
    private String firstName;
    private String lastName;
    private Map<String, Integer> subjects;

    public Student(String firstName, String lastName, Map<String, Integer> subjects) {
        this.database = Database.getDatabase();
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    // TODO: copy constructor - - - deep copy
    public Student(Student student) {

        this.firstName = new String(student.firstName);
        this.lastName = new String(student.lastName);
        this.subjects = new HashMap<>(student.subjects);
    }

    public double getGradeAtSubject(String topic) {
        for(Map.Entry entry : this.getSubjects().entrySet()) {
            if(entry.getKey() == topic) {
                return (double) entry.getValue();
            }
        }
        return 0.0;
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

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(HashMap<String, Integer> subjects) {
        this.subjects = subjects;
    }

    public double averageGrade() {
        double grade = 0.0;
        for(Map.Entry<String, Integer> entry : this.subjects.entrySet()) {
            grade += entry.getValue();
        }
        return grade/this.subjects.size();
    }

    public List<Teacher> getAllTeachers() {
        // TODO
        return Collections.unmodifiableList(this.database.findAllTeachers());
    }

    public int getGradeForSubject(String subject) {
        // TODO
        for (Map.Entry entry : this.subjects.entrySet()) {
            if (entry.getKey().equals(subject)) {
                return (int)entry.getValue();
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        // TODO
        return Collections.unmodifiableList(this.database.findTeachersBySubject(subject));
    }

    public List<Student> getAllStudents() {
        // TODO
        return Collections.unmodifiableList(this.database.findAllStudents());
    }

    public List<Student> getStudentsBySubject(String subject) {
        // TODO
        return Collections.unmodifiableList(this.database.getStudentsBySubject(subject));
    }

    public List<Student> getStudentsByAverageGrade() {
        // TODO
        return Collections.unmodifiableList(this.database.getStudentsByAverageGrade());
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        // TODO
        return Collections.unmodifiableList(this.database.getStudentsByGradeForSubject(subject));
    }
}
