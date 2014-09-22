import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Target
{
    private int xLeft;
    private int yTop;
    public Target(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double circle1 = new Ellipse2D.Double(xLeft + 20, yTop + 40, 90, 90);
        
        g2.draw(circle1);
        g2.setColor(Color.red);
        g2.fill(circle1);
        
        Ellipse2D.Double circle2 = new Ellipse2D.Double(xLeft + 30, yTop + 50, 70, 70);
        
        g2.draw(circle2);
        g2.setColor(Color.pink);
        g2.fill(circle2);
        
        Ellipse2D.Double circle3 = new Ellipse2D.Double(xLeft + 40, yTop + 60, 50, 50);
        
        g2.draw(circle3);
        g2.setColor(Color.red);
        g2.fill(circle3);
        
        Ellipse2D.Double circle4 = new Ellipse2D.Double(xLeft + 50, yTop + 70, 30, 30);
        
        g2.draw(circle4);
        g2.setColor(Color.pink);
        g2.fill(circle4);
        
        Ellipse2D.Double circle5 = new Ellipse2D.Double(xLeft + 60, yTop + 80, 10, 10);
        
        g2.draw(circle5);
        g2.setColor(Color.red);
        g2.fill(circle5);
    }
    
    
}
        
        