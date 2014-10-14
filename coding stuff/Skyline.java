import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.util.Random;

public class Skyline
{
    private int x;
    private int y;
    private int scale;

    public Skyline(int x, int y)
    {
        this.x = x;
        this.y = y;
       
    }

    public void draw(Graphics2D g2)
    {

        Random gen = new Random();
        int num = gen.nextInt(100)+100;
        int counter = 0;
        for(int i=1; i<900; i++)
        {
            Rectangle building = new Rectangle(x +counter, 100, 50, num);
            g2.setColor(Color.GRAY);
            g2.draw(building);
            g2.fill(building);
            counter += 50;
            
            
        }
        
        
    }
}

    