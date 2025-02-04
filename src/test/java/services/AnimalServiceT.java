package services;

import org.springframework.stereotype.Service;
import model.Animal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimalServiceT {
	 private final List<Animal> animales = new ArrayList<>();

	    public void agregarAnimal(Animal animal) {
	        animales.add(animal);
	    }

	    public List<Animal> getAnimalesPorTipo(String tipo) {
	        return animales.stream()
	                .filter(a -> a.getTipo().equalsIgnoreCase(tipo))
	                .collect(Collectors.toList());
	    }
}
