package eu.deic.oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");

        int[] costs ={100,200,300};

        GameCharacter g1=new GameCharacter(100,"Edi",true,costs);
        System.out.println(g1);

        GameCharacter w1=new Warrior(100,"cosmin",true,costs,"ak48");
        System.out.println(w1);
    }
}
