import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.util.Random;

public class Background
{
    private int x;
    private int y;
    private int scale;

    public Background(int x, int y)
    {
        this.x = x;
        this.y = y;
       
    }

    public void draw(Graphics2D g2)
    {
        Rectangle bkg = new Rectangle(0, 0, this.x, this.y);
        
        Random gen = new Random();
        
        Color newColor = new Color(10, 10, 10);
    
        g2.setColor(newColor);
        g2.draw(bkg);
        g2.fill(bkg);
        
        int randX = gen.nextInt(1000);
        int randY = gen.nextInt(1000);
        
        
        
        for(int i=1; i<900; i++)
        {
            Rectangle star = new Rectangle(randX, randY, 1, 1);
            randX = gen.nextInt(1000);
            randY = gen.nextInt(1000);
            g2.draw(star);
            g2.setColor(Color.WHITE);
            g2.fill(star);
            
        }
        
        
    }
}

    