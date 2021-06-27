/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaanimal;
import ico.fes.herencia.Gato;
import ico.fes.herencia.Perro;
import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class HerenciaAnimal {
    /** @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        Perro perro1 = new Perro("Jack russell terrier", "Lacio-Corto", "Pequeño", Color.white, 4, "Carnivora", "Mammalia", "Canis lupus");
        System.out.println(perro1);
        perro1.emitirsonido();
        
        
        
        Gato gato1 = new Gato("Siberiano", "Lacio-Semilargo", "Mediano", Color.DARK_GRAY, 4, "Carnivora", "Mammalia", "Felis silvestris");
        System.out.println(gato1);
        gato1.emitirsonido();
        
    }

    
}
