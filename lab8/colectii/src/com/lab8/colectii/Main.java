package com.lab8.colectii;

import com.sun.javafx.collections.ListListenerHelper;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Student studen1 = new Student("ana", "popescu", 7, 10);
        Student studen2 = new Student("an", "popescu", 2, 10);
        Student studen3 = new Student("ana", "ionescu", 3, 12);
        Student studen4 = new Student("george", "georgescu", 4, 10);
        Student studen5 = new Student("cornel", "corneliu", 5, 1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(studen1);
        students.add(studen2);
        students.add(studen3);
        students.add(studen4);
        students.add(studen5);

        //pt task2
        //Collections.sort(students);
        //pt task3, se doreste descrescator;
        //Collections.sort(students, (o1, o2) -> (int) (o2.getAverageGrade() -o1.getAverageGrade()));

        students.sort((o1, o2) -> (int) (o2.getAverageGrade() - o1.getAverageGrade()));
        System.out.println(students.toString() + "\n");

        System.out.println("--------lambda list.sort--------");
        for (Student s : students) {
            System.out.println(s);
        }

        PriorityQueue<Student> queue = new PriorityQueue<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                }
                if (o1.getId() < o2.getId())
                    return -1;

                return 0;
            }
        });

        queue.addAll(students);

        System.out.println("--------queue--------");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }


        LinkedList<String> subj = new LinkedList<String>();
        LinkedList<String> subj2 = new LinkedList<String>();
        LinkedList<String> subj3= new LinkedList<>(Arrays.asList("omg", "chair", "se", "poate"));
        subj.add("oop");
        subj2.add("oop");
        subj.add("sd");
        subj2.add("sd");
        subj.add("pc1");
        subj2.add("pc1");
        subj.add("pc2");



        HashMap<Student,LinkedList<String>> hash = new HashMap<Student, LinkedList<String>>();

        hash.put(studen1, subj);
        hash.put(studen2, subj);
        hash.put(studen3, subj3);
        hash.put(studen4, subj2);
        hash.put(studen5, subj2);



        System.out.println(hash);
        //sau iterez prin hash cu un iterator ascuns al multimii de perechi
        //iter intors de entery set
        System.out.println("---------------------------");
        for(Map.Entry<Student, LinkedList<String>> entry : hash.entrySet()){


            System.out.println("Key: " + entry.getKey() +
                    " | Value: " + entry.getValue());
        }


        JustEvens evens = new JustEvens();

        evens.add(1);
        evens.add(7);
        evens.add(8);
        evens.add(9);
        evens.add(100);
        evens.add(10);
        evens.add(2);
        evens.add(6);
        evens.remove(100);

        for(Integer elem : evens){
            System.out.println(elem);
        }

        System.out.println("ORIBIL ITERATOR ASTA:->");
        //aici cusorul pointeaza in fata oricarui element
        //bine, in fata primului element
        //dupa cae verific dc exxista urmatorul
        //inculsiv primul
        //exista, asa ca ma pun cu cursorul la urmatorul
        //elemetn si il iau il printez
        //verific dc exista urmatorul in=l iau printez si tot asa
        Iterator<Integer> iter = evens.iterator();
        while(iter.hasNext()){
            Integer i = iter.next();
            System.out.println(i);
        }

    }

}


