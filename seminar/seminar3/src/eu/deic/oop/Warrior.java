package eu.deic.oop;

public class Warrior extends GameCharacter{

    Weapon weapon;


    public Warrior(int healthPoints, String name, boolean hasWeapon, int[] costs,String weaponName) {
        super(healthPoints, name, hasWeapon, costs);
        this.weapon=new Weapon(weaponName);
    }

    @Override
    public String toString() {

        String display="Warrior-ul : " + this.name +  " hp : " + this.healthPoints + " si folosesc " +this.weapon.name;
        return display;
    }
}
