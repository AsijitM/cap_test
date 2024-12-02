package pdf.animal;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a zoo instance
        Zoo zoo = new Zoo();

        // Create some animals
        IAnimal lion = new Animal(1,"Mammals", "Lion", 5);
        IAnimal tiger = new Animal(2,"Mammals", "Tiger", 4);
        IAnimal elephant = new Animal(3,"Mammals","Elephant", 10);
        IAnimal lion2 = new Animal(4,"Mammals", "Lion", 5);
        
        // Add animals to the zoo
        zoo.addAnimal(lion);
        zoo.addAnimal(tiger);
        zoo.addAnimal(elephant);
        zoo.addAnimal(lion2); // Adding another Lion with different age

        // Try adding a duplicate animal
        zoo.addAnimal(lion); // This should print "Already present"

        // Print count of animals
        System.out.println("Total animals in zoo: " + zoo.countAnimal());

        // Get animals by species
        List<IAnimal> lions = zoo.getAnimalsBySpecies("Mammals");
        System.out.println("Lions in zoo: " + lions.size());
        
        // Get animals by age
        List<Map<Integer, List<IAnimal>>> animalsByAge = zoo.getAnimalIsByAge();
        System.out.println("Animals grouped by age: ");
        for (Map<Integer, List<IAnimal>> ageGroup : animalsByAge) {
            for (Map.Entry<Integer, List<IAnimal>> entry : ageGroup.entrySet()) {
                System.out.println("Age: " + entry.getKey() + ", Number of animals: " + entry.getValue());
            }
        }

        // Remove an animal
        zoo.removeAnimal(2); // Removes the Tiger

        // Print count of animals after removal
        System.out.println("Total animals after removal: " + zoo.countAnimal());
    }
}
