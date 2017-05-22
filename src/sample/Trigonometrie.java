package sample;

/**
 * Created by iosif on 5/22/17.
 */
public class Trigonometrie {
    public double distanta(Punct a, Punct b){
        return Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
    }
}
