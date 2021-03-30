package application;

import model.entities.DrawRainBow;

import javax.swing.JFrame;

public class DraRainbowTest {
    public static void main(String[] args) {
        DrawRainBow panel = new DrawRainBow();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 250);
        application.setVisible(true);
    }
}
