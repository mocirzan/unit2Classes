import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.util.Random;

/**
 * Class that creates a window that is used in the building class
 * 
 * @author @mcirzan
 * @version oct 7 2014
 */
public class Window
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
    public Window(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Draw - Draws a window that will either be black or yellow
     *
     *
     * @pre        expects 2 integers to be passed in
     * 
     * @post       needs constructor and assignment of parameters to variables 
     * 
     * @param    Graphics2D g2
     * 
     * @return    returns nothing
     */
    public void draw(Graphics2D g2)
    {
        //Creates a 7 by 7 square
        Rectangle window = new Rectangle(this.x, this.y, 7, 7);

        Random gen = new Random();

        //Initiates rgb values
        int r = 0;
        int g = 0;
        int b = 0;

        //Randomly assigns rgb values to eiter black or yellow
        int num = gen.nextInt(2);
        if (num == 0){r = 255; g = 255; b = 0;}
        if (num == 1){r = 0; g = 0; b = 0;}

        //Creates new color
        Color windowColor = new Color(r,g,b);

        //Colors window
        g2.setColor(windowColor);
        g2.fill(window);

    }
}

    