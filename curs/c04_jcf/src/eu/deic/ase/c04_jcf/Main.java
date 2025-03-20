package eu.deic.ase.c04_jcf;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        List<Integer> listInt=new ArrayList<>();

        for (int i=0;i<10;i++){
            listInt.add(i+1);
        }
        listInt.add(7,100);

        for(Integer i : listInt) {
            System.out.println("element of index " + listInt.indexOf(i)+ " is " + i);
        }

        Random rand=new Random();
        List<Integer> listRand= new ArrayList<>();
        for(int i=0;i<10;i++) {
            listRand.add(rand.nextInt() % 100);
        }
        for(Integer i : listRand) {
                System.out.println("element of index " + listRand.indexOf(i)+ " is " + i );
            }

        listRand.sort(Comparator.naturalOrder());
        System.out.println("\n");
        for(Integer i : listRand) {
            System.out.println("element of index " + listRand.indexOf(i)+ " is " + i);
        }

List<Movie> movieLibrary=new ArrayList<>();

        movieLibrary.add(new Movie(2024,"harap alb",3.4f));
        movieLibrary.add(new Movie(2021,"alba ca zapada",6f));
        movieLibrary.add(new Movie(2025,"madutu si gagicile",9.7f));

        for  (Movie m :movieLibrary){
            System.out.println(m);
        }

        movieLibrary.sort(Comparator.naturalOrder());



        }
}
