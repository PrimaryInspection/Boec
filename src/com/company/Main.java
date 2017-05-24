package com.company;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        FrameController.drawFrame();
    }

    //создание переменных
    static JFrame frame = new JFrame("игра");
    static int score = 1;
    static int x = 316;
    static int y = 225;
    static boolean down = false;
    static boolean up = false;
    static boolean left = false;
    static boolean right = false;
    static int enemyCount = 4;
    static int[] ye = new int[20];
    static int[] xe = new int[20];
    static int xc = (int) (Math.random() * (633 - score * 10 / 5 + 5));
    static int yc = (int) (Math.random() * (451 - score * 10 / 5 + 5));
    static int canKillTime = 300;
    static int timer = 0;
    static boolean canKill = false;
    static boolean cheats = false;
    static boolean dead = false;
}