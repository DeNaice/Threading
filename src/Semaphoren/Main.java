package Semaphoren;
import processing.core.PApplet;
import processing.core.PImage;

import java.util.concurrent.Semaphore;


public class Main extends PApplet{


    public static Semaphore semaphore = new Semaphore(1);
    private static Threads.Main mySketch;

    public static void main(String[] args) {

        String[] processingArgs = {"Sketch"};
        mySketch = new Threads.Main();
        PApplet.runSketch(processingArgs, mySketch);

    }


    @Override
    public void settings() {
        size(1000, 1000);
    }

    @Override
    public void setup() {




    }
    @Override
    public void draw() {


    }




}
