package factory;

import vehicle.Vehicle;

public class AbstractFactoryPatternImpl {
    public static void main(String args[]){
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle mercedes = vehicleFactory.getVehicle("LUXURY","MERCEDES");
        Vehicle bmw = vehicleFactory.getVehicle("LUXURY","BMW");
        Vehicle hyundai = vehicleFactory.getVehicle("NORMAL","HYUNDAI");
        Vehicle honda = vehicleFactory.getVehicle("NORMAL","HONDA");

        System.out.println(mercedes.getVehicle());
        System.out.println(bmw.getVehicle());
        System.out.println(hyundai.getVehicle());
        System.out.println(honda.getVehicle());
    }
}
