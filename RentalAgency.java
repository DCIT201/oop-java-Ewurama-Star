import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailableForRental()) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }

    public void rentVehicle(Customer customer, Vehicle vehicle, int days) {
        customer.rentVehicle(vehicle);
        System.out.println(customer.getName() + " rented " + vehicle.getModel() + " for " + days + " days.");
    }

    public void returnVehicle(Customer customer, Vehicle vehicle) {
        customer.returnVehicle(vehicle);
        System.out.println(customer.getName() + " returned " + vehicle.getModel() + ".");
    }
}

    

