import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.util.Random;

/**
 * Class that creates a building based on variables passed in through constructor
 * 
 * @author @mcirzan
 * @version oct 7 2014
 */
public class Building
{
    private int xpos;
    private int ypos;
    private int r;
    private int g;
    private int b;
    private int height;
    /**
     * Constructor - takes in the current size of the screen, rgb values, and an integer used as the height of the building
     *
     *
     * @pre        expects 6 integers to be passed in
     * 
     * @post       assigns parameters to variables to be used later on in the class
     * 
     * @param    x:  takes in any integer    y: takes in any integer    r: takes in any integer 
     *              g : takes in any integer  b : takes in any integer  height : takes in any integer 
     * 
     * @return    returns nothing
     */
    public Building(int x, int y, int r, int g, int b, int height)
    {
        this.xpos = x;
        this.ypos = y;
        this.r = r;
        this.g = g;
        this.b = b;
        this.height = height;
    }
    
    /**
     * Draw - Draws a building based on current sizing of the screen and adds windows 
     *
     *
     * @pre        expects 6 integers to be passed in, window to be properly created
     * 
     * @post       needs constructor and assignment of parameters to variables 
     * 
     * @param    Graphics2D g2)
     * 
     * @return    returns nothing
     */
    public void draw(Graphics2D g2)
    {
        //Creates rectangle based on currnet sizing of the screen along with height that is previously passed in
        Rectangle building = new Rectangle(this.xpos, this.ypos - this.height, 70, this.height);
        
        //Makes new color based on rgb values passed in through constructor
        Color buildingColor = new Color(this.r, this.g, this.b);
        
        //Draws building
        g2.setColor(buildingColor);
        g2.draw(building);
        g2.fill(building);
        
        //sets the spacing of windows to 2 pixels from edge of building
        int count = 2;
        
        //Initializes running count used in for loop
        int iCounter = 0;

        for(int i=1; i<this.height; i++)
        {
            Window window = new Window(this.xpos + count, this.ypos - this.height + 6);
            window.draw(g2);
            iCounter += 1;
            //Adds 15 pixels from left edge of the building for spacing
            count += 15;
            
            //Resets variables once 5 windows are created in a row
            if(iCounter>4){this.height -= 15; count = 2; iCounter = 0;}


        }

    }

}