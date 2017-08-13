package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top, left, width, height = 0;
    public void initialize(int top, int left, int width, int height){
        this.height = height;
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public void initialize(int top, int left){
        this.left = left;
        this.top = top;
    }
    public void initialize(int top, int left, int width){
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public void initialize(Rectangle rectangle){
        this.height = rectangle.height;
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
    }


    public static void main(String[] args) {

    }
}
