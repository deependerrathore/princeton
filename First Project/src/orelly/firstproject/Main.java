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
		int i = 25;
		double d = 25.25;
		boolean b = true;
		char c = 'D';
		//c = b; not allowed
		//b = c;
		i = (int) d;
		
		System.out.println(p.getFullName() + " " + i);
		
		System.out.println(p.getFullName() +" "+ p.getAge());
		
	}

}
