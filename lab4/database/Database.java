package database;

import people.Student;
import people.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Database {

    private static Database instance = null;
    private final List<Student> students;
    private final List<Teacher> teachers;
    private static int contor = 0;


    // TODO: make it Singleton

    private Database() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public static Database getDatabase() {
        if(instance == null) {
            instance = new Database();
        }
        contor++;
        return instance;
    }

    public static int getNumberOfInstances() {
        // TODO
        return contor;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject (String topic) {
        List<Teacher> teacherSubject = new ArrayList<>();
        teachers.stream().forEach(teacher -> {
            if(teacher.getSubjects().contains(topic)) {
                teacherSubject.add(teacher);
            }
        });
        return teacherSubject;
    }

    public List<Student> findAllStudents() {
        // TODO
        return this.students;
    }

    public List<Teacher> findAllTeachers() {
        // TODO
        return this.teachers;
    }

    public List<Student> getStudentsBySubject(String topic) {
        List<Student> studentSubject = new ArrayList<>();
        students.stream().forEach(student -> {
            if(student.getSubjects().containsKey(topic)) {
                studentSubject.add(student);
            }
        });
        return studentSubject;
    }

    public List<Student> getStudentsByAverageGrade() {
        Collections.sort(this.students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o2.averageGrade() - o1.averageGrade());
            }
        });
        return this.students;
    }

    public List<Student> getStudentsByGradeForSubject(String topic) {
        List<Student> copy = new ArrayList<>();
        students.stream().forEach(student -> {
            if(student.getSubjects().containsKey(topic)) {
                copy.add(student);
            }
        });
        Collections.sort(copy, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getGradeForSubject(topic) - o1.getGradeForSubject(topic);
            }
        });
        return copy;
    }
}