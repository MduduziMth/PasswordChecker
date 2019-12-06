import java.sql.SQLOutput;
import java.util.regex.Pattern;

public class PasswordValidation {

    public static  int counter = 0;
    public String Password;


    public PasswordValidation(String Password){
        this.Password = Password;
    }


     public static void  PasswordIsValid(String PassWord){

        if(PassWord.length() > 8) {
                counter ++;
            } else{
            System.out.println("Password should be longer than 8 characters");
            }

        if(PassWord != " ") {
            counter ++;
            } else {
            System.out.println("Password should exist");
            }

        if(hasDigit(PassWord)) {
            counter ++;
            } else {
            System.out.println("password should at least have one digit");
            }

        if(hasLowerCase(PassWord)) {
            counter++;
            } else {
            System.out.println("");
        }

        if(!hasUpperCase(PassWord)){
            counter++;
        } else {
            System.out.println("");
        }

        if(hasSpecialChar(PassWord)){
            counter++;
        } else{
            System.out.println("");
        }

     }





     public static boolean hasDigit(String Password)
     {
        return Pattern.compile("[0-9]").matcher(Password).find();
     }

    public static boolean hasUpperCase(String Password)
    {
        return  true;
    }

    public static boolean hasLowerCase(String Password)
    {
        return  true;
    }

    public static boolean hasSpecialChar(String Password)
    {
        return  true;
    }






}
