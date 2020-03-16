package by.andruhovich.lesson5.Entity;

public class Processor {

    private int quantityCores;
    private double clockRate;
    private int volumeCache;

    public Processor(int quantityCores, double clockRate, int volumeCache) {
        this.quantityCores = quantityCores;
        this.clockRate = clockRate;
        this.volumeCache = volumeCache;
    }

    public Processor() {
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
        String processorInfo = "clockRate-" + Double.toString(clockRate) + " quantityCores-" + Integer.toString(quantityCores) + " volumeCache-" + Integer.toString(volumeCache);
        return processorInfo;
    }

    public int getQuantityCores() {
        return quantityCores;
    }

    public void setQuantityCores(int quantityCores) {
        this.quantityCores = quantityCores;
    }

    public double getClockRate() {
        return clockRate;
    }

    public void setClockRate(double clockRate) {
        this.clockRate = clockRate;
    }

    public int getVolumeCache() {
        return volumeCache;
    }

    public void setVolumeCache(int volumeCache) {
        this.volumeCache = volumeCache;
    }
}
