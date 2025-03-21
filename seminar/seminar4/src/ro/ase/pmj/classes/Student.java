package ro.ase.pmj.classes;

public class Student {

    public String name;
    public float[] grades=new float[10];

    public Student(String name, float[] grades) {
        this.name = name;
        this.grades = grades;
    }
}
