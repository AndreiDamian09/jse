package eu.deic.oop;

import eu.deic.oop.interfaces.Attackable;

public class Warrior extends GameCharacter implements Attackable {

    Weapon weapon;


    public Warrior(int healthPoints, String name, boolean hasWeapon, int[] costs,String weaponName) {
        super(healthPoints, name, hasWeapon, costs);
        this.weapon=new Weapon(weaponName);
    }

    @Override
    public String toString() {

        return "Warrior : " + this.name +  " hp : " + this.healthPoints + " and is currently using " + this.weapon.name;
    }

    @Override
    public void attack() {
        System.out.println("atttttaaaaackkkkk");
    }

    @Override
    public void something() {

    }
}
