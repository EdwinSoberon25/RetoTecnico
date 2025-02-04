package ProyectoTecnico.animal_sounds;

import model.*;
import config.AppConfig;
import services.AnimalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	  ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
          AnimalService animalService = context.getBean(AnimalService.class);

          for (String arg : args) {
              String[] datos = arg.split("\\|");
              String nombre = datos[0];
              String tipo = datos[1];
              String onomatopeya = datos[2];

              Animal animal;
              switch (tipo.toLowerCase()) {
                  case "terrestre":
                      animal = new Terrestre(nombre, onomatopeya);
                      break;
                  case "volador":
                      animal = new Acuatico(nombre, onomatopeya);
                      break;
                  case "acuatico":
                      animal = new Volador(nombre, onomatopeya);
                      break;
                  default:
                      throw new IllegalArgumentException("Tipo no válido: " + tipo);
              };
              animalService.agregarAnimal(animal);
          }

          System.out.println("Animales terrestres:");
          animalService.getAnimalesPorTipo("terrestre").forEach(System.out::println);

          System.out.println("Animales voladores:");
          animalService.getAnimalesPorTipo("volador").forEach(System.out::println);

          System.out.println("Animales acuáticos:");
          animalService.getAnimalesPorTipo("acuatico").forEach(System.out::println);
    	}
    }
