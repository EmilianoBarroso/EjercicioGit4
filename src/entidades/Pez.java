package entidades;

public class Pez extends Animal{
    private String colorEscamas;

    public Pez() {
    }

    public Pez(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public Pez(String colorEscamas, String nombre, String raza) {
        super(nombre, raza);
        this.colorEscamas = colorEscamas;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    @Override
    public String toString() {
        return "Pez{" + "colorEscamas=" + colorEscamas + '}';
    }
    
    

}
