package edu.up.cs301.campusmap;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.util.*;
/**
 * Created by Samuel on 9/2/2017.
 */

public class SquareMapToken extends SimpleMapToken {

    public SquareMapToken(float xCoord, float yCoord) {
        super(xCoord,yCoord);//calling the constructer of the parent class
    }//ctor
    /**
     * this token can paint itself on a given canvas
     *
     * @param canvas the canvas on which to draw
     */
    @Override
    public void drawOn(Canvas canvas) {
        // paint the square on the canvas
        canvas.drawRect(x-radius, y-radius, x + radius, y + radius, paint);

    }//drawOn}
}
