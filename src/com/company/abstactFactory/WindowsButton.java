package com.company.abstactFactory;

public class WindowsButton implements Button {
    @Override
    public void paint(){
        System.out.println("WINDOWS Button");
    }
}
