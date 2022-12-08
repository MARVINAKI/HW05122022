package Transport.Car;


import Human.MyException.WrongSumException;
import Transport.Car.Enums.BodyTypePass;
import Transport.Car.Enums.CarType;
import Transport.Car.Enums.LoadCapacity;
import Transport.Car.Enums.PassCapacity;
import Transport.Car.Methods.Competing;
import Transport.Transport;

public class Car
        extends Transport
        implements Competing {
    private CarType carType;
    private BodyTypePass bodyTypePass;
    private LoadCapacity loadCapacity;
    private PassCapacity passCapacity;
    private boolean statusCarDiag;
    private static int counter;
    private int id;
    private int prizeMoney;

    public Car(String brand, String model, double engineVolume, CarType carType, BodyTypePass bodyTypePass) {
        super(brand, model, engineVolume);
        this.carType = carType;
        if (carType == CarType.PASS) {
            this.bodyTypePass = bodyTypePass;
        }
        this.prizeMoney = 0;
        this.statusCarDiag = false;
        this.id = ++counter;
    }

    public Car(String brand, String model, double engineVolume, CarType carType, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.carType = carType;
        if (carType == CarType.TRUCK) {
            this.loadCapacity = loadCapacity;
        }
        this.prizeMoney = 0;
        this.statusCarDiag = false;
        this.id = ++counter;
    }

    public Car(String brand, String model, double engineVolume, CarType carType, PassCapacity passCapacity) {
        super(brand, model, engineVolume);
        this.carType = carType;
        if (carType == CarType.BUS) {
            this.passCapacity = passCapacity;
        }
        this.prizeMoney = 0;
        this.statusCarDiag = false;
        this.id = ++counter;
    }

    @Override
    public void doCarDiag() {
        if (getCarType() == CarType.BUS) {
            System.out.println(carType.getCarType() + " проходить диагностику не может");
        } else {
            System.out.println("Диагностика автомобиля " + getBrand());
            this.statusCarDiag = true;
        }
    }

    @Override
    public final void printType() {
        System.out.println(getBrand() + " " + getCarType());
    }

    @Override
    public final void startMoving() {
        System.out.println(getBrand() + " начало движения");
    }

    @Override
    public final void stopMoving() {
        System.out.println(getBrand() + " остановка");
    }

    @Override
    public final void refill() {

    }

    @Override
    public final void pitStop() {
        System.out.println(getBrand() + " пит-стоп");
    }

    @Override
    public final void bestTimeOfLap() {
        System.out.println(getBrand() + " лучшее время круга");
    }

    @Override
    public final void maxSpeed() {
        System.out.println(getBrand() + " максимальная скорость");
    }

    public final CarType getCarType() {
        return carType;
    }

    public final void setCarType(CarType carType) {
        if (getCarType() == null) {
            this.carType = carType;
        }
    }

    public final BodyTypePass getBodyTypePass() {
        return bodyTypePass;
    }

    public final void setBodyTypePass(BodyTypePass bodyTypePass) {
        if (getBodyTypePass() == null) {
            this.bodyTypePass = bodyTypePass;
        }
    }

    public final LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        if (getLoadCapacity() == null) {
            this.loadCapacity = loadCapacity;
        }
    }

    public PassCapacity getPassCapacity() {
        return passCapacity;
    }

    public void setPassCapacity(PassCapacity passCapacity) {
        if (getPassCapacity() == null) {
            this.passCapacity = passCapacity;
        }
    }

    public final boolean isStatusCarDiag() {
        return statusCarDiag;
    }

    public final int getId() {
        return id;
    }

    public final int getPrizeMoney() {
        return prizeMoney;
    }

    public final void setPrizeMoney(int prizeMoney) throws WrongSumException {
        if (prizeMoney > 0) {
            this.prizeMoney += prizeMoney;
        } else {
            throw new WrongSumException();
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", " + carType + ", " +
                (getCarType() == CarType.PASS ? bodyTypePass
                        : getCarType() == CarType.TRUCK ? loadCapacity
                        : getCarType() == CarType.BUS ? passCapacity : "") +
                "}" + "\n";
    }
}
