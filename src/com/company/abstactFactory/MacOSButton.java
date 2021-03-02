package com.company.abstactFactory;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("MAC OS Button");
    }
}
