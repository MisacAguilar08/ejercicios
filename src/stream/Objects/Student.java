package stream.Objects;

public class Student {
    private String name;
    private int age;
    private String sex;
    private double avg;
    private String shift;
    private boolean scholarship;
    private boolean isForeign;
    private String semestre;
    
    public Student(){}

    public Student(String name, int age, String sex, double avg, String shift, boolean scholarship, boolean isForeign, String semestre){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.avg = avg;
        this.shift = shift;
        this.scholarship = scholarship;
        this.isForeign = isForeign;
        this.semestre = semestre;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public double getAvg() {
        return avg;
    }

    public String getShift() {
        return shift;
    }

    public boolean isScholarship() {
        return scholarship;
    }

    public boolean isForeign() {
        return isForeign;
    }

    public String getSemestre() {
        return semestre;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", avg=" + avg +
                ", shift='" + shift + '\'' +
                ", scholarship=" + scholarship +
                ", isForeign=" + isForeign +
                ", semestre='" + semestre + '\'' +
                '}';
    }
}
