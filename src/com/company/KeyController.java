package com.company;

import javax.swing.*;
import java.awt.event.*;

public class KeyController implements KeyListener {
    public void keyPressed(KeyEvent event) {
        switch (event.getKeyCode()) {
            case KeyEvent.VK_UP:
                Main.up = true;
                break;
            case KeyEvent.VK_DOWN:
                Main.down = true;
                break;
            case KeyEvent.VK_LEFT:
                Main.left = true;
                break;
            case KeyEvent.VK_RIGHT:
                Main.right = true;
                break;
        }
        if (event.getKeyCode() == KeyEvent.VK_C && event.isShiftDown()) {
            Main.cheats = true;
            JOptionPane.showMessageDialog(Main.frame, "!!!читер!!!\n1: добавить очки\n2: убавить очки\n3: умереть и отключить читы\n4: переспавнить монету", "Game", JOptionPane.WARNING_MESSAGE);
        }
        if (Main.cheats) {
            switch (event.getKeyCode()) {
                case KeyEvent.VK_1:
                    ++Main.score;
                    if (Main.score==15)
                    {
                        PlayerController.alive();
                    }
                    break;
                case KeyEvent.VK_2:
                    --Main.score;
                    if (Main.score==0)
                    {
                        PlayerController.dead();
                    }
                    break;
                case KeyEvent.VK_3:
                    PlayerController.dead();
                    break;
                case KeyEvent.VK_4:
                    ScoreController.createCoin();
                    break;
                case KeyEvent.VK_5:
                    if (Main.enemyCount < 20) ++Main.enemyCount;
                    break;
                case KeyEvent.VK_6:
                    if (Main.enemyCount > 0) --Main.enemyCount;
                    break;
            }
        }
        if (!Main.canKill) {
            switch (event.getKeyCode()) {
                case KeyEvent.VK_1:
                    if (Main.enemyCount < 20) ++Main.enemyCount;
                    break;
                case KeyEvent.VK_2:
                    if (Main.enemyCount > 0) --Main.enemyCount;
                    break;
            }
        }

    }

    public void keyReleased(KeyEvent event) {
        switch (event.getKeyCode()) {
            case KeyEvent.VK_UP:
                Main.up = false;
                break;
            case KeyEvent.VK_DOWN:
                Main.down = false;
                break;
            case KeyEvent.VK_LEFT:
                Main.left = false;
                break;
            case KeyEvent.VK_RIGHT:
                Main.right = false;
                break;
        }
    }

    public void keyTyped(KeyEvent event) {
    }
}