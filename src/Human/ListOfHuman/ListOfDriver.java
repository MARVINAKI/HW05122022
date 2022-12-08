package Human.ListOfHuman;

import Human.Driver;
import Transport.Car.Car;

import java.util.ArrayList;

public class ListOfDriver {
    private ArrayList<Driver> listOfDriver = new ArrayList<>();

    public void addToList(Driver driver) {
        this.listOfDriver.add(driver);
    }

    public ArrayList<Driver> getListOfDriver() {
        return listOfDriver;
    }

    @Override
    public String toString() {
        return "Список водителей " + listOfDriver;
    }
}
