package services;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import model.Animal;

@Service
public class AnimalService {
	  private List<Animal> animales = new ArrayList<>();

	    public void agregarAnimal(Animal animal) {
	        animales.add(animal);
	    }

	    public List<Animal> getAnimalesPorTipo(String tipo) {
	        return animales.stream()
	                .filter(a -> a.getTipo().equalsIgnoreCase(tipo))
	                .collect(Collectors.toList());
	    }

	    public List<Animal> getAnimales() {
	        return animales;
	    }
}
