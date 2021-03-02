package com.company.factory;

public class Woman implements Person{
    private final String description = "Human female";

    @Override
    public String getDescription() {
        return this.description;
    }
}
