package com.company;

import javax.swing.*;
import java.awt.*;

public class Writer extends JComponent {
    public void paintComponent(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        //обновление переменных
        Updater.update();
        //рисование монеты
        g.setPaint(Color.green);
        g.fillOval(Main.xc, Main.yc, Main.score * 10 / 5 + 5, Main.score * 10 / 5 + 5);
        //рисование игрока
        g.setPaint(Color.blue);
        g.fillRoundRect(Main.x, Main.y, Main.score * 10, Main.score * 10, 20, 20);
        //рисование врагов
        for (int i = 0; i < Main.enemyCount; ++i) {
            g.drawImage(new ImageIcon(Writer.class.getResource("/Images/Enemy.png")).getImage(), Main.xe[i], Main.ye[i], this);
        }
        //вывод переменных
        g.setPaint(Color.yellow);
        g.setFont(new Font("Arial", Font.BOLD, 32));
        g.drawString("очки: " + Main.score, 0, 32);
        g.setPaint(Color.red);
        g.setFont(new Font("Arial", Font.PLAIN, 16));
        g.drawString("бессмертие: " + !Main.canKill, 0, 48);
        g.drawString("читер: " + Main.cheats, 0, 64);
        g.drawString("количество врагов: " + Main.enemyCount, 0, 80);
        g.drawString("время: " + Main.timer / 100, 0, 96);
        //пауза
        pause();
        //всё заново
        repaint();
    }

    public void pause() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}