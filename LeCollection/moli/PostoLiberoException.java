package moli;

public class PostoLiberoException extends Exception{

    @Override
    public String getMessage() {
        return "Il posto è libero";
    }
}