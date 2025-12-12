package factory;

import vehicle.BMWVehicle;
import vehicle.MercedesVehicle;
import vehicle.Vehicle;

public class LuxuryVehicleFactory {
    public Vehicle getVehicle(String vehicle){
        switch(vehicle){
            case "MERCEDES":
                return new MercedesVehicle();
            case "BMW":
                return new BMWVehicle();
            default:
                return null;
        }
    }
}
