package com.wislowski.ui.button;

import com.wislowski.GameFrame;
import com.wislowski.Launch;
import com.wislowski.ui.basics.Colors;
import org.w3c.dom.css.RGBColor;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class MainMenuBtn extends JButton implements ActionListener, MouseListener {

    int id;




    public MainMenuBtn(String name, int id) {

        int btnWidth = GameFrame.getFrameWidth()/5;
        int btnHeight = 60;

        int btnXPosition = (GameFrame.getFrameWidth())-(btnWidth)-100;
        int btnYPosition = (GameFrame.getFrameHeight()/10)+(id*(GameFrame.getFrameHeight()/20+btnHeight));

        this.setBounds(btnXPosition,btnYPosition,btnWidth,btnHeight);
        this.setBackground(Colors.darkerRed);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        this.setFocusable(false);
        this.setText(name);
        this.addActionListener(this);
        this.setVisible(true);
        this.setFont(new Font("Gothic",Font.BOLD,25));
        this.setForeground(Colors.lightGrey);
        this.id = id;
        this.addMouseListener(this);

    }

    public void mousePressed(MouseEvent e) {
        System.out.println("MP");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("MR");
    }

    public void mouseEntered(MouseEvent e) {
        this.setBackground(Colors.darkRed);
    }

    public void mouseExited(MouseEvent e) {
        this.setBackground(Colors.darkerRed);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("MC");
    }




    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this) {
            switch (id) {
                case 0:
                    System.out.println("Single Player");
                    break;
                case 1:
                    System.out.println("Multiplayer");
                    break;
                case 2:
                    System.out.println("Settings");
                    if(GameFrame.isFullScreen()==true){
                        GameFrame.setFullScreen(false);
                    }
                    else {
                        GameFrame.setFullScreen(true);
                    }

                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }

    }

}
