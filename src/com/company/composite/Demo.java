package com.company.composite;

import java.awt.*;

public class Demo {
    public static void main(String[] args){
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10,10,10, Color.BLUE),

                new CompundShape(
                        new Circle(110,110,50,Color.GREEN),
                        new Dot(160,160,Color.BLACK)
                ),
        new CompundShape(
                new Rectangle(250,250,100,100,Color.CYAN),
                new Dot(240,240, Color.GREEN),
                new Dot(240,240, Color.GREEN),
                new Dot(240,240, Color.GREEN),
                new Dot(240,240, Color.GREEN)));
    }
}
