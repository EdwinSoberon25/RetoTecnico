package model;

public class Pez extends Animal  {

	public Pez(String nombre, String onomatopeya) {
        super(nombre, onomatopeya);
    }

    @Override
    public String getTipo() {
        return "Acuático";
    }
}
