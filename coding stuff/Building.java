import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.util.Random;

public class Building
{
    private int xpos;
    private int ypos;
    private int r;
    private int g;
    private int b;
    private int height;

    public Building(int x, int y, int r, int g, int b, int height)
    {
        this.xpos = x;
        this.ypos = y;
        this.r = r;
        this.g = g;
        this.b = b;
        this.height = height;
    }

    public void draw(Graphics2D g2)
    {
        Rectangle building = new Rectangle(this.xpos, this.ypos - this.height, 70, this.height);
        Color buildingColor = new Color(this.r, this.g, this.b);

        g2.setColor(buildingColor);
        g2.draw(building);
        g2.fill(building);
        
        int count = 2;
        int iCounter = 0;

        for(int i=1; i<this.height; i++)
        {
            Window window = new Window(this.xpos + count, this.ypos - this.height + 6);
            window.draw(g2);
            iCounter += 1;
            count += 15;
            if(iCounter>4){this.height -= 15; count = 2; iCounter = 0;}


        }

    }

}