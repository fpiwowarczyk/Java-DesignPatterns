package com.company.abstactFactory;

public class LinuxCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("LINUX Checkbox");
    }
}
