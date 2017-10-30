/*
 * Primitive type reside in stack
 * Object reside in Heap and they can reference to another object in Heap
 */
package orelly.firstproject;

public class Main {

	public static void main(String[] args) {
		
		Main m = new Main();
		
		m.run(); //we can only call static method from static context , for non-static method to call we need a object

	}

	private void run() {
		
		Person p = new Person();
		p.setFirstName("Deepender");
		p.setLastName("Rathore");
		p.setAge(25);
		
		Person mom = new Person();
		mom.setFirstName("Lata");
		mom.setLastName("Kanwar");
		
		p.setMom(mom);
		
		p.setAge(42);
		while(p.getAge() < 52){
			switch(p.getAge()) {
			case 45:
				System.out.println(p.getFullName() +" Age =  "+ p.getAge());
			case 50:
				System.out.println(p.getFullName() +" Age =  "+ p.getAge());
			}
			p.birthday();
		};
		
		/*
		 * 	Deepender Rathore Age =  45
			Deepender Rathore Age =  45
			Deepender Rathore Age =  50
		 */
		
	}

}
