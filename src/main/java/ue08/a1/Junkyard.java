package ue08.a1;

import java.util.Collection;

public class Junkyard {
    private Collection<? super Vehicle> vehicles;

    public Junkyard(Collection<? super Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public <A extends Vehicle> void destroyVehicle(A vehicle) {
        if(!vehicle.isHasTuv()){
            vehicles.add(vehicle);
        }
    }
}
