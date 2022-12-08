package Transport.Car.MyException;

public class NotDiagException
        extends Exception {
    public NotDiagException() {
        System.out.println("Не пройдена диагностика!");
    }
}
