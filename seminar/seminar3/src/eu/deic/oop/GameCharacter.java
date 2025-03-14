package eu.deic.oop;

public class GameCharacter extends Entity{
    int healthPoints;
    String name;
    boolean hasWeapon;
    int[] costs;


    public GameCharacter(int healthPoints, String name, boolean hasWeapon,int[] costs) {
        super(0);
        this.healthPoints = healthPoints;
        this.name = name;
        this.hasWeapon = hasWeapon;

        if(costs !=null) {
            this.costs=new int[costs.length];
            System.arraycopy(costs, 0, this.costs, 0, costs.length);
        }
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasWeapon() {
        return hasWeapon;
    }

    public void setHasWeapon(boolean hasWeapon) {
        this.hasWeapon = hasWeapon;
    }

    public int[] getCosts() {
        int[] copy=new int[this.costs.length];
        System.arraycopy(this.costs, 0, copy, 0, costs.length);
        return copy;
    }

    public void setCosts(int[] costs) {
        if(costs !=null) {
            this.costs=new int[costs.length];
            System.arraycopy(costs, 0, this.costs, 0, costs.length);
        }
    }

    @Override
    public String toString() {

        return "Name : " + this.name +" " +  "hp : " + this.healthPoints;
    }

    @Override
    public void something() {

    }
}
