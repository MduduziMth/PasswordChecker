public class PasswordCheckMain {

    public static void main(String[] args) {

        String password = "Password1";

        PasswordValidation checker =    new PasswordValidation();

        System.out.println(checker.PasswordIsValid(password));

       System.out.println( checker.passwordIsOk(password));
        checker.passwordIsOk(password);
    }


}
