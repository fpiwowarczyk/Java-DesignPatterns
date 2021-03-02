package com.company.abstactFactory;

public class LinuxButton implements Button{
    @Override
    public void paint() {
        System.out.println("LINUX button");
    }
}
