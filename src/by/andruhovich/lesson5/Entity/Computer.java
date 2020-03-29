package by.andruhovich.lesson5.Entity;

public class Computer {

    private Processor processor;
    private RAM ram;
    private HDD hdd;
    private int resource;
    private boolean isItWork;

    public void setIsItWork(boolean isItWork) {
        this.isItWork = isItWork;
    }

    public boolean isItWork() {
        return isItWork;
    }

    public Computer(Processor processor, RAM ram, HDD hdd, int resource) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
        this.isItWork = true;
    }

    public Computer() {
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
        String computerInfo = "HDD(" + hdd.toString() + ") RAM(" + ram.toString() + ") Processor(" + processor.toString() + ") Resource-" + resource;
        return computerInfo;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }
}
