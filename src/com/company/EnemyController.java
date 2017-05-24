package com.company;

public class EnemyController {
    static int moveTime;
    static int move[] = new int[20];

    public static void testKillPlayer() {
        //проверка столкновения
        for (int i = 0; i < Main.enemyCount; ++i) {
            if (Main.x <= Main.xe[i] + 48 && Main.x + Main.score * 10 >= Main.xe[i] && Main.y <= Main.ye[i] + 48 && Main.y + Main.score * 10 >= Main.ye[i]) {
                PlayerController.dead();
            }
        }
    }

    public static void moveEnemy() {
        if (moveTime <= 0) {
            moveTime = (int) (Math.random() * 30);
            for (int i = 0; i < Main.enemyCount; ++i) {
                move[i] = (int) (Math.random() * 5);
            }
        }
        --moveTime;
        //перемещение по x
        for (int i = 0; i < Main.enemyCount; ++i) {
            if (move[i] == 0) Main.xe[i] += 2;
            if (move[i] == 1) Main.xe[i] -= 2;
            if (Main.xe[i] > 633 - 48) Main.xe[i] = 633 - 48;
            if (Main.xe[i] < 0) Main.xe[i] = 0;
        }
        //перемещение по y
        for (int i = 0; i < Main.enemyCount; ++i) {
            if (move[i] == 2) Main.ye[i] += 2;
            if (move[i] == 3) Main.ye[i] -= 2;
            if (Main.ye[i] > 451 - 48) Main.ye[i] = 451 - 48;
            if (Main.ye[i] < 0) Main.ye[i] = 0;
        }
    }
}
