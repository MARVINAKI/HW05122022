package Human.ListOfHuman;

import Human.Mechanic;

import java.util.ArrayList;

public class ListOfMechanic {
    private ArrayList<Mechanic> listOfMechanic = new ArrayList<>();

    public void addToList(Mechanic mechanic) {
        this.listOfMechanic.add(mechanic);
    }

    public final ArrayList<Mechanic> getListOfMechanic() {
        return listOfMechanic;
    }

    @Override
    public String toString() {
        return "Список механиков " + listOfMechanic;
    }
}
