package edu.up.cs301.campusmap;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * <!-- class CampusMapImageView -->
 *
 * This class displays the campus map.
 *
 * @author Steven R. Vegdahl
 * @author <Samuel Cowdery>
 * @version August 2017
 */
public class CampusMapImageView extends ImageView {

    // instance variables for the current and previous tokens
    private SimpleMapToken token;
    private SimpleMapToken prevToken;
    private ArrayList<SimpleMapToken> allPoints = new ArrayList<>();
    /**
     * sets a new token
     * @param tok the new token
     */
    public void setToken(SimpleMapToken tok) {
        allPoints.add(tok);
    }

    /**
     * two-argument version of the constructor
     *
     * @param context Context object
     * @param attrs AttributeSet object
     */
    public CampusMapImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // perform the common constructor operations
        init();
    }

    /**
     * one-argument version of the constructor
     *
     * @param context Context object
     */
    public CampusMapImageView(Context context) {
        super(context);
        // perform the common constructor operations
        init();
    }

    /**
     * performs initialization common to both constructors
     */
    private void init() {
        allPoints.clear();
    }

    @Override
    protected void onDraw(Canvas g) {
        super.onDraw(g);
        // if the previous token exists, draw it
        int RAlen = allPoints.size();
        for (int i = 0; i < RAlen; i++)
        {
            if (allPoints.get(i) != null) {
                allPoints.get(i).drawOn(g);
            }

        }
    }
}


