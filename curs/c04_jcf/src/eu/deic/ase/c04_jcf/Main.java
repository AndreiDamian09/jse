package eu.deic.ase.c04_jcf;

import java.sql.SQLOutput;
import java.util.*;

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

        Cinema c1 = new Cinema(1,"c1");
        Cinema c2 = new Cinema(2,"c2");

        TreeMap<Movie,Cinema>treeMapMovie = new TreeMap<>();
        treeMapMovie.put(movieLibrary.get(0),c1);
        treeMapMovie.put(movieLibrary.get(1),c1);
        treeMapMovie.put(movieLibrary.get(2),c1);

        Set<Movie> keySet=treeMapMovie.keySet();
        Iterator<Movie> iterator= keySet.iterator();

        for(;iterator.hasNext();){
            Movie m = iterator.next();
            System.out.println(m+ ": " +treeMapMovie.get(m));
        }
        }
}
