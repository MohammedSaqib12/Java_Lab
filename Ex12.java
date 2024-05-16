import java.applet.Applet;
import java.awt.*;

public class Ex12 extends Applet {
    public void paint(Graphics g) {
        g.setColor(new Color(218, 165, 32)); 
        g.fillRect(100, 200, 200, 150); 
        g.setColor(Color.BLACK);
        g.drawRect(100, 200, 200, 150); 

        int[] xPoints = {100, 200, 300};
        int[] yPoints = {200, 100, 200};
        g.setColor(new Color(139, 69, 19)); 
        g.fillPolygon(xPoints, yPoints, 3); 
        g.setColor(Color.BLACK);
        g.drawPolygon(xPoints, yPoints, 3); 

        g.setColor(new Color(102, 51, 0)); 
        g.fillRect(180, 250, 40, 100);
        g.setColor(Color.BLACK);
        g.drawRect(180, 250, 40, 100); 
        g.drawOval(215, 310, 5, 5);

        g.setColor(Color.WHITE);
        g.fillRect(120, 230, 40, 40); 
        g.fillRect(240, 230, 40, 40); 
        g.setColor(Color.BLACK);
        g.drawRect(120, 230, 40, 40); 
        g.drawRect(240, 230, 40, 40); 
        g.drawLine(140, 250, 160, 250); 
        g.drawLine(140, 270, 160, 270); 
        g.drawLine(260, 250, 280, 250); 
        g.drawLine(260, 270, 280, 270); 
        // Draw the chimney
        g.setColor(new Color(139, 69, 19)); 
        g.fillRect(220, 140, 20, 40); 
        g.fillRect(210, 130, 40, 10); 
        g.setColor(Color.BLACK);
        g.drawRect(220, 140, 20, 40); 
        g.drawRect(210, 130, 40, 10); 
    }
}
