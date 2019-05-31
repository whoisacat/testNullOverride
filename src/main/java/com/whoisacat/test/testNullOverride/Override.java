package com.whoisacat.test.testNullOverride;

import java.io.IOException;

public class Override {
    public static void main(String[] args) {
        Override override = new Override();
        override.print(null);
    }

    private void print(Object o) {
        System.out.println("Object");
    }
    private void print(Exception e) {
        System.out.println("Exception");
    }
    private void print(IOException ioe) {
        System.out.println("IOException");
    }
}
