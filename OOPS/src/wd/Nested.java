package wd;

public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nested_Class outer = new Nested_Class(); // outer class
		Nested_Class.Inner inner = outer.new Inner();
		inner.display();
		Nested_Class.one o = outer.new one();
		o.display();

		Animal a = new Dog();
		Dog d = new Dog();
		d.sound();
		a.sound();

	}

}
