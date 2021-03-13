package com.wislowski.ui.panel;

import com.wislowski.GameFrame;
import com.wislowski.ui.basics.Colors;

import javax.swing.*;
import java.awt.*;

public class BackgroundPanel extends JLayeredPane  {

    // Variables
    MenuPanel menuPanel;

    // Constructor

    public BackgroundPanel(int width, int height) {
        // Object creation


        //setting
        this.setFocusable(false);
        this.setOpaque(true);
        this.setBounds(0,0,width,height);
        this.setBackground(Colors.lighterGrey);

        // add elements
        launchMainMenu();

    }

    public void launchMainMenu() {
        menuPanel = new MenuPanel(GameFrame.getFrameWidth(),GameFrame.getFrameHeight(),Color.RED);
        this.add(menuPanel);
    }



}
