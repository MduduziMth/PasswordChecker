public class PasswordCheckMain {

    public static void main(String[] args) {

        new PasswordValidation("password");
    }

    public static boolean passwordIsOK(String password)
    {
        boolean result = false;
        if(password.length() < 8){
            result = true;
        }


        return result;
    }
}
