package by.andruhovich.lesson5.Entity;

public class HDD {

    private String type;
    private double volume;

    public HDD(String type, double volume) {
        this.type = type;
        this.volume = volume;
    }

    public HDD() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        String hddInfo = "type-" + type + " volume-" + Double.toString(volume);
        return hddInfo;
    }
}
