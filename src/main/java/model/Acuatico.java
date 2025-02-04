package model;

public class Acuatico extends Animal  {

	public Acuatico(String nombre, String onomatopeya) {
        super(nombre, onomatopeya);
    }

    @Override
    public String getTipo() {
        return "Acuático";
    }
}
