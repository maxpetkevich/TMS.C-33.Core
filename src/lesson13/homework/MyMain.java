package lesson13.homework;

public class MyMain {
    public static void main(String[] args) {
        boolean userValidate = UserInformationValidator.validate(
                "login", "password1", "password1");
        System.out.println(userValidate);

    }
}
