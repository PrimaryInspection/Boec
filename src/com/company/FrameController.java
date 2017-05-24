package com.company;

import javax.swing.*;

public class FrameController {
    public static void drawFrame() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        //настраиваем окно и добаляем элененты
        Main.frame.setSize(640, 480);
        Main.frame.setResizable(false);
        Main.frame.setLocationRelativeTo(null);
        Main.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Writer writer = new Writer();
        Main.frame.add(writer);
        Main.frame.addKeyListener(new KeyController());
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Main.frame.setIconImage(new ImageIcon(Main.class.getResource("/Images/Icon.png")).getImage());
        //обновление компоненов
        SwingUtilities.updateComponentTreeUI(Main.frame);
        //запуск окна
        Main.frame.setVisible(true);
    }
}