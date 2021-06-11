package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Point point = new Point();
        //System.out.println(point);

        MoveablePoint moveablePoint;
        moveablePoint= new MoveablePoint(1,1,2,2);

        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
