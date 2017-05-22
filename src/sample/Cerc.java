package sample;

/**
 * Created by iosif on 5/22/17.
 */
public class Cerc extends Trigonometrie{
    Punct c;
    int r;

    public Cerc() {
    }

    public Cerc(Punct c, int r) {
        this.c = c;
        this.r = r;
    }

    public void setC(Punct c) {
        this.c = c;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getAria(){
       return Math.PI*r*r;
    }


    public double getPerimetru(){
        return 2*Math.PI*r;
    }
}
