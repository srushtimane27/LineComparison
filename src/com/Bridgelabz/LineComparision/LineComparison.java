package com.Bridgelabz.LineComparision;

public class LineComparison {
    public static void main(String[] args) {
        Line line1 = new Line();
        System.out.println("Enter the points for Line1 : ");
        line1.pointsInput();
        Line line2 = new Line();
        System.out.println("Enter the points for Line2 : ");
        line2.pointsInput();

        Line.compareByEquals(line1,line2);
        Line.compareByCompareTo(line1,line2);

    }
}
