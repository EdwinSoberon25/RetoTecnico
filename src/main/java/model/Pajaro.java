package model;

public class Pajaro extends Animal  {

	 public Pajaro(String nombre, String onomatopeya) {
	        super(nombre, onomatopeya);
	    }

	    @Override
	    public String getTipo() {
	        return "Volador";
	    }
}
