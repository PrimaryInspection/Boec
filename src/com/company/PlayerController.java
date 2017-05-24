package com.company;

import javax.swing.*;

public class PlayerController {
    public static void movePlayer() {
        if (Main.right) ++Main.x;
        if (Main.left) --Main.x;
        if (Main.down) ++Main.y;
        if (Main.up) --Main.y;
        if (Main.y < 0) Main.y = 0;
        if (Main.x < 0) Main.x = 0;
        if (Main.x > 633 - Main.score * 10) Main.x = 633 - Main.score * 10;
        if (Main.y > 451 - Main.score * 10) Main.y = 451 - Main.score * 10;
    }

    public static void dead() {
            Main.dead = true;
            ScoreController.saveScore();
            JOptionPane.showMessageDialog(Main.frame, "You lose!\nочки: " + Main.score + "\nвремя: " + Main.timer / 100 + "\nколичество врагов: " + Main.enemyCount + "\nчитер: " + Main.cheats, "игра", JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("/Images/Dead.png")));
            Updater.reset();
            Main.dead = false;
        }

    public static void alive() {
        Main.dead = true;
        ScoreController.saveScore();
        JOptionPane.showMessageDialog(Main.frame, "You win!\nочки: " + Main.score + "\nвремя: " + Main.timer / 100 + "\nколичество врагов: " + Main.enemyCount + "\nчитер: " + Main.cheats, "игра", JOptionPane.PLAIN_MESSAGE, new ImageIcon(Main.class.getResource("/Images/Dead.png")));
        Updater.reset();
        Main.dead = false;
    }

}
