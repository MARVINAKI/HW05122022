package User;

import User.MyException.WrongLoginException;
import User.MyException.WrongPasswordException;

import java.util.Objects;

public class User implements UserMethod {

    private String login;
    private String password;
    private String confirmPassword;


    public User(String login, String password, String confirmPassword) {
        this.login = login.trim().replace(" ", "");
        this.password = password.trim().replace(" ", "");
        this.confirmPassword = confirmPassword.trim().replace(" ", "");
    }

    private String getLogin() {
        return login;
    }

    private void setLogin(String login) {
        this.login = login;
    }

    private String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private String getConfirmPassword() {
        return confirmPassword;
    }

    private void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public boolean checkLogin() throws WrongLoginException {
        char[] arrayLogin = getLogin().toCharArray();
        char[] arraySymbols = new char[63];
        char c = 48;
        int i = 0;
        boolean check = false;
        while (c != 58) {
            arraySymbols[i] = c;
            i++;
            c++;
        }
        c = 65;
        while (c != 91) {
            arraySymbols[i] = c;
            i++;
            c++;
        }
        c = 97;
        while (c != 123) {
            arraySymbols[i] = c;
            i++;
            c++;
        }
        arraySymbols[i] = 95;
        try {
            for (int n = 0; n < arrayLogin.length; n++) {
                for (int m = 0; m < arraySymbols.length; m++) {
                    if (arrayLogin[n] == arraySymbols[m]) {
                        check = true;
                        break;
                    } else {
                        check = false;
                    }
                }
                if (!check) {
                    throw new WrongLoginException();
                }
            }
        } catch (WrongLoginException e) {
            System.out.println(e);
        }
        System.out.print("Login status: ");
        return check;
    }

    @Override
    public boolean checkPassword() {
        char[] arrayPas = getPassword().toCharArray();
        char[] arraySymbols = new char[63];
        char c = 48;
        int i = 0;
        boolean check = false;
        while (c != 58) {
            arraySymbols[i] = c;
            i++;
            c++;
        }
        c = 65;
        while (c != 91) {
            arraySymbols[i] = c;
            i++;
            c++;
        }
        c = 97;
        while (c != 123) {
            arraySymbols[i] = c;
            i++;
            c++;
        }
        arraySymbols[i] = 95;
        try {

            if (getPassword().length() < 1 || getPassword().length() > 20) {
                check = false;
                throw new WrongPasswordException("Длина пароля от 1 до 20 символов");
            }
            if (getPassword() == null || getPassword().isEmpty()) {
                check = false;
                throw new WrongPasswordException("Пароль не может быть пустым");
            }
            if (!getPassword().equals(getConfirmPassword())) {
                check = false;
                throw new WrongPasswordException("Пароли не совпадают!");
            }
            for (int n = 0; n < arrayPas.length; n++) {
                for (int m = 0; m < arraySymbols.length; m++) {
                    if (arrayPas[n] == arraySymbols[m]) {
                        check = true;
                        break;
                    } else {
                        check = false;
                    }
                }
                if (!check) {
                    throw new WrongPasswordException("Пароли не соответсвуют требованию безопасности!");
                }
            }
        } catch (WrongPasswordException e) {
            System.out.println(e);
        }
        System.out.print("Status of password: ");
        return check;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return login.equals(user.login) && password.equals(user.password) && confirmPassword.equals(user.confirmPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, confirmPassword);
    }
}
