package vehicle;

import strategy.DrivingStrategy;
import strategy.SportDrivingStrategy;

public class SportsCarVehicle implements Vehicle{
    private final DrivingStrategy drivingStrategy;
    public SportsCarVehicle(){
        this.drivingStrategy = new SportDrivingStrategy();
    }
    @Override
    public String drive() {
        return drivingStrategy.drive();
    }
}
