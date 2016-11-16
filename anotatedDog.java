public class Dog {

	String name;
	
	public static void main (String args[]) {
	
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
	
		// new dogs array
		
		Dog[] myDogs = new Dog[3];
		
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;

		//

		myDogs[0].name = "Joëy";
		myDogs[0].name = "Pérrez";
	
		System.out.println("Last dog's name");		
		System.out.println(myDogs[2].name);		
	
	
		int x = 0;	
		while(x < myDogs.length) {
			myDogs[x].bark();
			x++;
		}
	}

	public void bark() {
		System.out.println(name +"Says Ruff ");		
	}

	public void eat() {
		System.out.println(name +"eats his potatoes");		
	}
	
	public void chaseCat() {
		System.out.println(name +"runs after a cat!");		
	}



}

