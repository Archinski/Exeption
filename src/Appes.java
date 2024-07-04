import exception.WrongPasswordException;
import exeption.WrongLoginExeption;

public class Appes {


    private static final String Valid_Symbols = "qwertyuiopasdfghjklzxcvbnm1234567890QWERTYUIOPASDFGHJKLZXCVBNM_";

    public static void main(String[] args) {
        try {
            authentication("1111", "asf", "asf");
            System.out.println("Все в порядке");
        }
        catch (WrongLoginExeption wle){
            System.out.println(wle.getMessage());
        }
        catch (WrongPasswordException wpe){
            System.out.println(wpe.getMessage());
        }

    }

    private static void authentication(String login, String password, String confirmPassword) {
        for (int i = 0; i < login.length(); i++) {
            if (!Valid_Symbols.contains(Character.toString(login.charAt(i))) || login.length() > 20) {
                throw new WrongLoginExeption();
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if (!Valid_Symbols.contains(Character.toString(password.charAt(i))) || password.length() > 20) {
                throw new WrongPasswordException();
            }
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
}



