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
		
		
		for(int i = 0;i<10;i++) {
			
			
			//System.out.println(p.getFullName() + " Mom: " + p.getMom().getFullName());
			
			System.out.println(p.getFullName() +" "+ p.getAge() +" i = "+ i );
			p.birthday();
		}
		
		
	}

}
