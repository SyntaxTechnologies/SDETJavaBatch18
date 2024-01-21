package org.class27;

public class InsufficientFundsException extends RuntimeException {
    /***
     * THis exception will be thrown whenever user tries to use more
     * funds than they have in their account.
     * @param msg
     */
    InsufficientFundsException(String msg){
        super(msg);
    }
}
