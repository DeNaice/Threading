package Threads;

import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

    private static Main mySketch;
    private final int THREAD_COUNT = 15;
    int size = 100;
    PImage[] gen1;

    public static void main(String[] args) {
        // Objekt Papplet.runsketch wird übergeben statt ganze Main - braucht String mit Sketches
        String[] processingArgs = {"Sketch"};
        mySketch = new Main();
        PApplet.runSketch(processingArgs, mySketch);
    }






    @Override
    public void settings() {
        size(1040, 1920);
    }



    @Override
    public void setup() {
        gen1 = new PImage[151];
        PImage temp = loadImage("http://clipart-library.com/images/gie5B478T.png");

        for(int i=0; i<gen1.length; i++) {
            gen1[i] = temp;

        }

        for(int i=0; i < THREAD_COUNT; i++){

            new Thread(new ThreadLoader(i*(151/THREAD_COUNT)+1, i*(151/THREAD_COUNT)+(151/THREAD_COUNT) +1 , mySketch)).start();

        }

        System.out.println("Done");
    }

    @Override
    public void draw() {
        background(255);
        for(int i=0; i<gen1.length; i++) {
            int xPos = (int)(i % 15) * size;
            int yPos = (int)(i / 15) * size;
            image(gen1[i], xPos, yPos, size, size);
        }
    }

    public void setImage (PImage img, int index) {
        gen1[index] = img;
    }

}