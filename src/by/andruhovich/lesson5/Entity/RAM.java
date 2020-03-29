package by.andruhovich.lesson5.Entity;

public class RAM {

    private String memoryType;
    private int volumeMemory;

    public RAM(String memoryType, int volumeMemory) {
        this.memoryType = memoryType;
        this.volumeMemory = volumeMemory;
    }

    public RAM() {
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public int getVolumeMemory() {
        return volumeMemory;
    }

    public void setVolumeMemory(int volumeMemory) {
        this.volumeMemory = volumeMemory;
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
        String remInfo = "memoryType-" + memoryType + " volumeMemory-" + volumeMemory;
        return remInfo;
    }
}
