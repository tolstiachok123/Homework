package by.andruhovich.Task26;

public abstract class SmallDomesticAppliances extends DomesticAppliances {

    private boolean reparable;

    public SmallDomesticAppliances(boolean workCondition, boolean isItSmart, int power, boolean reparable) {
        super(workCondition, isItSmart, power);
        this.reparable = reparable;
    }

    public boolean isReparable() {
        return reparable;
    }

    public void setReparable(boolean reparable) {
        this.reparable = reparable;
    }

}
