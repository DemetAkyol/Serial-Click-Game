package serialclickgame;

// August Ryan Brenner
// abrenn10@my.smccd.edu
// CIS 255HJ
// MyOval.java
// Draws an Oval
// Assignment 6
// April 16th, 2012 
import java.awt.Color;
import java.awt.Graphics;

public class MyOval extends MyBoundedShape {

    public MyOval() // no argument constructor
    {
    }

    // constructor with input values
    public MyOval(int x1, int y1, int x2, int y2,
            Color color, boolean filled) {
        super(x1, y1, x2, y2, color, filled);
    } // end MyLine constructor

    // Draw the line in the specified color
    public void draw(Graphics g) {

        g.setColor(getColor());
        if (getFill() == true) {
            g.fillOval(super.getX1(), super.getY1(),
                    super.getX2(), super.getY2());
        }
    } // end method draw

}
