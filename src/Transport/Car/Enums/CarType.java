package Transport.Car.Enums;

import Human.Driver;

public enum CarType {
    BUS("Автобус"),
    PASS("Легковая машина"),
    TRUCK("Грузова машина");

    private String carType;

    CarType(String carType) {
        this.carType = carType;
    }

    public final String getCarType() {
        return carType;
    }

    @Override
    public String toString() {
        return "CarType{" + carType + '}';
    }
}
