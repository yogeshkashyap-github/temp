import java.applet.Applet;
import java.awt.Graphics;

public class MyFirstApplet extends Applet {
    
    // Initialize the applet
    public void init() {
        System.out.println("Applet Initialized");
    }

    // Start the applet
    public void start() {
        System.out.println("Applet Started");
    }

    // Stop the applet
    public void stop() {
        System.out.println("Applet Stopped");
    }

    // Destroy the applet
    public void destroy() {
        System.out.println("Applet Destroyed");
    }

    // This method is used for rendering graphics in the applet
    public void paint(Graphics g) {
        g.drawString("Hello, World!", 50, 50); // Draw text in the applet window
    }
}
