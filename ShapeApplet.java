import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ShapeApplet extends Applet {

    @Override
    public void init() {
        // Initialize any settings if needed
        setSize(400, 300); // Set the size of the applet
        setBackground(Color.white); // Set the background color
    }

    @Override
    public void start() {
        // Code to run when the applet is started
        // This method can be used to start animations or tasks
    }

    @Override
    public void paint(Graphics g) {
        // Draw a blue arc
        g.setColor(Color.blue);
        g.drawArc(50, 50, 100, 100, 0, 90);
        
        // Fill a red arc
        g.setColor(Color.red);
        g.fillArc(200, 50, 100, 100, 90, -120);
        
        // Draw a green triangle (polygon)
        g.setColor(Color.green);
        int[] xTriangle = {100, 150, 50};
        int[] yTriangle = {100, 150, 150};
        g.drawPolygon(xTriangle, yTriangle, 3);
        
        // Fill an orange pentagon
        g.setColor(Color.orange);
        int[] xPentagon = {250, 300, 350, 325, 275};
        int[] yPentagon = {100, 75, 100, 150, 150};
        g.fillPolygon(xPentagon, yPentagon, 5);
    }
    

    @Override
    public void stop() {
        // Code to run when the applet is stopped
        // This can be used to release resources or stop animations
    }

    @Override
    public void destroy() {
        // Cleanup code before the applet is destroyed
    }
}
