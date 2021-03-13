package com.wislowski.ui.panel;


import com.sun.tools.javac.Main;
import com.wislowski.ui.basics.Colors;
import com.wislowski.ui.button.MainMenuBtn;
import com.wislowski.ui.label.MainMenuLbl;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {

    public MenuPanel(int width, int height) {

        //setting
        this.setBounds(0,0,width,height);
        this.setBackground(Colors.darkRed);
    }

    public MenuPanel(int width, int height, Color color) {

        //setting
        this.setLayout(null);
        this.setOpaque(true);
        this.setBounds((width/2)-((height*9/5)/2),0,height*9/5,height);
        this.setBackground(Colors.darkRed);
        this.setBorder(BorderFactory.createLineBorder(Color.black,10,true));

        MainMenuLbl lb = new MainMenuLbl();
        this.add(lb);

        // Buttons
        MainMenuBtn [] menuBtns = {new MainMenuBtn("Single Player",0),new MainMenuBtn("Multiplayer",1), new MainMenuBtn("Settings",2),new MainMenuBtn("Exit", 3)};

        for (int i = 0; i < menuBtns.length; i++) {
            this.add(menuBtns[i]);
        }

    }
}
