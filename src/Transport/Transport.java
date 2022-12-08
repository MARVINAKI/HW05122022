package Transport;

import Transport.Car.Car;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    public abstract void printType();

    public abstract void doCarDiag();
    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void refill();

    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        if (getBrand() == null || getBrand().trim().isEmpty()) {
            this.brand = brand.trim();
        }
    }

    public final String getModel() {
        return model;
    }

    public final void setModel(String model) {
        if (getModel() == null || getModel().trim().isEmpty()) {
            this.model = model.trim();
        }
    }

    public final double getEngineVolume() {
        return engineVolume;
    }

    public final void setEngineVolume(double engineVolume) {
        double scale = Math.pow(10, 2);
        this.engineVolume = engineVolume; // ЗНАКИ ПОСЛЕ ЗАПЯТОЙ!!!
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume='" + engineVolume + '\'';
    }
}
