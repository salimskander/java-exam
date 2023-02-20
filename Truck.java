import java.util.Random;

public class Truck extends Vehicle { // Truck is a subclass of Vehicle

    static int Speed = new Random().nextInt(1, 5 + 1);
    static int Adhesion = new Random().nextInt(5, 10 + 1);

    public Truck(String pilotName) {
        super(Speed, Adhesion, pilotName);
    }

    public String toString(){
        String StringSpeed = "";
        String StringAdhesion = "";
        if (Truck.Speed == 1 || Truck.Speed == 2){
            StringSpeed = "so slow, so boring";
        } else if (Truck.Speed == 3 || Truck.Speed == 4){
            StringSpeed = " kinda slow";
        } else if (Truck.Speed == 5 || Truck.Speed == 6) {
            StringSpeed = "kinda fast";
        } else if (Truck.Speed == 7 || Truck.Speed == 8) {
            StringSpeed = "fast";
        } else if (Truck.Speed == 9 || Truck.Speed == 10) {
            StringSpeed = "so fast, so exciting";
        }
        if (Truck.Adhesion == 1 || Truck.Adhesion == 2){
            StringAdhesion = "barely sticks to the ground";
        } else if (Truck.Adhesion == 3 || Truck.Adhesion == 4){
            StringAdhesion = "sticks to the ground";
        } else if (Truck.Adhesion == 5 || Truck.Adhesion == 6) {
            StringAdhesion = "grips the ground quite well";
        } else if (Truck.Adhesion == 7 || Truck.Adhesion == 8) {
            StringAdhesion = "adheres well to the ground";
        } else if (Truck.Adhesion == 9 || Truck.Adhesion == 10) {
            StringAdhesion = "adheres perfectly to the ground";
        }
        return "This TRUCK is " + StringSpeed + ", it has a " + Truck.Speed + " speed value, and it " + StringAdhesion + " with a " + Truck.Adhesion + " value of adhesion";
    }

}
