package task2;

public class Course {
    private String title;
    private String description;
    private Student[] students;
    int k = 0;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    Student[] filterYear(int year){

        System.out.println("ppppptttppp" + year);

        Student[] getYearStud = new Student[students.length];
        System.out.println("pppppppp" + students.length);
        for(int i = 0; i < students.length; i++){
            if(students[i].getYear() == year){
                getYearStud[k] = students[i];
                k++;
            }
        }
        return getYearStud;
    }



}
