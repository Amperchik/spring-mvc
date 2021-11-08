package web.model;

import org.springframework.stereotype.Component;

public class Car {
    private  String model;
    private int version;
    private String owner;

    public Car(String model, int version, String owner) {
        this.model = model;
        this.version = version;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", version=" + version +
                ", owner='" + owner + '\'' +
                '}';
    }
}
