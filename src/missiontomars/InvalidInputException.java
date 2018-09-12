/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missiontomars;

/**
 *
 * @author jiri21
 */
public class InvalidInputException extends RuntimeException{

    public int getErrLine() {
        return errLine;
    }
    private final int errLine;

    public InvalidInputException(int errLine) {
        this.errLine = errLine;
    }

    public InvalidInputException(int errLine, String message) {
        super(message);
        this.errLine = errLine;
    }

    public InvalidInputException(int errLine, String message, Throwable cause) {
        super(message, cause);
        this.errLine = errLine;
    }

    public InvalidInputException(int errLine, Throwable cause) {
        super(cause);
        this.errLine = errLine;
    }

    public InvalidInputException(int errLine, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errLine = errLine;
    }
}
