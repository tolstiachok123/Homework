package by.andruhovich.transport;

public abstract class AirTransport extends Transport{

    private int wingspan;
    private int runwayLength;

    AirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int runwayLength) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.runwayLength = runwayLength;
    }

    @Override
    void move() {
        System.out.println("Fly! *fly-sound)");
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getRunwayLength() {
        return runwayLength;
    }

    public void setRunwayLength(int runwayLength) {
        this.runwayLength = runwayLength;
    }
}
