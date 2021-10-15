package entidades;

public class Perro extends Animal{
    private String tamanio;
    private int edad;

    public Perro() {
    }

    public Perro(String tamanio, int edad) {
        this.tamanio = tamanio;
        this.edad = edad;
    }

    public Perro(String tamanio, int edad, String nombre, String raza) {
        super(nombre, raza);
        this.tamanio = tamanio;
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "tamanio=" + tamanio + ", edad=" + edad + '}';
    }
    
    
}
