package com.wislowski.ui.label;

import com.wislowski.GameFrame;

import java.awt.*;

public class MainMenuLbl extends Label {

    public MainMenuLbl() {

        int fontXPos = GameFrame.getFrameWidth()/5;
        int fontYPos = GameFrame.getFrameHeight()/5;

        int fontWeight = GameFrame.getFrameWidth()/3;
        int fontHeight = GameFrame.getFrameHeight()/4;

        this.setText("Pixel Pong");
        this.setBounds(fontXPos,fontYPos,fontWeight,fontHeight);
        this.setFont(new Font("TimesRoman",Font.PLAIN,80));
//        this.setBackground(Color.BLUE);
    }
}
