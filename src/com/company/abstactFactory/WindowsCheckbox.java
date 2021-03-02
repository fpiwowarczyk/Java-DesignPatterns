package com.company.abstactFactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("WINDOWS Checkbox");
    }
}
