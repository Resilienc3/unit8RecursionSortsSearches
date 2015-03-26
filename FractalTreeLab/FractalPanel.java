//********************************************************************
//  KochPanel.java       Author: Lewis/Loftus/Cocking
//
//  Represents a drawing surface on which to paint a Koch Snowflake.
//********************************************************************

import java.awt.*;
import javax.swing.JPanel;

public class FractalPanel extends JPanel
{
    private final int PANEL_WIDTH = 400;
    private final int PANEL_HEIGHT = 400;
    private final double scale = .8;
    private final double SQ = Math.sqrt(3.0) / 6;

    private final int TOPX = 200, TOPY = 20;
    private final int LEFTX = 60, LEFTY = 300;
    private final int RIGHTX = 340, RIGHTY = 300;

    private int current; //current order
    private int minLength = 10;
    private int sizeDec = 3;
    private int size = 20;
    private double angle = 30;
    //-----------------------------------------------------------------
    //  Sets the initial fractal order to the value specified.
    //-----------------------------------------------------------------
    public FractalPanel (int currentOrder)
    {
        current = currentOrder;
        setBackground (Color.black);
        setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }

    //-----------------------------------------------------------------
    //  Draws the fractal recursively. Base case is an order of 1 for
    //  which a simple straight line is drawn. Otherwise three
    //  intermediate points are computed, and each line segment is
    //  drawn as a fractal.
    //-----------------------------------------------------------------
    public void drawFractal (int x, int y, int prevLength, int prevAngle,
    Graphics page)
    {
        double length = prevLength*scale;
        if(length< minLength)
        {
            return;
        }
        else
        {
            //insert points, distance formula, pass in dist * scaleFactor, pass in previous endpoint 
            //pass in x1 + dScalesin(angle (radians)), pass in y1 + dScalecos(angle (radians))
            
            double rightO = prevAngle+angle;
            double leftO = prevAngle - angle;
            double rightX = x+ length*Math.sin(Math.toRadians(rightO));
            double rightY = y - length*Math.cos(Math.toRadians(rightO));
            double leftX = x+ length*Math.sin(Math.toRadians(leftO));
            double leftY = y - length*Math.cos(Math.toRadians(leftO));
            page.drawLine(x, y, (int)rightX, (int) rightY);
            page.drawLine(x, y, (int) leftX, (int) leftY);
            drawFractal((int)rightX, (int)rightY,(int) length,(int) rightO, page);
            drawFractal((int)leftX, (int)leftY,(int) length,(int) leftO, page);
            
            
            
        }
        
        
        
        
        
        
       
    }

    //-----------------------------------------------------------------
    //  Performs the initial calls to the drawFractal method.
    //-----------------------------------------------------------------
    public void paintComponent (Graphics page)
    {
        
        super.paintComponent (page);

        page.setColor (Color.green);

        drawFractal (120, 320, 100, 0, page);
    }

    //-----------------------------------------------------------------
    //  Sets the fractal order to the value specified.
    //-----------------------------------------------------------------
    public void setOrder (int order)
    {
        current = order;
    }

    //-----------------------------------------------------------------
    //  Returns the current order.
    //-----------------------------------------------------------------
    public int getOrder ()
    {
        return current;
    }
}
