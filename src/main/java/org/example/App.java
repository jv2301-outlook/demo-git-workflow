package org.example;

import java.util.logging.Logger;

/**
 * The App class.
 */

public class App {
    public static String getMessage() {
        return "Hello World!!!!!s";
    }

    public static void feature3() {
        // No op
    }

    public static void feature4() {
        // No op
    }

    public static void feature5() {
        // No Op
    }

    public static void main(String[] args) {
        Logger.getLogger("org.example").info("Running App.java");
        System.out.println(getMessage());
    }
}