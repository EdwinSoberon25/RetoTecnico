package model;

public class Perro extends Animal {

	public Perro(String nombre, String onomatopeya) {
        super(nombre, onomatopeya);
    }

    @Override
    public String getTipo() {
        return "Terrestre";
    }
}
