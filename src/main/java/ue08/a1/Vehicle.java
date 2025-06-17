package ue08.a1;

public abstract class Vehicle {
    private String brand;
    private boolean hasTuv;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isHasTuv() {
        return hasTuv;
    }

    public void setHasTuv(boolean hasTuv) {
        this.hasTuv = hasTuv;
    }
}
