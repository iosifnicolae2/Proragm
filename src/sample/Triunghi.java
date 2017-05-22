package sample;

/**
 * Created by iosif on 5/22/17.
 */
public class Triunghi extends Trigonometrie{
    Punct a,b,c;

    public Triunghi() {
    }

    public double getAria(){
        double da = distanta(a,b),db = distanta(b,c),dc = distanta(c,a);

        double p = (da+db+dc)/2;
        return Math.sqrt(p*(p-da)*(p-db)*(p-dc));
    }


    public double getPerimetru(){
        double da = distanta(a,b),db = distanta(b,c),dc = distanta(c,a);
        return da+db+dc;
    }


    public void setA(Punct a) {
        this.a = a;
    }

    public void setB(Punct b) {
        this.b = b;
    }

    public void setC(Punct c) {
        this.c = c;
    }
}
