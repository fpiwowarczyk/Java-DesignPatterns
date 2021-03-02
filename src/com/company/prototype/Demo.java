package com.company.prototype;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args){
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 100;
        circle.radius = 15;
        circle.color = "blue";
        shapes.add(circle);

        Circle anotherCircle = new Circle();
        anotherCircle.x = 10;
        anotherCircle.y = 10;
        anotherCircle.radius = 30;
        anotherCircle.color = "yellow";
        shapes.add(anotherCircle);


        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 16;
        rectangle.color = "green";
        shapes.add(rectangle);

        cloneAndCompare(shapes,shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy){
        for(Shape shape: shapes){
            shapesCopy.add(shape.clone());
        }

        for(int i =0; i<shapes.size();i++){
            if(shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i+": Shapes are different objects");
                if(shapes.get(i).equals(shapesCopy.get(i))){
                    System.out.println(i+": But they are identical");
                } else {
                    System.out.println(i+": But they are different");
                }
            } else {
                System.out.println(i+": Shape objects are the same");
            }
        }
    }
}
