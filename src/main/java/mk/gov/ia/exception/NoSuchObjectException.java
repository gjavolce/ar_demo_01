/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mk.gov.ia.exception;

/**
 *
 * @author expert
 */
public class NoSuchObjectException extends Exception {

    /**
     * Creates a new instance of <code>NoSuchObjectException</code> without
     * detail message.
     */
    public NoSuchObjectException() {
    }

    /**
     * Constructs an instance of <code>NoSuchObjectException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NoSuchObjectException(String msg) {
        super(msg);
    }
}
