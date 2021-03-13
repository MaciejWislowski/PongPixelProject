package com.wislowski;

import com.wislowski.ui.basics.Colors;
import com.wislowski.ui.panel.BackgroundPanel;

import javax.swing.*;
import java.awt.*;


public class GameFrame extends JFrame {

    // Variables -------------------------------------------------------------------------------------------------------
    // screen settings

    private static boolean fullScreen=false;
    private static boolean isFrameVisable;

    private static int frameWidth;
    private static int frameHeight;

    private static Dimension sizeOFDimension = Toolkit.getDefaultToolkit().getScreenSize();

    private static final int SCREEN_WIDTH = (int)sizeOFDimension.getWidth();
    private static final int SCREEN_HEIGHT = (int)sizeOFDimension.getHeight();

    public void screenSettings() {
        if(fullScreen) {
            GameFrame.setFrameWidth(getScreenWidth());
            GameFrame.setFrameHeight(getScreenHeight());
            GameFrame.setIsFrameVisable(true);
        }
        else{
            GameFrame.setFrameWidth(1280);
            GameFrame.setFrameHeight(720);
            GameFrame.setIsFrameVisable(false);
        }
    }

    // Object initalization

    BackgroundPanel panel;

    // Constructor -----------------------------------------------------------------------------------------------------
    public GameFrame() {

        this.screenSettings();
        Colors.setColorScheme();

        // Creating Objects
        panel = new BackgroundPanel(frameWidth,frameHeight);

        // local variables
        Dimension screenSize = new Dimension(frameWidth,frameHeight);

        // settings of Frame
        this.setPreferredSize(screenSize);
        this.setUndecorated(isFrameVisable);
        this.setResizable(true);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(0,0);
        this.setLayout(null);
        this.setTitle("PongPixel");

        // adding panels
        this.add(panel);
        this.pack();
    }

    // Methods ---------------------------------------------------------------------------------------------------------

    // Getters and setters
    public static int getFrameWidth() {
        return frameWidth;
    }

    public static void setFrameWidth(int frameWidth) {
        GameFrame.frameWidth = frameWidth;
    }

    public static int getFrameHeight() {
        return frameHeight;
    }

    public static void setFrameHeight(int frameHeight) {
        GameFrame.frameHeight = frameHeight;
    }

    public static boolean isFullScreen() {
        return fullScreen;
    }

    public static void setFullScreen(boolean fullScreen) {
        GameFrame.fullScreen = fullScreen;
    }

    public static boolean isIsFrameVisable() {
        return isFrameVisable;
    }

    public static void setIsFrameVisable(boolean isFrameVisable) {
        GameFrame.isFrameVisable = isFrameVisable;
    }

    public static int getScreenWidth() {
        return SCREEN_WIDTH;
    }

    public static int getScreenHeight() {
        return SCREEN_HEIGHT;
    }


}
