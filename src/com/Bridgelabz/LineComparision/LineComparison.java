package com.Bridgelabz.LineComparision;

public class LineComparison {
    public static void main(String[] args) {
        Line line1 = new Line();
        System.out.println("Enter the points for line1 : ");
        line1.pointsInput();
        Line line2 = new Line();
        System.out.println("Enter the points for line2 : ");
        line2.pointsInput();

        Line.compareByEquals(line1,line2);

    }
}
