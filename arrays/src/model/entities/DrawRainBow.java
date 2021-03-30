package model.entities;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class DrawRainBow extends JPanel {
    // defines the colors indigo and violet
    private final static Color VIOLET = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75,0,130);

    // Colors to use in the rainbow, starting from the innermost part
    // The two blank entries result in an empty arc in the center
    private Color[] colors = {Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
                              Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};

    public DrawRainBow() {
        setBackground(Color.WHITE); // settings the background as white
    }

    // draw a rainbow using concentric arcs
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int radius = 20; // radius of an arc

        // draws the rainbow near the bottom center
        int centerX = getWidth() / 2;
        int centerY = getHeight() - 20;

        // draws arcs filled with the outermost
        for(int counter = colors.length; counter > 0; counter--) {
            // settings the color to the arc current
            g.setColor(colors[counter - 1]);

            // fills the arc from 0 to 180 degrees
            g.fillArc(centerX - counter * radius,
                     centerY - counter * radius,
                     counter * radius * 2,
                     counter * radius * 2, 0, 180);
        }
    }
}
