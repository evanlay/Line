// Evan Lay
package com.company;

public class Point {
    private double xCoord;
    private double yCoord;

    public Point()		// default constructor
    {
        xCoord = 0.0;
        yCoord = 0.0;
    }
    public Point(double x, double y)
    {
        xCoord = x;
        yCoord = y;
    }
    public double getX()
    {
        return xCoord;
    }
    public double getY()
    {
        return yCoord;
    }
    public String toString()	// called when you print a point
    {
        String s = "(" + xCoord + ", " + yCoord + ")";
        return s;
    }

}
/*
Parallel? true
Distance = 8.0
Midpoint = (6.0, 2.0)
Distance = 8.0
Same length? true
 */