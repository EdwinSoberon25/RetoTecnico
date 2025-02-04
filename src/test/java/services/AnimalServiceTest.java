package services;
import model.Animal;
import model.Terrestre;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalServiceTest {
	 @InjectMocks
	    private AnimalService animalService;

	    @BeforeEach
	    void setUp() {
	        MockitoAnnotations.openMocks(this);
	    }

	    @Test
	    void testAgregarAnimalYObtenerPorTipo() {
	        Animal terrestre = new Terrestre("Firulais", "guau");

	        animalService.agregarAnimal(terrestre);
	        List<Animal> terrestres = animalService.getAnimalesPorTipo("terrestre");

	        assertEquals(1, terrestres.size());
	        assertEquals("Firulais", terrestres.get(0).getNombre());
	    }

	    @Test
	    void testObtenerAnimalesPorTipoVacio() {
	        List<Animal> acuaticos = animalService.getAnimalesPorTipo("acuatico");

	        assertTrue(acuaticos.isEmpty(), "La lista de animales acuáticos debería estar vacía");
	    }
}
