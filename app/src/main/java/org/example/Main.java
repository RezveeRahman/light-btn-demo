/**
 * @author: Rezvee Rahman
 * @description: This is the main entrypoint of the java executable.
 */

package org.example;

public class Main {
    private static StartApp startApp;

    public static void main(String[] args) {
        startApp = new StartApp();

        startApp.startApplication();
    }
}
