package com.company.prototype;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape(){
    }

    public Shape(Shape target){
        if(target != null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Shape)) return false;
        Shape shape2 = (Shape) o;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color,color);
    }
}
