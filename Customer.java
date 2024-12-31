import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String licenseNumber;
    private List<Vehicle> rentalHistory;

    public Customer(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rentalHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public List<Vehicle> getRentalHistory() {
        return rentalHistory;
    }

    public void rentVehicle(Vehicle vehicle) {
        if (!vehicle.isAvailableForRental()) {
            throw new IllegalStateException("Vehicle is not available for rental.");
        }
        rentalHistory.add(vehicle);
        vehicle.setAvailable(false);
    }

    public void returnVehicle(Vehicle vehicle) {
        rentalHistory.remove(vehicle);
        vehicle.setAvailable(true);
    }
}

    

