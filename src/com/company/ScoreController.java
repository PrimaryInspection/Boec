package com.company;

import java.io.*;

public class ScoreController {
    public static void testScore() {
        if (Main.x <= Main.xc + Main.score * 10 / 5 + 5 && Main.x + Main.score * 10 >= Main.xc && Main.y <= Main.yc + Main.score * 10 / 5 + 5 && Main.y + Main.score * 10 >= Main.yc) {
            //добаляем очки
            ++Main.score;
              if (Main.score==15)
            {
               PlayerController.alive();
            }
            //создание новой монеты
            createCoin();
        }
    }

    public static void createCoin() {
        Main.xc = (int) (Math.random() * (633 - (Main.score * 10 / 5 + 5)));
        Main.yc = (int) (Math.random() * (451 - (Main.score * 10 / 5 + 5)));
    }

    public static void saveScore() {
        try {
            FileWriter writer = new FileWriter("очки.txt", true);
            writer.write("очки: " + Main.score + ", время: " + Main.timer / 100 + ", количество врагов: " + Main.enemyCount + ", читер: " + Main.cheats + "\r\n");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
