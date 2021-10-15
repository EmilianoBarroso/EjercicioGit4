/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Gato extends Animal{
    
    private int edad;
    private int tamanio;

    public Gato() {}

    public Gato(int edad, int tamanio, String nombre, String raza) {
        super(nombre, raza);
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Gato{" + "edad=" + edad + ", tamanio=" + tamanio + '}';
    }
    
    
    
}
