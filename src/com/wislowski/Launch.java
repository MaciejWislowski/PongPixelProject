package com.wislowski;

public class Launch {




    public static void main(String[] args) {

    reLaunch();

    }
    public static void reLaunch(){

        GameFrame gameFrame = null;
        System.gc();
        gameFrame = new GameFrame();
    }
}
