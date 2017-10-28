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
		System.out.println(p.getFullName());
		
	}

}
