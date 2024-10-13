/**
 * @author: Rezvee Rahman
 * @description: Create panel responsive frame.
 * 
 * @version: SE-21
 */

package org.frames;

import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.RenderingHints;

import javax.swing.JPanel;

public class ResponsivePanel extends JPanel {

    private Graphics2D g2d;

    /**
     * Constructor: constructs a responsive panel. Use this in
     * conjunction with JFrames.
     */
    public ResponsivePanel() {
        g2d = (Graphics2D)this.getGraphics();
        paintComponent(g2d);
    }

    /* ------------------------------------------------------------------ 
     * -- Public methods
     * ------------------------------------------------------------------ */

    /**
     * Method overrides paint Component. This kind of a hack job but
     * works. Essentially get the graphics component from the frame and
     * pass it through. The casting in the method doesn't matter. We
     * then set the rendering hits (Idk if this step is necessary).
     * After than we then set the paint and fill the rectangle.
     * 
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        GradientPaint gp;
        Graphics2D    grphcs;

        grphcs = (Graphics2D) g;
        gp = new GradientPaint(0, 0,
                getBackground().brighter().brighter(), 0, getHeight(),
                getBackground().darker().darker());

        super.paintComponent(g);
        grphcs.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_OFF);
        grphcs.setPaint(gp);
        grphcs.fillRect(0, 0, getWidth(), getHeight());
    }

    /* ------------------------------------------------------------------ 
     * -- private methods
     * ------------------------------------------------------------------ */

    /**
     * 
     */

    /* ------------------------------------------------------------------ 
     * -- Inner classes
     * ------------------------------------------------------------------ */


}
