package Human;

import Transport.Car.Car;
import Transport.Car.Enums.CarType;

import java.util.Arrays;

public class Mechanic
        extends Human {
    private String mechanicCompany;
    private CarType[] carTypeSupp;

    public Mechanic(String name, String mechanicCompany, CarType... carTypeSupp) {
        super(name);
        this.mechanicCompany = mechanicCompany;
        for (CarType type : CarType.values()) {
            this.carTypeSupp = carTypeSupp;
        }
    }

    public final void doMaintence(Car car) {
        for (CarType carType : carTypeSupp) {
            if (car.getCarType() == carType) {
                car.doCarDiag();
            }
        }
    }

    public final void repairCar(Car car) {
        for (CarType carType : carTypeSupp) {
            if (car.getCarType() == carType) {
                System.out.println(getName() + " чинит машину " + car.getBrand() + " " + car.getModel());
            }
        }
    }

    public void printMechCarSupp() {
        for (CarType carType : carTypeSupp) {
            System.out.println(carType);
        }
    }

    public CarType[] getCarType() {
        return carTypeSupp;
    }

    @Override
    public String toString() {
        return "Mechanic" + super.toString() +
                ", mechanicCompany='" + mechanicCompany + '\'' +
                ", carTypeSupp=" + Arrays.toString(carTypeSupp) +
                '}';
    }
}
