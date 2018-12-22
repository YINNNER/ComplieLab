package interpreter;

/**
 * Created by Alex on 2018.12.3
 */
public class StopException extends Exception {
    String errorMessage;

    public StopException(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    public String toString()
    {
        return errorMessage;
    }

    public String getMessage()
    {
        return errorMessage;
    }
    public StopException(Exception e)
    {
        this.errorMessage = "Fatal Error";
    }
}
