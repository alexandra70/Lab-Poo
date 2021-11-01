package task2;

import java.util.Arrays;

public class Test {

    public static void main(String[] arg) {

        Course curs = new Course();
        curs.setTitle("socio");
        curs.setDescription("pathtodasocio");

        Student s1 = new Student();
        s1.setName("lana");
        s1.setYear(11);

        Student s2 = new Student();
        s2.setName("lana");
        s2.setYear(11);

        Student s3 = new Student();
        s3.setName("rana");
        s3.setYear(11);

        Student s4 = new Student();
        s4.setName("rana");
        s4.setYear(11);
        Student[] stud = new Student[4];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;
        stud[3] = s4;

        curs.setStudents(stud);

        System.out.println("->" + s3.equals(s1) + "<-");

        System.out.println("-" + Arrays.toString(curs.getStudents()));
        System.out.println("-" + curs.getStudents().length);

       // Student[] newarray = curs.filterYear(Integer.parseInt(arg[0]));
        Student[] newarray = curs.filterYear(11);
        System.out.println("+yyyyy" + newarray.length);
        System.out.println("-" + Arrays.toString(newarray));
        System.out.println("stud in anul");// + Arrays.toString(newarray));

    }
}
