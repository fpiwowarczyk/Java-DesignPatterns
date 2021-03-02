package com.company.factory;

public class PersonFactory {
    public static Person getPerson(PersonType type){
        return type.getConstructur().get();
    }
}
