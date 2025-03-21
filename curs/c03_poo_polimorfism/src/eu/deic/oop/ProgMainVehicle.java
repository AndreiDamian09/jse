package eu.deic.oop;

public class ProgMainVehicle {

    public static void main(String[] args)
    {

        Vehicle v1=new Vehicle(3800);
        Vehicle v2=new Vehicle(2100);

        System.out.println("v1= "+v1.display());
        System.out.println("v2= "+v2.display());

//        v2=v1;
        try {
            v2=(Vehicle)v1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        v1.setWeight(8000);

        System.out.println("v1= "+v1.display());
        System.out.println("v2= "+v2.display());
    }
}
