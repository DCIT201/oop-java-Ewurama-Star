public abstract class Vehicle {
    private final String vehicleId; // Encapsulated field
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
       
    }

    // Encapsulation with validation
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Model cannot be empty.");
        }
        this.model = model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        if (baseRentalRate <= 0) {
            throw new IllegalArgumentException("Rental rate must be positive.");
        }
        this.baseRentalRate = baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Abstract methods
    public abstract double calculateRentalCost(int days);

    public abstract boolean isAvailableForRental();

    @Override
    public String toString() {
        return "Vehicle [ID=" + vehicleId + ", Model=" + model + ", BaseRate=" + baseRentalRate + "]";
    }
}
 // Subclass Car
 class Car extends Vehicle{
    public Car ( String vehicleId, String model, double baseRentalRate){
        super ( vehicleId, model, baseRentalRate);
    }
 
    @Override
    public double
    calculateRentalCost(int days){
        return getBaseRentalRate()*days; //Simple calculation
    }

    @Override
    public boolean isAvailableForRental(){
        return isAvailable(); ///Check availability

        //Main class with the main method 
        public class Main{
            public static void main(String[] args){
            // Create an instance of ar
            Vehicle myCar = new Car("CAR123", "Toyota Corolla", 60.0);
            System.out.println(myCar);

            //Test rental calculation
            System.out.println("Rental cost for 5 days:" + myCar.calculateRentalCost(5));
 }
        }
    }