package com.company.abstactFactory;

public class App {

    private Button button;
    private Checkbox checkbox;

    public App(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
