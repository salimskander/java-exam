import java.util.Random;

public class Motorbike extends Vehicle { // Motorbike is a subclass of Vehicle

    static int Speed = new Random().nextInt(5, 10 + 1);
    static int Adhesion = new Random().nextInt(1, 5 + 1);

    public Motorbike(String pilotName) {
        super(Speed, Adhesion, pilotName);
    }

    public String toString(){
        String StringSpeed = "";
        String StringAdhesion = "";
        if (Motorbike.Speed == 1 || Motorbike.Speed == 2){
            StringSpeed = "so slow, so boring";
        } else if (Motorbike.Speed == 3 || Motorbike.Speed == 4){
            StringSpeed = " kinda slow";
        } else if (Motorbike.Speed == 5 || Motorbike.Speed == 6) {
            StringSpeed = "kinda fast";
        } else if (Motorbike.Speed == 7 || Motorbike.Speed == 8) {
            StringSpeed = "dang fast";
        } else if (Motorbike.Speed == 9 || Motorbike.Speed == 10) {
            StringSpeed = "so fast, so exciting";
        }
        if (Motorbike.Adhesion == 1 || Motorbike.Adhesion == 2){
            StringAdhesion = "barely sticks to the ground";
        } else if (Motorbike.Adhesion == 3 || Motorbike.Adhesion == 4){
            StringAdhesion = "sticks to the ground";
        } else if (Motorbike.Adhesion == 5 || Motorbike.Adhesion == 6) {
            StringAdhesion = "grips the ground quite well";
        } else if (Motorbike.Adhesion == 7 || Motorbike.Adhesion == 8) {
            StringAdhesion = "adheres well to the ground";
        } else if (Motorbike.Adhesion == 9 || Motorbike.Adhesion == 10) {
            StringAdhesion = "adheres perfectly to the ground";
        }
        return "This MOTORBIKE has a" + Motorbike.Speed + " speed value, it means it is " + StringSpeed + ", and it " + StringAdhesion + " with a " + Kart.Adhesion + " value of adhesion";
    }

}
