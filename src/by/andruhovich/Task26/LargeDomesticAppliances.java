package by.andruhovich.Task26;

public abstract class LargeDomesticAppliances extends DomesticAppliances {

    private double length;
    private double height;
    private double width;
    private double weight;

    public LargeDomesticAppliances(boolean workCondition, boolean isItSmart, int power, double length, double height, double width, double weight) {
        super(workCondition, isItSmart, power);
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
