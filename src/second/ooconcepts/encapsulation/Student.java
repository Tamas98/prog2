package second.ooconcepts.encapsulation;

public class Student {

    private String name;
    private Integer age;
    private Integer best_grade;
    private Long average_grade;

    public Student() {
    }

    public Student(String name, Integer age, int best_grade, Long average_grade) {
        this.name = name;
        this.age = age;
        this.best_grade = best_grade;
        this.average_grade = average_grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getAverage_grade() {
        return average_grade;
    }

    public void setAverage_grade(Long average_grade) {
        this.average_grade = average_grade;
    }

    public int getBest_grade() {
        return best_grade;
    }

    public void setBest_grade(int best_grade) {
        this.best_grade = best_grade;
    }

    public double calculateGrade() {
        return (double) age/best_grade;
    }
}
