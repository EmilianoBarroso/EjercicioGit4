package entidades;

public class Pajaro extends Animal{
    private String color;

    public Pajaro() {
    }

    public Pajaro(String color) {
        this.color = color;
    }

    public Pajaro(String color, String nombre, String raza) {
        super(nombre, raza);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pajaro{" + "color=" + color + '}';
    }
    
}
