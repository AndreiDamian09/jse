package ro.ase.pmj.classes;

import java.util.Arrays;

public class Student {

    public String name;
    public float[] grades=new float[10];

    public Student(String name, float[] grades) {
        this.name = name;
        this.grades = grades;
    }

    @Override
    public boolean equals(Object obj) {

        return this.name ==((Student)obj).name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", grades=" + Arrays.toString(grades);
    }
}
