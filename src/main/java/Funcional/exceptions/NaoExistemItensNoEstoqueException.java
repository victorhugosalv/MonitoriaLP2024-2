package Funcional.exceptions;

public class NaoExistemItensNoEstoqueException extends RuntimeException {
    public NaoExistemItensNoEstoqueException(String message) {
        super(message);
    }
}
