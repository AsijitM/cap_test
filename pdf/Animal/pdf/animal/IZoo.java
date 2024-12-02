package pdf.animal;

import java.util.List;
import java.util.Map;

public interface IZoo {
	void addAnimal(IAnimal animal);
	void removeAnimal(int id);
	int countAnimal();
	List<IAnimal> getAnimalsBySpecies(String species);
	List<Map<Integer,List<IAnimal>>> getAnimalIsByAge();

}
