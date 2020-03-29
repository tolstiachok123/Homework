package by.andruhovich.annotate;

import java.util.Objects;

@Version(classVersion = 7.1, codeName = "Nougat")
public class Service {

    private int anyInt;
    private String anyString;

    public void thisClassInfo(){

    }

    public int getAnyInt() {
        return anyInt;
    }

    public void setAnyInt(int anyInt) {
        this.anyInt = anyInt;
    }

    public String getAnyString() {
        return anyString;
    }

    public void setAnyString(String anyString) {
        this.anyString = anyString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return getAnyInt() == service.getAnyInt() &&
                getAnyString().equals(service.getAnyString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAnyInt(), getAnyString());
    }

    @Override
    public String toString() {
        return "Service{" +
                "anyInt=" + anyInt +
                ", anyString='" + anyString + '\'' +
                '}';
    }
}
