package by.andruhovich.transport;

import java.util.Objects;

public class CivilAirTransport extends AirTransport {

    private int passengersQuantity;
    private boolean availabilityBusinessClass;

    CivilAirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int runwayLength, int passengersQuantity, boolean availabilityBusinessClass) {
        super(power, maxSpeed, weight, brand, wingspan, runwayLength);
        this.passengersQuantity = passengersQuantity;
        this.availabilityBusinessClass = availabilityBusinessClass;
    }

    public double powerToKWatts() {
        return super.getPower()*0.74;
    }

    public void isEnouhgPassengersSits(int passengers) {
        if (this.passengersQuantity < passengers) {
            System.out.println("Вам нужен самолёт по-больше");
        }
        else System.out.println("Самолёт загружен");
    }

    public int getPassengersQuantity() {
        return passengersQuantity;
    }

    public void setPassengersQuantity(int passengersQuantity) {
        this.passengersQuantity = passengersQuantity;
    }

    public boolean isAvailabilityBusinessClass() {
        return availabilityBusinessClass;
    }

    public void setAvailabilityBusinessClass(boolean availabilityBusinessClass) {
        this.availabilityBusinessClass = availabilityBusinessClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CivilAirTransport that = (CivilAirTransport) o;
        return getPassengersQuantity() == that.getPassengersQuantity() &&
                isAvailabilityBusinessClass() == that.isAvailabilityBusinessClass();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPassengersQuantity(), isAvailabilityBusinessClass());
    }

    @Override
    public String toString() {
        return "CivilAirTransport{" +
                "power=" + super.getPower() + '\'' +
                "power(kW)=" + this.powerToKWatts() + '\'' +
                "maxSpeed=" + super.getMaxSpeed() + '\'' +
                "weight=" + super.getWeight() + '\'' +
                "brand=" + super.getBrand() + '\'' +
                "wingspan=" + super.getWingspan() + '\'' +
                "runwayLength=" + super.getRunwayLength() + '\'' +
                "passengersQuantity=" + passengersQuantity + '\'' +
                ", availabilityBusinessClass=" + availabilityBusinessClass +
                '}';
    }
}
