package model;

public abstract class Animal{

	private String nombre;
    private String onomatopeya;

    public Animal(String nombre, String onomatopeya) {
        this.nombre = nombre;
        this.onomatopeya = onomatopeya;
    }

    public abstract String getTipo();

    public String getNombre() {
        return nombre;
    }

    public String getOnomatopeya() {
        return onomatopeya;
    }

    @Override
    public String toString() {
        return nombre + " hace " + onomatopeya;
    }
}
