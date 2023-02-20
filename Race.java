import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Race {
    
    private static final String String = null;
    public int MinVehicle;
    public int MaxVehicle;
    public List<Vehicle> AllVehicles;
    public List<Viewer> AllViewers;

    public Race(int minVehicle, int maxVehicle, List<Vehicle> allVehicles, List<Viewer> allViewers) {
        this.MinVehicle = minVehicle;
        this.MaxVehicle = maxVehicle;
        this.AllVehicles = allVehicles;
        this.AllViewers = allViewers;
    }

    public void AddVehicle(Vehicle vehicle){
        this.AllVehicles.add(vehicle);
    }   
    public void AddViewer(Viewer viewer){
        this.AllViewers.add(viewer);
    }
    public Vehicle[] StartRace(){
        List<Vehicle> resultatList = new ArrayList<Vehicle>();
        if (this.MinVehicle > this.AllVehicles.size()){
            System.out.println("there are" + this.AllVehicles.size() + "vehicles in the race when there should be at least" + this.MinVehicle);    
        } else if (this.MaxVehicle < this.AllVehicles.size()){
            System.out.println("there are" + this.AllVehicles.size() + "vehicles in the race when there should be at least" + this.MinVehicle);
        } else {
            int distance = new Random().nextInt(100, 1000 + 1);
            while (true){
                if (resultatList.size() >= this.AllVehicles.size() ){
                    Vehicle[] result = resultatList.toArray(new Vehicle[0]);
                    return result;
                }
                for (int i = 0; i < this.AllVehicles.size(); i++){
                    Vehicle vehicle = this.AllVehicles.get(i);
                    if (vehicle.getOut() > 0){
                        vehicle.setOut(vehicle.getOut() - 1);
                    } else if (!resultatList.contains(vehicle)){
                        vehicle.Forward(i, i, i);
                        System.out.println("the " + vehicle.getPilotName(String) + " has traveled " + vehicle.getDistanceTraveled() + "Km");
                        if (vehicle.getDistanceTraveled() >= distance){
                            resultatList.add(vehicle);
                            System.out.println("The " + vehicle.getPilotName(String) + "  the race");
                        }
                    }
                }
            }
        }
        return new Vehicle[0];
    }
}
