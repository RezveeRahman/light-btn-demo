package org.example;

import org.frames.ResponsiveFrame;

public class StartApp {

    private ResponsiveFrame rspFr;

    /**
     * Constructor
     */
    public StartApp() {
        rspFr = new ResponsiveFrame();
    }

    /* ------------------------------------------------------------------ 
     * -- Public methods
     * ------------------------------------------------------------------ */
    
    /**
     * `startApplication` starts application
     */
    public void startApplication() {
        rspFr.visibility(true);
    }

    /* ------------------------------------------------------------------ 
     * -- private methods
     * ------------------------------------------------------------------ */

    /* ------------------------------------------------------------------ 
     * -- Inner classes
     * ------------------------------------------------------------------ */
}
