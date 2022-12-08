package User;

import User.MyException.WrongLoginException;
import User.MyException.WrongPasswordException;

public interface UserMethod {
    boolean checkLogin() throws WrongLoginException;

    boolean checkPassword() throws WrongPasswordException;
}
