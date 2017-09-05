//dummy comment
package edu.up.cs301.campusmap;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.util.*;
/**
 * <!-- class SimpleMapToken -->
 *
 * This class represents a single map token that can be drawn on a canvas
 *
 * @author Andrew M. Nuxoll
 * @author Steven R. Vegdahl
 * @author <Samuel Cowdery>
 * @version August 2017
 */
public class SimpleMapToken {

    // instance variables
    protected float x; // my x coordinate
    protected float y; // my y coordinate
    protected float radius; //my radius
    protected Paint paint;  //my color
    protected int Colorx;   //defining my color to be random-ed
    /**
     * Constructor
     * @param xCoord the x-coordinate
     * @param yCoord the y-coordinate
     */
    public SimpleMapToken(float xCoord, float yCoord) {
        // initialize the instance variables
        Random newInt = new Random();
        x = xCoord; // x-coordinate
        y = yCoord; // y-coordinate
        radius = 50; // radius of the circle
        paint = new Paint(); // paint object, which paints ...
        int r = newInt.nextInt((255) + 1);
        int g = newInt.nextInt((255) + 1);
        int b = newInt.nextInt((255) + 1);
        Colorx = Color.rgb(r,g,b); //builds a random color from 3 random ints
        paint.setColor(Colorx); // assigns the paint to my random color
    }//ctor



    /**
     * this token can paint itself on a given canvas
     * @param canvas the canvas on which to draw
     */
    public void drawOn(Canvas canvas) {
        // paint the dot on the canvas
        canvas.drawCircle(x, y, radius, paint);
    }//drawOn

}//class SimpleMapToken
