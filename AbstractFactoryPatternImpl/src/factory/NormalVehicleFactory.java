package factory;

import vehicle.HondaVehicle;
import vehicle.HyundaiVehicle;
import vehicle.Vehicle;

public class NormalVehicleFactory {
    public Vehicle getVehicle(String vehicle){
        switch (vehicle){
            case "HYUNDAI":
                return new HyundaiVehicle();
            case "HONDA":
                return new HondaVehicle();
            default:
                return null;
        }
    }
}
