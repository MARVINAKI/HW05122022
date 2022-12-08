package Human;

import Human.MyException.WrongSumException;
import Transport.Car.Car;

public class Sponsor
        <C extends Car>
        extends Human {
    private int suppAmount;

    public Sponsor(String name, int suppAmount) {
        super(name);
        setSuppAmount(suppAmount);
    }

    public final void doSponsorRace(int sum, C car) throws WrongSumException {
        if (sum < 0 || sum > getSuppAmount()) {
            throw new WrongSumException();
        }
        this.suppAmount = getSuppAmount() - sum;
        car.setPrizeMoney(sum);
    }

    private int getSuppAmount() {
        return suppAmount;
    }

    private void setSuppAmount(int suppAmount) {
        this.suppAmount = Math.abs(suppAmount);
    }

    @Override
    public String toString() {
        return "Sponsor" + super.toString() + '}';
    }
}
