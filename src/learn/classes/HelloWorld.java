//$Id$
package learn.classes;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		//Person object creation(new operator)
		Person john = new Person();
		john.setName("john");
		john.setAge(20);
		john.setGender('M');
		System.out.println(john.toString());
		System.out.println(john.ageAfterTenYears());
	}

}
