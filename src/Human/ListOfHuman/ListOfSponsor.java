package Human.ListOfHuman;

import Human.Sponsor;

import java.util.ArrayList;

public class ListOfSponsor {
    private ArrayList<Sponsor> listOfSponsor = new ArrayList<>();

    public void addToList(Sponsor sponsor) {
        this.listOfSponsor.add(sponsor);
    }

    public final ArrayList<Sponsor> getListOfSponsor() {
        return listOfSponsor;
    }

    @Override
    public String toString() {
        return "Список спонсоров " + listOfSponsor;
    }
}
