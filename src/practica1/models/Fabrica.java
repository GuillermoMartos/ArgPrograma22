package practica1.models;

/*
mi clase loca n1
*/
public class Fabrica {
    private String name;
    private int puertas;

    public Fabrica(String name, int puertas) {
        this.name = name;
        this.puertas = puertas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Autito loco [name=" + name + ", puertas=" + puertas + "]";
    }
    
}
