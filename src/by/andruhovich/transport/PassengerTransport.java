package by.andruhovich.transport;

import java.util.Objects;

public class PassengerTransport extends GroundTransport {

    private String bodyType;
    private int passengersQuantity;

    PassengerTransport(int power, int maxSpeed, int weight, String brand, int quantityWheels, int fuelConsumption, String bodyType, int passengersQuantity) {
        super(power, maxSpeed, weight, brand, quantityWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.passengersQuantity = passengersQuantity;
    }  // км/ч л/км ч

    public double powerToKWatts() {
        return super.getPower()*0.74;
    }

    public void fullCalculus(double timeInHovers) {
        System.out.println("За время " + timeInHovers + " часа, автомобиль " + super.getBrand() + " двигаясь с максимальной скоростью " + super.getMaxSpeed() + " км/ч, израсходует " + super.getFuelConsumption() * super.getMaxSpeed() * timeInHovers + " литров топлива.");
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getPassengersQuantity() {
        return passengersQuantity;
    }

    public void setPassengersQuantity(int passengersQuantity) {
        this.passengersQuantity = passengersQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerTransport that = (PassengerTransport) o;
        return getPassengersQuantity() == that.getPassengersQuantity() &&
                getBodyType().equals(that.getBodyType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBodyType(), getPassengersQuantity());
    }

    @Override
    public String toString() {
        return "PassengerTransport{" +
                "power=" + super.getPower() + '\'' +
                "power(kW)=" + this.powerToKWatts() + '\'' +
                "maxSpeed=" + super.getMaxSpeed() + '\'' +
                "weight=" + super.getWeight() + '\'' +
                "brand=" + super.getBrand() + '\'' +
                "quantityWheels=" + super.getQuantityWheels() + '\'' +
                "fuelConsumption=" + super.getFuelConsumption() + '\'' +
                "bodyType='" + bodyType + '\'' +
                ", passengersQuantity=" + passengersQuantity +
                '}';
    }
}
