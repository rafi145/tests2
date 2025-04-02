
public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println("my name is "+name+" and i'm eating...");
	}
	public void sit() {
		System.out.println("my name is "+name+" and i'm sitting...");
	}
	public abstract void DogEx();
}
