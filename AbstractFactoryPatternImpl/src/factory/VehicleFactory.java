package factory;

import vehicle.Vehicle;

public class VehicleFactory {
    private LuxuryVehicleFactory luxuryVehicleFactory;
    private NormalVehicleFactory normalVehicleFactory;
    VehicleFactory(){
        this.luxuryVehicleFactory = new LuxuryVehicleFactory();
        this.normalVehicleFactory = new NormalVehicleFactory();
    }
    public Vehicle getVehicle(String category,String vehicle){
        switch(category){
            case "LUXURY":
                return luxuryVehicleFactory.getVehicle(vehicle);
            case "NORMAL":
                return normalVehicleFactory.getVehicle(vehicle);
            default:
                return null;
        }
    }
}
