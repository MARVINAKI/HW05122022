import Human.Driver;
import Human.Enum.DriverLic;
import Human.ListOfHuman.ListOfDriver;
import Human.ListOfHuman.ListOfMechanic;
import Human.ListOfHuman.ListOfSponsor;
import Human.Mechanic;
import Human.MyException.WrongSumException;
import Human.Sponsor;
import Transport.Car.Car;
import Transport.Car.Enums.BodyTypePass;
import Transport.Car.Enums.CarType;
import Transport.Car.Enums.LoadCapacity;
import Transport.Car.Enums.PassCapacity;
import Transport.Car.Garage.Garage;
import Transport.Car.MyException.NotDiagException;
import User.MyException.WrongLoginException;
import User.MyException.WrongPasswordException;
import User.User;
import User.UserMethod;

public class Main {
    public static void main(String[] args)
            throws WrongLoginException, WrongPasswordException, NotDiagException, WrongSumException {
        Garage garage = new Garage();
        Car car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11, car12;
        garage.addToGarage(car1 = new Car("Lada", "Priora", 1.6, CarType.PASS, BodyTypePass.UNIVERSAL));
        garage.addToGarage(car2 = new Car("Nissan", "Terrano", 2, CarType.PASS, BodyTypePass.CROSSOVER));
        garage.addToGarage(car3 = new Car("brand3", "model3", 2, CarType.PASS, BodyTypePass.HATCHBACK));
        garage.addToGarage(car4 = new Car("brand4", "model4", 2, CarType.PASS, BodyTypePass.SEDAN));

        garage.addToGarage(car5 = new Car("brand5", "model5", 2, CarType.TRUCK, LoadCapacity.N1));
        garage.addToGarage(car6 = new Car("brand6", "model6", 2, CarType.TRUCK, LoadCapacity.N3));
        garage.addToGarage(car7 = new Car("brand7", "model7", 2, CarType.TRUCK, LoadCapacity.N2));
        garage.addToGarage(car8 = new Car("brand8", "model8", 2, null, LoadCapacity.N1));

        garage.addToGarage(car9 = new Car("brand9", "model9", 2, CarType.BUS, PassCapacity.VERY_SMALL));
        garage.addToGarage(car10 = new Car("brand10", "model10", 2, CarType.BUS, PassCapacity.SMALL));
        garage.addToGarage(car11 = new Car("brand11", "model11", 2, CarType.BUS, PassCapacity.BIG));
        garage.addToGarage(car12 = new Car("brand12", "model12", 2, CarType.BUS, LoadCapacity.N3));

//        for (Car car : garage.getListOfCar()) {
//            car.doCarDiag();
//        }
//        garage.checkCarDiag();


        ListOfDriver listOfDriver = new ListOfDriver();
        Driver driver1, driver2;
        listOfDriver.addToList(driver1 = new Driver("Александр", DriverLic.CAT_B, 17));
        listOfDriver.addToList(driver2 = new Driver("Костя", DriverLic.CAT_B, 13));

        User user1 = new User("!", "12345678", "12345678");

        ListOfSponsor listOfSponsor = new ListOfSponsor();
        Sponsor sponsor1, sponsor2;
        listOfSponsor.addToList(sponsor1 = new Sponsor("Греф Герман", 10_000_001));
        listOfSponsor.addToList(sponsor2 = new Sponsor("Михаил Прохоров", 10_000_001));
        sponsor2.doSponsorRace(100000, car1);
        System.out.println(listOfDriver);

        ListOfMechanic listOfMechanic = new ListOfMechanic();
        Mechanic mechanic1, mechanic2;
        listOfMechanic.addToList(mechanic1 = new Mechanic("Сергей", "СТО", CarType.PASS, CarType.TRUCK,CarType.BUS));
        System.out.println(listOfMechanic);
        mechanic1.printMechCarSupp();
        mechanic1.repairCar(car1);
        System.out.println(listOfSponsor);
    }
}