package by.andruhovich.transport;

public abstract class GroundTransport extends Transport {

    private int quantityWheels;
    private int fuelConsumption;

    GroundTransport(int power, int maxSpeed, int weight, String brand, int quantityWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.quantityWheels = quantityWheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    void move() {
        System.out.println("Ride! Wruum-wruuumm!!!");
    }

    public int getQuantityWheels() {
        return quantityWheels;
    }

    public void setQuantityWheels(int quantityWheels) {
        this.quantityWheels = quantityWheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
