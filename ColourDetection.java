package com.example.colorpaletteanalyzer;

public class ColorDetector {

    public static String getColorName(int R, int G, int B) {
        if (R > 200 && G < 80 && B < 80) return "Red";
        if (R < 80 && G > 200 && B < 80) return "Green";
        if (R < 80 && G < 80 && B > 200) return "Blue";
        if (R > 200 && G > 200 && B < 100) return "Yellow";
        if (R > 200 && G < 100 && B > 200) return "Magenta";
        if (R < 100 && G > 200 && B > 200) return "Cyan";
        if (R > 200 && G > 200 && B > 200) return "White";
        if (R < 50 && G < 50 && B < 50) return "Black";
        return "Unknown Color";
    }
}
