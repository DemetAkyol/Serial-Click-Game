package serialclickgame;

// August Ryan Brenner
// abrenn10@my.smccd.edu
// CIS 255HJ
// MyPolygon.java
// Draws an Oval
// Assignment 6
// April 16th, 2012 
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MyPolygon extends MyBoundedShape {

    public MyPolygon() // no argument constructor
    {
    }

    // constructor with input values
    public MyPolygon(int x1, int y1, int x2, int y2,
            Color color, boolean filled) {
        super(x1, y1, x2, y2, color, filled);
    } // end MyLine constructor

    // Draw the line in the specified color
    public void draw(Graphics g) {

        g.setColor(getColor());
        if (getFill() == true) {
            int[] pointx = new int[3];
            int[] pointy = new int[3];
            pointx[0] = super.getX1() + (super.getX2() / 2);
            pointy[0] = super.getY1();

            pointx[1] = super.getX1();
            pointy[1] = super.getY1() + super.getY2();

            pointx[2] = (super.getX1() + super.getX2());
            pointy[2] = (super.getY1() + super.getY2());

            g.fillPolygon(pointx, pointy, 3);
        }
    } // end method draw

}
