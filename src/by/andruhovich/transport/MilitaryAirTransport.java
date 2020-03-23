package by.andruhovich.transport;

import java.util.Objects;

public class MilitaryAirTransport extends AirTransport{

    private boolean availabilityCatapult;
    private int missileQuantity;

    MilitaryAirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int runwayLength, boolean availabilityCatapult, int missileQuantity) {
        super(power, maxSpeed, weight, brand, wingspan, runwayLength);
        this.availabilityCatapult = availabilityCatapult;
        this.missileQuantity = missileQuantity;
    }

    public double powerToKWatts() {
        return super.getPower()*0.74;
    }

    private void shot() {
        while (this.missileQuantity != 0) {
            System.out.println("Ракета пошла...");
            this.setMissileQuantity(this.getMissileQuantity()-1);
        }
        System.out.println("Боеприпасы отсутствуют");
    }

    public void isAvailabilityCatapult() {
        if (this.getAvailabilityCatapult()) {
            System.out.println("Катапультирование прошло успешно");
        } else System.out.println("У вас нет такой системы");
    }

    public boolean getAvailabilityCatapult() {
        return availabilityCatapult;
    }

    public void setAvailabilityCatapult(boolean availabilityCatapult) {
        this.availabilityCatapult = availabilityCatapult;
    }

    public int getMissileQuantity() {
        return missileQuantity;
    }

    public void setMissileQuantity(int missileQuantity) {
        this.missileQuantity = missileQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MilitaryAirTransport that = (MilitaryAirTransport) o;
        return getAvailabilityCatapult() == that.getAvailabilityCatapult() &&
                getMissileQuantity() == that.getMissileQuantity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAvailabilityCatapult(), getMissileQuantity());
    }

    @Override
    public String toString() {
        return "MilitaryAirTransport{" +
                "power=" + super.getPower() + '\'' +
                "power(kW)=" + this.powerToKWatts() + '\'' +
                "maxSpeed=" + super.getMaxSpeed() + '\'' +
                "weight=" + super.getWeight() + '\'' +
                "brand=" + super.getBrand() + '\'' +
                "wingspan=" + super.getWingspan() + '\'' +
                "runwayLength=" + super.getRunwayLength() + '\'' +
                "availabilityCatapult=" + availabilityCatapult + '\'' +
                ", missileQuantity=" + missileQuantity +
                '}';
    }
}
