import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

public class Moon
{
    private int x;
    private int y;
    
        public Moon(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
        
        public void draw(Graphics2D g2)
        {
            Ellipse2D.Double moon = new Ellipse2D.Double(this.x, this.y, 100, 100);
            
            
            g2.setColor(Color.WHITE);
            g2.draw(moon);
            g2.fill(moon);
            
           
            

        }
}
        
    
    