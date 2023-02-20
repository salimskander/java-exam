import java.util.Random;

public class Bike extends Vehicle {

    static int Speed = new Random().nextInt(1, 5 + 1);
    static int Adhesion = new Random().nextInt(1, 5 + 1);

    public Bike(String pilotName) {
        super(Speed, Adhesion, pilotName);
    }

    public String toString(){
        String StringSpeed = "";
        String StringAdhesion = "";
        if (Bike.Speed == 1 || Bike.Speed == 2){
            StringSpeed = "so slow, so boring";
        } else if (Bike.Speed == 3 || Bike.Speed == 4){
            StringSpeed = " kinda slow";
        } else if (Bike.Speed == 5) {
            StringSpeed = "kinda fast";
        }
        if (Bike.Adhesion == 1 || Bike.Adhesion == 2){
            StringAdhesion = "barely sticks to the ground";
        } else if (Bike.Adhesion == 3 || Bike.Adhesion == 4){
            StringAdhesion = "sticks to the ground";
        } else if (Bike.Adhesion == 5) {
            StringAdhesion = "grips the ground quite well";
        }
        return "This BIKE is " + StringSpeed + ", it has a " + Bike.Speed + " speed value, and it " + StringAdhesion + " with a " + Bike.Adhesion + " value of adhesion";
    }

}

