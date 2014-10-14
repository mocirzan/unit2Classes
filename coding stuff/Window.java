import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.util.Random;

public class Window
{
    private int x;
    private int y;
    
        public Window(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
        
        public void draw(Graphics2D g2)
        {
            Rectangle window = new Rectangle(this.x, this.y, 7, 7);
            
            Random gen = new Random();
            
            int r = 0;
            int g = 0;
            int b = 0;
            
            int num = gen.nextInt(2);
            if (num == 0){r = 255; g = 255; b = 0;}
            if (num == 1){r = 0; g = 0; b = 0;}
            
            Color windowColor = new Color(r,g,b);
            
            g2.setColor(windowColor);
            g2.fill(window);

        }
}
        
    
    