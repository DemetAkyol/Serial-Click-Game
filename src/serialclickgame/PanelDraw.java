/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialclickgame;

/**
 *
 * @author DemetAkyol
 */


import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.Dimension;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;

public class PanelDraw extends JPanel implements MouseListener {

    private MyShape myShape;
    int width;
    int height;

    // constructor, creates a panel with random shapes
    public PanelDraw(int width, int height) {
        this.width = width;
        this.height = height;

        // setBackground( Color.BLACK );	
    } // end DrawPanel constructor

    // end method
    // for each shape array, draw the individual shapes
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        boolean filled = true;
        Color color = Color.BLACK;
        for (Shape shape : Info.shape2) {
          
            switch (shape.FirstColor ) {
                case 1:

                    color = Color.BLUE;

                    break;
                case 2:
                    color = Color.GREEN;

                    break;
                case 3:
                    color = Color.RED;

                    break;
            }
            myShape = new MyRectangle(shape.X1, shape.Y1, 50, 50, color, filled);
            Graphics2D g2d = (Graphics2D) g; // cast g to Graphics2D
            g2d.setPaint(new GradientPaint(shape.X1, shape.Y1, color, 50, 50,
                    color, shape.cyclic));
            myShape.draw(g2d);

        }

        //repaint();
    } // end method paintComponent

    @Override
    public void mouseClicked(MouseEvent e) {
        //GamerPanel.server.myOutputMessages.add("click "+e.getX()+" "+e.getY());

    }

    @Override
    public void mousePressed(MouseEvent e) {
        GamerPanel.server.myOutputMessages.add("click " + e.getX() + " " + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
