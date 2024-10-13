/**
 * @author: Rezvee Rahman
 * @description: If we want to create a JFrame that takes the display
 * resolution into consideration for whatever logic, this enum does the
 * trick. We pretty much define what display sizes.
 * 
 * @copyrights: This code is free to use. HOWEVER, USE THIS CODE AT YOUR
 * OWN RISK!
 */
package org.frames;

import java.awt.GraphicsEnvironment;

public enum WindowEnumeration {

    DEFAULT (new int[] {
        GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getMaximumWindowBounds().width,
        GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getMaximumWindowBounds().height}),
    DCI2K   (new int[] {2048, 1080}),
    FHD     (new int[] {1920, 1080}),
    WSXGApls(new int[] {1680, 1050}),
    WSXGA   (new int[] {1600, 900}),
    WXGApls (new int[] {1440, 900}),
    SXGA    (new int[] {1280, 1024}),
    HD720   (new int[] {1280, 720}),
    XGA     (new int[] {1024, 768}),
    WSVGA   (new int[] {1024, 600}),
    SVGA    (new int[] {800, 600}),
    VGA     (new int[] {640, 480});

    final int width;
    final int height;

    WindowEnumeration(int dimensions[]) {
        this.width = dimensions[0];
        this.height = dimensions[1];
    }
}
