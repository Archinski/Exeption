package exeption;

public class WrongLoginExeption extends RuntimeException {
    public WrongLoginExeption() {
        super("Wrong Login");
    }
}
