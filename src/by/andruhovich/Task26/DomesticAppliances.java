package by.andruhovich.Task26;

public abstract class DomesticAppliances {

    private boolean workCondition;
    private boolean isItSmart;
    private final int power;

    protected DomesticAppliances(boolean workCondition, boolean isItSmart, int power) {
        this.workCondition = workCondition;
        this.isItSmart = isItSmart;
        this.power = power;
    }

    public void turnOn() {
        this.workCondition = true;
    }

    public void turnOff() {
        this.workCondition = false;
    }

    public boolean isWorkCondition() {
        return workCondition;
    }

    public void setWorkCondition(boolean workCondition) {
        this.workCondition = workCondition;
    }

    public boolean isItSmart() {
        return isItSmart;
    }

    public void setItSmart(boolean itSmart) {
        isItSmart = itSmart;
    }

    public int getPower() {
        return power;
    }
}
