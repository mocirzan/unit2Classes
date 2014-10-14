import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.Random;
public class Window
{   private int xpos;
    private int ypos;
    public Window(int x, int y)
    {
        this.xpos = x;
        this.ypos = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Random gen = new Random();
        Rectangle window = new Rectangle(this.xpos, this.ypos, 7 ,7);
        int r = 0, g = 0, b = 0;
        int num = gen.nextInt(2);
        if (num==0){r = 0; g = 0; b = 0;}
        if (num==1){r = 255; g = 255; b = 0;}
        Color color = new Color(r,g,b);
        g2.setColor(color);
        g2.fill(window);

 
    }
    
}

        