/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.herencia;

/**
 *
 * @author DELL
 */
public class Gato extends Animal {
    
     private int numeroVidas;
    private int numeroAccidentesFatales;
    
    public int calcularVidasRestantes(){
        return this.numeroVidas-this.numeroAccidentesFatales;
    }
    
    
    //Getters & Setters

    public int getNumeroVidas() {
        return numeroVidas;
    }

    public void setNumeroVidas(int numeroVidas) {
        this.numeroVidas = numeroVidas;
    }

    public int getNumeroAccidentesFatales() {
        return numeroAccidentesFatales;
    }

    public void setNumeroAccidentesFatales(int numeroAccidentesFatales) {
        this.numeroAccidentesFatales = numeroAccidentesFatales;
    }
    
}
