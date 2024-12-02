package pdf.animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo implements IZoo{
    List<IAnimal> animals=new ArrayList<>();

	@Override
	public void addAnimal(IAnimal animal) {
		// TODO Auto-generated method stub
		if(!animals.contains(animal)) {
			animals.add(animal);
		}else {
			System.out.println("Already present");
		}

	}

	@Override
	public void removeAnimal(int id) {
		// TODO Auto-generated method stub
		boolean found=false;
		for(int i=0;i<animals.size();i++) {
			IAnimal a=animals.get(i);
		    if(a.getId()==id) {
			   animals.remove(a);
	            break;
		    }
		}
	}

	@Override
	public int countAnimal() {
		// TODO Auto-generated method stub
		return animals.size();
	}

	@Override
	public List<IAnimal> getAnimalsBySpecies(String species) {
		// TODO Auto-generated method stub
		List<IAnimal> l=new ArrayList<>();
		for(IAnimal a:animals) {
			if(a.getSpecies().equals(species)){
				l.add(a);
			}
		}
		return l;
	}

	@Override
	public List<Map<Integer, List<IAnimal>>> getAnimalIsByAge() {
	    List<Map<Integer, List<IAnimal>>> ageGroups = new ArrayList<>();

	    // Create a map to group animals by their age
	    Map<Integer, List<IAnimal>> ageMap = new HashMap<>();
	    
	    // Loop through all animals and group them by age
	    for (IAnimal animal : animals) {
	        // If this age is not yet in the map, add it with a new list
	        if (!ageMap.containsKey(animal.getAge())) {
	            ageMap.put(animal.getAge(), new ArrayList<>());
	        }
	        // Add the animal to the corresponding age group list
	        ageMap.get(animal.getAge()).add(animal);
	    }

	    // Add the map of age groups to the final list
	    ageGroups.add(ageMap);  // Instead of iterating, we add the whole map once

	    return ageGroups;
	}

}
