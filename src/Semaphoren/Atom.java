package Semaphoren;

import java.util.concurrent.Semaphore;

public class Atom {

    public static int counter;
    public int id;
    public String element;
    public Semaphore semaphore;



    public Atom(String element){
        id = counter;
        counter ++;
        this.element = element;
        semaphore = new Semaphore(1);

    }

    public String getElement(){
        return element;

    }

}
