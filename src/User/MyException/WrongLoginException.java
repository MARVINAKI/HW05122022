package User.MyException;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        System.out.println("Логин должен быть длинной от 1 до 20 букв,\n" +
                "содержать в себе только латинские буквы, цифры или знак подчеркивния.");
    }
}
