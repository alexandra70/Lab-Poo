package task2;

public class Student {
    private String name;
    private Integer year;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//setter si getter


    @Override
    public String toString() {
        return "Nume student: " + name
                + " an: " + year;
    }
}
