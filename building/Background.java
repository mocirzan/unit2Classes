import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.util.Random;

/**
 * Class that creates the background for the city scape
 * 
 * @author @mcirzan
 * @version oct 7 2014
 */
public class Background
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
    public Background(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Draw - Draws a sky, stars, and a distant skyline
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
        //Creates random number generator and
        Random gen = new Random();
        int randNum = gen.nextInt(100)+100;
        int counter = 0;
        
        //Creats a complete black background
        Rectangle sky = new Rectangle(0,0,this.x,this.y);
        g2.draw(sky);
        g2.setColor(Color.BLACK);
        g2.fill(sky);
        
        for(int i=1; i<7000; i++)
        {
            //Creates random x value
            int randX = gen.nextInt(5000);
            //Creates random y value
            int randY = gen.nextInt(5000);
            //Creates rectangle at random x and y coordinate
            Rectangle star = new Rectangle(randX, randY, 1, 1);
            g2.setColor(Color.WHITE);
            g2.draw(star);
            g2.fill(star);
        }
        
        for(int i=1; i<60; i++)
        {
            //Creates building at far left of the screen
            Rectangle building = new Rectangle(this.x - counter, this.y - randNum, 50, randNum);
            
            //Creates building color 
            Color buildingColor = new Color(90, 90, 90);
            
            //Draws building 
            g2.draw(building);
            g2.setColor(buildingColor);
            g2.fill(building);
            
            //Adds 50 pixels to the x coordinates so buildings will be drawn next to each other
            counter += 50;
            randNum = gen.nextInt(100)+100;
        }
    }
}