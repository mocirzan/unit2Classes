import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.Random;
public class Building1
{   
    private int xpos;
    private int ypos;
    public Building1(int x, int y)
    {
        this.xpos = x;
        this.ypos = y;
    }

    public void draw(Graphics2D g2)
    {
        Rectangle body = new Rectangle(this.xpos, this.ypos - 100, 50 ,100);

        g2.draw(body);
        g2.setColor(Color.GRAY);
        g2.fill(body);
        int count = 2;
        for(int i=1; i<=4; i++)
        {
            
            Window window1 = new Window(this.xpos + count, this.ypos - 98);
            window1.draw(g2);
            count += 13;
            

        
        }
        count = 2;
        for(int i=1; i<=4; i++)
        {
            
            Window window1 = new Window(this.xpos + count, this.ypos - 88);
            window1.draw(g2);
            count += 13;
            

        
        }
        count = 2;
        for(int i=1; i<=4; i++)
        {
            
            Window window1 = new Window(this.xpos + count, this.ypos - 78);
            window1.draw(g2);
            count += 13;
            

        
        }
        count = 2;
        for(int i=1; i<=4; i++)
        {
            
            Window window1 = new Window(this.xpos + count, this.ypos - 68);
            window1.draw(g2);
            count += 13;
            

        
        }
        count = 2;
        for(int i=1; i<=4; i++)
        {
            
            Window window1 = new Window(this.xpos + count, this.ypos - 58);
            window1.draw(g2);
            count += 13;
            

        
        }
        count = 2;
        for(int i=1; i<=4; i++)
        {
            
            Window window1 = new Window(this.xpos + count, this.ypos - 48);
            window1.draw(g2);
            count += 13;
            

        
        }
        count = 2;
        for(int i=1; i<=4; i++)
        {
            
            Window window1 = new Window(this.xpos + count, this.ypos - 38);
            window1.draw(g2);
            count += 13;
            

        
        }
        count = 2;
        for(int i=1; i<=4; i++)
        {
            
            Window window1 = new Window(this.xpos + count, this.ypos - 28);
            window1.draw(g2);
            count += 13;
            

        
        }
    
    }   
}        
