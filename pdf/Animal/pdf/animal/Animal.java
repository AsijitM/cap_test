package pdf.animal;

public class Animal implements IAnimal{
	private int id;
	private String species;
	private String name;
	private int age;
	
	
	public Animal(int id, String species, String name, int age) {
		super();
		this.id = id;
		this.species = species;
		this.name = name;
		this.age = age;
	}
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id=id;
	}
	@Override
	public String getSpecies() {
		// TODO Auto-generated method stub
		return species;
	}
	@Override
	public void setSpecies(String species) {
		// TODO Auto-generated method stub
		this.species=species;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age=age;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", species=" + species + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
