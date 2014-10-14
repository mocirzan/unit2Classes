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
        
        Skyline blah = new Skyline(x,y);
        blah.draw(g2);
        
        Background bkg = new Background(x,y);
        bkg.draw(g2);
        
        Building building1 = new Building(50, y, 107, 135, 130, 150);
        building1.draw(g2);
        
        Building building2 = new Building(140, y, 40, 140, 40, 310);
        building2.draw(g2);
        
        Building building3 = new Building(300, y, 60, 60, 60, 250);
        building3.draw(g2);
        
        Moon moon = new Moon(650, 10);
        moon.draw(g2);
        
        
        
        
    }

}