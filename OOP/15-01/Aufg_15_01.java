// Aufg_15_01.java

import javax.swing.*;
import java.awt.FlowLayout;

public class Aufg_15_01 extends JFrame {

    public static void main (String[] args){

        // Hauptfenster erzeugen
        new Aufg_15_01("Hauptfenster");

    }

     public Aufg_15_01(String titel){
 
        super(titel);
        setLayout (new FlowLayout());

        // Label erzeugen
        JLabel label1 = new JLabel ("Hallo Welt!");

        // Label dem Hauptfenster hinzufuegen.
        add (label1);

       // Groesse des Fensters
       setSize (400, 100);

       setDefaultCloseOperation(EXIT_ON_CLOSE);

       // sichtbar machen
       setVisible (true);
    }
} 

