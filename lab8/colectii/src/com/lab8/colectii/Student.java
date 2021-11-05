package com.lab8.colectii;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private String surname;
    private long id;
    private double averageGrade ;


    public Student(String name, String surname, long id, double averageGrade){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averageGrade = averageGrade;
    }


    public int compareTo(Student student) {

        if(this.averageGrade == student.getAverageGrade()){
            if(this.surname.compareTo(student.getSurname()) == 0){
                if(this.name.compareTo(student.getName()) > 0)
                    return 1;
                else
                    return -1;
            }
            if(this.surname.compareTo(student.getSurname()) > 0){
                return 1;
            } else
                return -1;
        }
        if(this.averageGrade > student.getAverageGrade())
            return 1;
        else
            return -1;
    }


    //IMPORTANT
    //MPLEMENATREA HASHSET - SE REALIZEAZA PE BAZA TABELEI DE DISPERISE, SE
    //CALCULEAZA CODUL DE DISPERSIE AL FIECARUI ELEMENT IN PARTE PE BAZA
    //UNEI METODE ----HASHCODE---- , ATUNCI CAND AVEM AC OBIECT SE VA
    //INTOARCE ACELASI REZULTAT DIN HASHCODE - OBIECTE EGALE
    //CONFORM FUNCTIE EQUALS - VERIFICA DACA OBIECTUL CURENT ESTE
    //ACEASI REFERINTA DACA EXISTA DACA ESTE INTRADEVAR O INSTANTA A
    //CALASEI PE CARE O DORIM SI SE MAI VERIFICA EFECTIV DACA ARE CAMPURILE
    //SETATE IN CONFORMITATE CU OBIECTUL CURENT THIS CU PARAMETRUL DAT

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id &&
                Double.compare(student.averageGrade, averageGrade) == 0 &&
                name.equals(student.name) &&
                surname.equals(student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, averageGrade);
    }


    //HashMap<Student, LinkedList<String>> hashmap = new HashMap<Student, LinkedList<String>>();

    //se adauga in hash asa pereche de student + lsta de materii pe care
    //le are student




    @Override
    public String toString() {
        return  " | NAME: " +this.getName() +
                " | SURNAME: " + this.getSurname() +
                " | AVRGRADE: " + this.getAverageGrade() +
                " | ID: " + this.getId() + " ";
    }

    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public long getId(){
        return this.id;
    }
    public double getAverageGrade(){
        return this.averageGrade;
    }

}
