package com.fallout.fallout.exception;

import com.fallout.fallout.model.Dweller;

public class AlreadyMarriedException extends Exception{
    public AlreadyMarriedException(Dweller dweller){
        super("dweller " + dweller.getFirstName() + " " + dweller.getLastName() + " is already married");
    }
}
