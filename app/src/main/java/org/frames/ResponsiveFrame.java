package org.frames;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.*;

public class ResponsiveFrame extends JFrame {
    private static WindowEnumeration DEFAULT_RESOLUTION
            = WindowEnumeration.DEFAULT;
    private static WindowEnumeration MINIMUM_SIZE
            = WindowEnumeration.VGA;

    private ResponsivePanel respPanel; 

    /**
     * Constructor
     */
    public ResponsiveFrame() {
        respPanel = new ResponsivePanel();
        try {
            this.setDefaultCloseOperation
                    (WindowConstants.DISPOSE_ON_CLOSE);
            this.setMaximizedBounds(new Rectangle
                    (DEFAULT_RESOLUTION.width, DEFAULT_RESOLUTION.height));
            this.setMinimumSize(new Dimension
                    (MINIMUM_SIZE.width, MINIMUM_SIZE.height));
            this.setSize(new Dimension
                    (DEFAULT_RESOLUTION.width, DEFAULT_RESOLUTION.height));
            this.setAlwaysOnTop(true);
            this.setTitle("Responsive Frame");
            this.add(respPanel);

            this.addFrameSizeListener();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* ------------------------------------------------------------------ 
     * -- Public methods
     * ------------------------------------------------------------------ */
    /**
     * 
     */
    public void addFrameSizeListener() {
        this.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                System.out.println("resized: " + e.getComponent());
            }
            @Override
            public void componentMoved(ComponentEvent e) {}
            @Override
            public void componentShown(ComponentEvent e) {}
            @Override
            public void componentHidden(ComponentEvent e) {}
        });
    }

    /* ------------------------------------------------------------------ 
     * -- private methods
     * ------------------------------------------------------------------ */

    /* ------------------------------------------------------------------ 
     * -- Inner classes
     * ------------------------------------------------------------------ */


}
