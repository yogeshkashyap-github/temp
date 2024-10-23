import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Graphics;
import javax.swing.JFrame;

@SuppressWarnings("removal")

public class applettemp extends Applet {

    // Initialize the applet
    @Override
    public void init() {
        System.out.println("Applet Initialized");
    }

    // Start the applet
    @Override
    public void start() {
        System.out.println("Applet Started");
    }

    // Stop the applet
    @Override
    public void stop() {
        System.out.println("Applet Stopped");
    }

    // Destroy the applet
    @Override
    public void destroy() {
        System.out.println("Applet Destroyed");
    }

    // This method is used for rendering graphics in the applet
    @Override
    public void paint(Graphics g) {
        g.drawString("Hello, World!", 50, 50); // Draw text in the applet window
    }

    // Main method to simulate applet execution in a JFrame
    public static void main(String[] args) {
        // Create a new JFrame to hold the applet
        JFrame frame = new JFrame("Applet in JFrame");
        MyFirstApplet applet = new MyFirstApplet(); // Create an instance of the applet

        // Set applet's size
        applet.setSize(300, 200);

        // Initialize and start the applet (to simulate browser behavior)
        applet.init();
        applet.start();

        // Add the applet to the JFrame
        frame.setLayout(new BorderLayout());
        frame.add(applet, BorderLayout.CENTER);

        // Configure the JFrame
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
