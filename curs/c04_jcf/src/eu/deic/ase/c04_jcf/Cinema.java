package eu.deic.ase.c04_jcf;

public class Cinema {

    private int id;
    private String name;

    public Cinema(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {

        return String.format("The cinema %s has the id %d",this.name,this.id);
    }
}
