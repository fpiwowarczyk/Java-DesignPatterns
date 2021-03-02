package com.company.factory;

public class Man implements Person{
    private final String description = "Human male";

    @Override
    public String getDescription() {
        return this.description;
    }
}
