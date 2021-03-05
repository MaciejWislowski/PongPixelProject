package com.wislowski;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    // Variables
    private int frameWidth;
    private int frameHeight;

    // Constructor
    GameFrame(int frameWidth, int frameHeight) {
        // local variables
        Dimension screenSize = new Dimension(frameWidth,frameHeight);
        // set properties of GameFrame
        this.setPreferredSize(screenSize);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("PongPixel");
        this.setBackground(Color.RED);
        this.pack();
    }


    // Methods

    public double getFrameWidth() {
        return frameWidth;
    }

    public double getFrameHeight() {
        return frameHeight;
    }

    public void setFrameWidth(int frameWidth) {
        this.frameWidth = frameWidth;
    }

    public void setFrameHeight(int frameHeight) {
        this.frameHeight = frameHeight;
    }
}
