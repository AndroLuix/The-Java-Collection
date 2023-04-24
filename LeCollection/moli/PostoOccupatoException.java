package moli;

public class PostoOccupatoException extends Exception{

    @Override
    public String getMessage() {
        return "Il posto è occupato";
    }

}
