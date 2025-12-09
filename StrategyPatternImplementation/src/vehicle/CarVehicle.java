package vehicle;

import strategy.DrivingStrategy;
import strategy.NormalDrivingStrategy;

public class CarVehicle implements Vehicle {
    private final DrivingStrategy drivingStrategy;
    public CarVehicle(){
        drivingStrategy = new NormalDrivingStrategy();
    }
    @Override
    public String drive() {
        return drivingStrategy.drive();
    }
}
