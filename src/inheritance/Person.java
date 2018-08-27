package inheritance;

public class Person {
	String name;
	 private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	void display() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		
	}
		

}
