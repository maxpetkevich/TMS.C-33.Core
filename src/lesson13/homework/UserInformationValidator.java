package lesson13.homework;

public class UserInformationValidator {
    public static final String LOGIN_REGEX = "^[^\\s]{1,19}$";
    public static final String PASSWORD_REGEX = "^(?=.*\\d)[^\\s]{1,19}$";


    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            if (!login.matches(LOGIN_REGEX)) {
                throw new WrongLoginException("Login error");

            }
            if (!password.matches(PASSWORD_REGEX)) {
                throw new WrongPasswordException("Password error");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password and confirm password don't match");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
