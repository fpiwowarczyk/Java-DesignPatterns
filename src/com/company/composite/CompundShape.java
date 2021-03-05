package com.company.composite;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompundShape extends BaseShape {
    protected List<Shape> childeren = new ArrayList<>();

    public CompundShape(Shape... components) {
        super(0, 0, Color.BLACK);
        add(components);
    }

    public void add(Shape component) {
        childeren.add(component);
    }

    public void add(Shape... components) {
        childeren.addAll(Arrays.asList(components));
    }

    public void remove(Shape child) {
        childeren.remove(child);
    }

    public void remove(Shape... components) {
        childeren.removeAll(Arrays.asList(components));
    }

    public void clear() {
        childeren.clear();
    }

    @Override
    public int getX() {
        if (childeren.size() == 0) {
            return 0;
        }
        int x = childeren.get(0).getX();
        for (Shape child : childeren) {
            if (child.getX() < x) {
                x = child.getX();
            }
        }
        return x;
    }

    @Override
    public int getY() {
        if (childeren.size() == 0) {
            return 0;
        }
        int y = childeren.get(0).getY();
        for (Shape child : childeren) {
            if (child.getY() < y) {
                y = child.getY();
            }
        }
        return y;
    }

    @Override
    public int getWidth() {
        int maxWidth = 0;
        int x = getX();
        for (Shape child : childeren) {
            int childsRelativeX = child.getX() - x;
            int childWidth = childsRelativeX + child.getWidth();
            if (childWidth > maxWidth) {
                maxWidth = childWidth;
            }
        }
        return maxWidth;
    }

    @Override
    public int getHeight() {
        int maxHeight = 0;
        int y = getY();
        for (Shape child : childeren) {
            int childsRelativeY = child.getY() - y;
            int childHeight = childsRelativeY + child.getHeight();
            if (childHeight > maxHeight) {
                maxHeight = childHeight;
            }
        }
        return maxHeight;
    }

    @Override
    public void move(int x, int y){
        for(Shape child : childeren){
            child.move(x,y);
        }
    }

    @Override
    public boolean isInsideBounds(int x, int y){
        for(Shape child : childeren){
            if(child.isInsideBounds(x,y)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void unSelect(){
        super.unSelect();
        for(Shape child : childeren){
            child.unSelect();
        }
    }

    public boolean selectChildAt(int x,int y){
        for(Shape child : childeren){
            if(child.isInsideBounds(x,y)){
                child.select();
                return true;
            }
        }
        return false;
    }

    public void paint(Graphics graphics){
        if(isSelected()){
            enableSelectionStyle(graphics);
            graphics.drawRect(getX() -1,getY() -1,getWidth()+1 ,getHeight() +1);
            disableSelectionStyle(graphics);
        }

        for(Shape child :childeren){
            child.paint(graphics);
        }
    }
}



