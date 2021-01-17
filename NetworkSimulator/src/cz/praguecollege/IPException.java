package cz.praguecollege;

public class IPException extends Exception {
    public IPException() {
    }
    public IPException(String message) {
        super(message);
    }
}

class NonExistingIPException extends IPException {
    public NonExistingIPException() {

    }

    public NonExistingIPException(String message) {
        super(message);
    }
}
