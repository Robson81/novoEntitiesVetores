package entitites;

public class ExercVect03 {

	private String name;
	private int age;
	private double height;
	private double averageHeight;
	int percentage;
	
	public ExercVect03() {
	}
	public ExercVect03(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}