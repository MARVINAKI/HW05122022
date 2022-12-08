package Transport.Car.Garage;

import Transport.Car.Car;
import Transport.Car.Enums.CarType;
import Transport.Car.MyException.NotDiagException;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Car> listOfCar = new ArrayList<>();

    public void addToGarage(Car car) {
        this.listOfCar.add(car);
    }

    public void checkCarDiag() throws NotDiagException {
        for (Car car : listOfCar) {
            if (car.getCarType() == CarType.BUS) {
                System.out.println("Автобус " + car.getBrand() + " " + car.getModel() + " в диагностике не требуется");
            } else if (car.isStatusCarDiag()) {
                System.out.print(car.getBrand() + " " + car.getModel() + ": ");
                System.out.println("Диагностика пройдена");
            } else {
                System.out.print(car.getBrand() + " " + car.getModel() + ": ");
                throw new NotDiagException();
            }
        }
    }

    public final ArrayList<Car> getListOfCar() {
        return listOfCar;
    }


    @Override
    public String toString() {
        return "Гараж(список машин)" + listOfCar;
    }
}
