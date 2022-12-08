package Human;

import Human.Enum.DriverLic;
import Transport.Car.Car;
import Transport.Car.Enums.CarType;

public class Driver
        <A extends Car>
        extends Human {
    private DriverLic driverLic;
    private int experience;

    public Driver(String name, DriverLic driverLic, int experience) {
        super(name);
        setDriverLic(driverLic);
        setExperience(experience);
    }

    public final void startMoving() {

    }

    public final void stopMoving() {

    }

    public final void refill() {

    }

    public final void printDriverCar(A car) {
        if (getDriverLic() == DriverLic.CAT_B && car.getCarType() == CarType.PASS) {
            System.out.println("Водитель " + getName() + " управляет автомобилем " + car.getBrand() + " и будет участвовать в заезде");
            return;
        }
        if (getDriverLic() == DriverLic.CAT_C && car.getCarType() == CarType.TRUCK) {
            System.out.println("Водитель " + getName() + " управляет автомобилем " + car.getBrand() + " и будет участвовать в заезде");
            return;
        }
        if (getDriverLic() == DriverLic.CAT_D && car.getCarType() == CarType.BUS) {
            System.out.println("Водитель " + getName() + " управляет автомобилем " + car.getBrand() + " и будет участвовать в заезде");
            return;
        }
        System.out.println("Водитель " + getName() + " не может управляет автомобилем " + car.getBrand());
    }

    public final DriverLic getDriverLic() {
        return driverLic;
    }

    public final void setDriverLic(DriverLic driverLic) {
        if (driverLic == null) {
            throw new NullPointerException("Значение не может быть нулевым");
        } else {
            this.driverLic = driverLic;
        }
    }

    public final int getExperience() {
        return experience;
    }

    public final void setExperience(int experience) {
        this.experience = Math.abs(experience);
    }

    @Override
    public String toString() {
        return "Driver" + super.toString() +
                ", driverLic=" + driverLic +
                ", experience=" + experience +
                '}';
    }
}
