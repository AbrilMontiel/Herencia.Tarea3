/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;

import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class Gato extends Animal{
    private String raza;
    private String tipoPelo;
    private String tamaño;
    private Color color;

    public Gato() {
    }

    public Gato(String raza, String tipoPelo, String tamaño, Color color) {
        this.raza = raza;
        this.tipoPelo = tipoPelo;
        this.tamaño = tamaño;
        this.color = color;
    }

    public Gato(String raza, String tipoPelo, String tamaño, Color color, int numeroPatas, String orden, String clase, String especie) {
        super(numeroPatas, orden, clase, especie);
        this.raza = raza;
        this.tipoPelo = tipoPelo;
        this.tamaño = tamaño;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+ "Gato{" + "raza=" + raza + ", tipoPelo=" + tipoPelo + ", tama\u00f1o=" + tamaño + ", color=" + color + '}';
    }
    
    @Override
    public void emitirsonido (){
        super.emitirsonido();
        System.out.println("Ronronear");
        
    }    

}
