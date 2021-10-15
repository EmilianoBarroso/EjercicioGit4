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
public class Caballo extends Animal {
    
    private int edad;
    private String apodo;

    public Caballo() {
    }

    public Caballo(int edad, String apodo) {
        this.edad = edad;
        this.apodo = apodo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Caballo{" + "edad=" + edad + ", apodo=" + apodo + '}';
    }
    
    
    
}
