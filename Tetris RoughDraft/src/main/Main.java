/*
Name: Aaron Kim
Date: 02.2.2025
Description: A simple tetris game made in Java, for the soul purpose of having a fun project.

Source: RyiSnow on youtube.
 */

package main;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Simple Tetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //window size fix
        window.setResizable(false);

        //set GamePanel to window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();

        window.setLocationRelativeTo(null); //shows in the center of the screen
        window.setVisible(true);

        gp.launchGame();
    }
}
