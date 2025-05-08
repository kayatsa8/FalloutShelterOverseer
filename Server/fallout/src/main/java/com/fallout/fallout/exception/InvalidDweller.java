package com.fallout.fallout.exception;

public class InvalidDweller extends Exception {
    public InvalidDweller(String message){
        super("invalid dweller: " + message);
    }
}
