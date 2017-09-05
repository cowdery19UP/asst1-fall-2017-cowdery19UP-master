package edu.up.cs301.campusmap;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.util.*;
/**
 * Created by Samuel on 9/2/2017.
 */

public class CustomMapToken extends SimpleMapToken {

    public CustomMapToken(float xCoord, float yCoord){
        super(xCoord, yCoord);//calling the constructer of the parent class

    }
    @Override
    public void drawOn(Canvas canvas){
        paint.setStrokeWidth(10);
        canvas.drawArc((float)(x-(radius*1.5)),(float)(y-(radius*1.5)),(float)(x+(radius*1.5)),(float)(y+(radius*1.5)),45,100,true,paint);
        canvas.drawRect(x-radius, y-radius, x + radius, y + radius, paint);
        canvas.drawLine(x-radius, y-radius, x+(radius*2), y+(radius*2),paint);
        canvas.drawLine(x+radius, y+radius, x-(radius*2), y-(radius*2),paint);
        paint.setColor(Colorx-150);
        canvas.drawArc((float)(x-(radius)),(float)(y-(radius)),(float)(x+(radius)),(float)(y+(radius)),50,70,true,paint);
        paint.setColor(Colorx);
    }

}
