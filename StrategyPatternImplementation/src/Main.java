import vehicle.CarVehicle;
import vehicle.SportsCarVehicle;

public class Main {
    public static void main(String[] args) {
        CarVehicle carVehicle = new CarVehicle();
        SportsCarVehicle sportsCarVehicle = new SportsCarVehicle();
        System.out.println(carVehicle.drive());
        System.out.println(sportsCarVehicle.drive());
    }
}