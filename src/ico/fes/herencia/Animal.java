/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;


/**
 *
 * @author Usuario
 */
public class Animal {
    private int numeroPatas;
    private String orden;
    private String clase;
    private String especie;

    public Animal() {
    }

    public Animal(int numeroPatas, String orden, String clase, String especie) {
        this.numeroPatas = numeroPatas;
        this.orden = orden;
        this.clase = clase;
        this.especie = especie;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + ", orden=" + orden + ", clase=" + clase + ", especie=" + especie + '}';
    }
    
     public void emitirsonido (){
        System.out.println("El sonido que hace es: ");
    }  
}

