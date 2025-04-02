
public class Dog extends Animal implements check,Cloneable{

	public Dog(String name) {
		super(name);
	}
	@Override
	public void eat() {
		System.out.println("I'm fine");
	}
	public void DogEx() {
		System.out.println("I'm just fine");
	}
	public Dog clones() {
		try {
			return (Dog) this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
	@Override
	public void Bark() {
		System.out.println("bark bark");
	}
}
