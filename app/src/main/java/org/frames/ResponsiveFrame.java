package org.frames;

import java.awt.Dimension;

import javax.swing.*;

public class ResponsiveFrame {
    private static WindowEnumeration DEFAULT_RESOLUTION
            = WindowEnumeration.DEFAULT;

    private JFrame respFrame;

    /**
     * Constructor
     */
    public ResponsiveFrame() {
        try {
            respFrame = new JFrame();
            respFrame.setDefaultCloseOperation
                    (WindowConstants.DISPOSE_ON_CLOSE);
            respFrame.setSize(new Dimension
                    (DEFAULT_RESOLUTION.width, DEFAULT_RESOLUTION.height));
            respFrame.setAlwaysOnTop(true);
            respFrame.setTitle("Responsive Frame");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* ------------------------------------------------------------------ 
     * -- Public methods
     * ------------------------------------------------------------------ */

    /**
     * `visibility` mainly acts as a wrapper function to set the gui
     * to visible.
     * @param visible
     */
    public void visibility(boolean visible) {
        respFrame.setVisible(visible);
    }

    /* ------------------------------------------------------------------ 
     * -- private methods
     * ------------------------------------------------------------------ */

    /* ------------------------------------------------------------------ 
     * -- Inner classes
     * ------------------------------------------------------------------ */

}
