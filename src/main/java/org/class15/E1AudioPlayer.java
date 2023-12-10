package org.class15;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E1AudioPlayer {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {

        FileInputStream fis=new FileInputStream("C:\\Users\\Syntax\\IdeaProjects\\SDETJavaB18\\src\\main\\java\\org\\class15\\Ambient-music-free.mp3");
        Player player=new Player(fis);
        player.play();

    }
}
