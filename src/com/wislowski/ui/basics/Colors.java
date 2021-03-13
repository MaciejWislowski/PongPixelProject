package com.wislowski.ui.basics;

import java.awt.*;

public class Colors {

    public static int cScheme = 3;

    public static Color darkRed = new Color(139,0,0);
    public static Color darkerRed = new Color(120,0,0);
    public static Color lightGrey = new Color(128,128,128);
    public static Color lighterGrey = new Color(169,169,169);

    public static void setColorScheme() {
        if(cScheme==1) {
            darkRed = new Color(139,0,0);
            darkerRed = new Color(120,0,0);
            lightGrey = new Color(128,128,128);
            lighterGrey = new Color(169,169,169);
        } else if(cScheme==2) {
            darkRed = new Color(0,90,0);
            darkerRed = new Color(0,80,0);
            lightGrey = new Color(128,128,128);
            lighterGrey = new Color(169,169,169);
        } else if(cScheme==3) {
            darkRed = new Color(0,0,0);
            darkerRed = new Color(10,10,10);
            lightGrey = new Color(128,128,128);
            lighterGrey = new Color(169,169,169);
        }
    }


}
