package org.example;

import java.util.logging.Logger;

/**
 * The App class.
 */

public class App {
    public static String getMessage() {
        return "Hello World!!!!!s";
    }

    public static void main(String[] args) {
        Logger.getLogger("org.example").info("Running App.java");
        System.out.println(getMessage());
    }
}