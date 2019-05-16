/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialclickgame;

import java.awt.Color;

/**
 *
 * @author DemetAkyol
 */
public class Shape {

    public int Type;//1 =>MyPolygon, 2=>MyRectangle, 3=>MyOval
    public int X1;
    public int Y1;
    public int X2;
    public int Y2;
    public int FirstColor;
    public int SecondColor;
    boolean cyclic;
    boolean isActive = true;
     public Shape(int type,int x1,int y1,int x2,int y2,int firstColor,int secondColor, boolean cyclic){
         
         this.Type=type;
         this.X1=x1;this.Y1=y1;
         this.X2=x2;
         this.Y2=y2;
         this.FirstColor=firstColor;
         this.SecondColor=secondColor;
         this.cyclic=cyclic;
         
     }
             
    
}
