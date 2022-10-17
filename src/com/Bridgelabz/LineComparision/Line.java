package com.Bridgelabz.LineComparision;

public class Line {
    Point point1 = new Point();
    Point point2 = new Point();

    public int getLengthOfLine(){
        int lineLength = (int) Math.sqrt(Math.pow(point2.getX()- point1.getX(),2)+Math.pow(point2.getY()- point1.getY(),2));
        return lineLength;
    }

    public void pointsInput(){
        System.out.println("Enter point1 co-ordinates : ");
        point1.getPoints();
        System.out.println("Enter point2 co-ordinates : ");
        point2.getPoints();
    }
    public static void compareByEquals(Line line1,Line line2){
        Integer length1 = line1.getLengthOfLine();
        Integer length2 = line2.getLengthOfLine();

        if (length1.equals(length2)){
            System.out.println("Line1 is equal to Line2");
        }else {
            System.out.println("Line1 is not equal to Line2");
        }
    }

}
