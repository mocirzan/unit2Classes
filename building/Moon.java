import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

/**
 * Class that creates a moon in the corner based on the screens current size
 * 
 * @author @mcirzan
 * @version oct 7 2014
 */
public class Moon
{
    private int x;
    private int y;

    /**
     * Constructor - takes in the current size of the screen and initializes class variables
     *
     *
     * @pre        expects 2 integers to be passed in
     * 
     * @post       assigns parameters to variables to be used later on in the class
     * 
     * @param    x:  takes in any integer    y: takes in any integer
     * 
     * @return    returns nothing
     */
    public Moon(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Draw - draws an ellipse in the top right corner 
     *
     *
     * @pre needs a constructor
     * 
     * @post    creates a moon based on prior variables in the class
     * 
     * @param   takes in Graphics2D g2
     * 
     * @return    returns nothing
     */
    public void draw(Graphics2D g2)
    {
        //Creates moon in top left corner
        Ellipse2D.Double moon = new Ellipse2D.Double(this.x-120, this.y-550, 100, 100);
        
        //Draws and colors moon
        g2.setColor(Color.WHITE);
        g2.draw(moon);
        g2.fill(moon);

            
    }
}

    