package com.dgw.backend.exceptions;

public class NotFoundException  extends RuntimeException{
    public NotFoundException(String error){
        super(error);
    }
}
