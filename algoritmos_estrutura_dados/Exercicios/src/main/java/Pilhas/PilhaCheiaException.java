package Pilhas;

public class PilhaCheiaException extends RuntimeException {

    public PilhaCheiaException() {
        super("Capacidade esgotada da pilha");
    }

}
