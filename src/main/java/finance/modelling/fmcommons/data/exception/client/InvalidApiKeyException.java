package finance.modelling.fmcommons.data.exception.client;

public class InvalidApiKeyException extends Exception {
    public InvalidApiKeyException(String errorMessage, Throwable error) {
        super(errorMessage, error);
    }
}
