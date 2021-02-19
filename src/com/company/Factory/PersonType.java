package com.company.Factory;

import java.util.function.Supplier;

public enum PersonType {

    WOMAN(Woman::new),
    MAN(Man::new);

    private final Supplier<Person> constructur;

    PersonType(Supplier<Person> constructur){
        this.constructur = constructur;
    }

    public Supplier<Person> getConstructur(){
        return this.constructur;
    }


}
