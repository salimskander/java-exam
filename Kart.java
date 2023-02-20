import java.util.Random;

public class Kart extends Vehicle { // Kart is a subclass of Vehicle

    static int Speed = new Random().nextInt(5, 10 + 1);
    static int Adhesion = new Random().nextInt(5, 10 + 1);

    public Kart(String pilotName) {
        super(Speed, Adhesion, pilotName);
    }

    public String toString(){
        String StringSpeed = "";
        String StringAdhesion = "";
        if (Kart.Speed == 1 || Kart.Speed == 2){
            StringSpeed = "so slow, so boring";
        } else if (Kart.Speed == 3 || Kart.Speed == 4){
            StringSpeed = " kinda slow";
        } else if (Kart.Speed == 5 || Kart.Speed == 6) {
            StringSpeed = "kinda fast";
        } else if (Kart.Speed == 7 || Kart.Speed == 8) {
            StringSpeed = "fast";
        } else if (Kart.Speed == 9 || Kart.Speed == 10) {
            StringSpeed = "so fast, so exciting";
        }
        if (Kart.Adhesion == 1 || Kart.Adhesion == 2){
            StringAdhesion = "barely sticks to the ground";
        } else if (Kart.Adhesion == 3 || Kart.Adhesion == 4){
            StringAdhesion = "sticks to the ground";
        } else if (Kart.Adhesion == 5 || Kart.Adhesion == 6) {
            StringAdhesion = "grips the ground quite well";
        } else if (Kart.Adhesion == 7 || Kart.Adhesion == 8) {
            StringAdhesion = "adheres well to the ground";
        } else if (Kart.Adhesion == 9 || Kart.Adhesion == 10) {
            StringAdhesion = "adheres perfectly to the ground";
        }
        return "This KART is " + StringSpeed + ", it has a " + Kart.Speed + " speed value, and it " + StringAdhesion + " with a " + Kart.Adhesion + " value of adhesion";
    }

}
