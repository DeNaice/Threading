package Threads;
import processing.core.PImage;
public class ThreadLoader extends Thread{

    public int min, max, rn;
    public PImage loaded;
    public Main main;

    public ThreadLoader(int min, int max, Main main){
        this.min = min;
        this.max = max;
        this.rn = min;
        this.main = main;
        System.out.println("Theradloader geladen");

    }

    @Override
    public void run(){
        while(rn <= max){
            String address = String.format("https://assets.pokemon.com/assets/cms2/img/pokedex/full//%03d.png", rn);
            loaded = main.loadImage(address);
            main.setImage(loaded, rn-1);
            rn++;
        }
        System.out.println("Done");

    }

}
