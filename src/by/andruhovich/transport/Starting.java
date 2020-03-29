package by.andruhovich.transport;

public class Starting {
    public static void main(String[] args) {
        MilitaryAirTransport tu160 = new MilitaryAirTransport(10000, 2500, 100, "ОКБ Туполев", 56, 1000, false, 100);
        tu160.isAvailabilityCatapult();
        tu160.toString();
    }
}
