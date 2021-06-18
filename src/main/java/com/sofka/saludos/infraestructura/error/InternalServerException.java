package com.sofka.saludos.infraestructura.error;

public class InternalServerException extends RuntimeException {

    public InternalServerException(String msg, Exception err) {
        super(msg, err);
    }
}

