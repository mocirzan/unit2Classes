import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        int x = getWidth();
        int y = getHeight();
        
        //Creates black background
        Background bkg = new Background(x,y);
        bkg.draw(g2);
        
        //Creates first building (takes in x position, y postion, r, g, and b values, and height
        Building building1 = new Building(50, y, 19, 44, 22, 150);
        building1.draw(g2);
        
        //Creates second building
        Building building2 = new Building(140, y, 40, 40, 60, 310);
        building2.draw(g2);
        
        //Creates third building
        Building building3 = new Building(300, y, 60, 60, 60, 250);
        building3.draw(g2);
        
        //Creates fourth building
        Building building4 = new Building(390, y, 70, 60, 50, 290);
        building4.draw(g2);
        
        //Creates fifth building
        Building building5 = new Building(500, y, 30, 60, 50, 200);
        building5.draw(g2);
        
        //Creates sixth building
        Building building6 = new Building(700, y, 77, 22, 66, 200);
        building6.draw(g2);
        
        //Creates seventh building
        Building building7 = new Building(2000, y, 244, 157, 200, 420);
        building7.draw(g2);
        
        //Creates moon
        Moon moon = new Moon(x, y);
        moon.draw(g2);
        
        
    }

}