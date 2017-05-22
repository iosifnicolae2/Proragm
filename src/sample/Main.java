package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {

    public static void main(String[] args) {
        Triunghi t = new Triunghi();
        t.setA(new Punct(1,3));
        t.setB(new Punct(2,3));
        t.setC(new Punct(3,5));

        System.out.println("Aria: "+t.getAria());
        System.out.println("Permietru: "+t.getPerimetru());


        Cerc c = new Cerc(new Punct(1,2),5);

        System.out.println("Aria: "+c.getAria());
        System.out.println("Permietru: "+c.getPerimetru());
    }
}
