package com.company;

public class Updater {
    public static void update() {
        if(!Main.dead) {
            PlayerController.movePlayer();
            EnemyController.moveEnemy();
            ScoreController.testScore();
            if (Main.canKillTime > 0) --Main.canKillTime;
            if (Main.canKillTime <= 0) Main.canKill = true;
            if (Main.canKill && !Main.cheats) {
                EnemyController.testKillPlayer();
            }
            ++Main.timer;
        }
    }

    public static void reset() {
        Main.score = 1;
        Main.x = 316;
        Main.y = 225;
        Main.down = false;
        Main.up = false;
        Main.left = false;
        Main.right = false;
        Main.xc = (int) (Math.random() * (633 - Main.score * 10 / 5 + 5));
        Main.yc = (int) (Math.random() * (451 - Main.score * 10 / 5 + 5));
        Main.timer = 0;
        Main.canKillTime = 300;
        Main.canKill = false;
        Main.cheats = false;
    }
}