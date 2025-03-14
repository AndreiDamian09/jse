package eu.deic.oop;

public abstract class Entity {
    public int id;

    public Entity(int id) {
        this.id = id;
    }

    public abstract void something();
}
