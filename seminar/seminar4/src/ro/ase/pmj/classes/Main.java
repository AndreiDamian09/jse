package ro.ase.pmj.classes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args ){

        int[] v=new int[10];
        v[0]=0;
        v[1]=1;

        Student[] students=new Student[2];
        Employee[] employees=new Employee[5];

        ArrayList studentLists=new ArrayList();
        studentLists.add(new Student("balaurentiu",new float[]{10,9.9f,8}));
        studentLists.add(new Student("balaurentiu",new float[]{10,9.9f,8}));
        studentLists.add(new Student("balaurentiu",new float[]{10,9.9f,8}));
        studentLists.add(1,new Student("balaurentiu17",new float[]{10,9.9f,8}));

        ArrayList studentList2= new ArrayList();
        studentList2.addAll(studentLists);

        System.out.println(studentLists.get(0));
        System.out.println(studentLists.get(1));

        System.out.println("\n\n");

        if(studentLists.contains(new Student("balaurentiu17",new float[]{10,9.9f,8})) == true){
            System.out.println("l- am gasit");
        }else{
            System.out.println("nu l am gasit");
        }

        List<Integer> intList=new ArrayList<>();
        intList.add(1);

        intList.add(2);
        intList.add(3);
        intList.add(4);

        for(Integer i : intList) System.out.println(i );
    }
}
