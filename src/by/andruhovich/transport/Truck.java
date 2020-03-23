package by.andruhovich.transport;

import java.util.Objects;

public class Truck extends GroundTransport {

    private int carryingCapacity;

    Truck(int power, int maxSpeed, int weight, String brand, int quantityWheels, int fuelConsumption, int carryingCapacity) {
        super(power, maxSpeed, weight, brand, quantityWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public double powerToKWatts() {
        return super.getPower()*0.74;
    }

    public void isEnouhgCarryingCapacity(int carryingCapacity) {
        if (this.carryingCapacity < carryingCapacity) {
            System.out.println("Вам нужен грузовик по-больше");
        }
        else System.out.println("Грузовик загружен");
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return getCarryingCapacity() == truck.getCarryingCapacity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarryingCapacity());
    }

    @Override
    public String toString() {
        return "Truck{" +
                "power=" + super.getPower() + '\'' +
                "power(kW)=" + this.powerToKWatts() + '\'' +
                "maxSpeed=" + super.getMaxSpeed() + '\'' +
                "weight=" + super.getWeight() + '\'' +
                "brand=" + super.getBrand() + '\'' +
                "quantityWheels=" + super.getQuantityWheels() + '\'' +
                "fuelConsumption=" + super.getFuelConsumption() + '\'' +
                "carryingCapacity=" + carryingCapacity +
                '}';
    }
}
