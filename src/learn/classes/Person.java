package learn.classes;

public class Person {
		String name; //fields or properties
		int age;
		char gender;
		
		public String getName() { 
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		
		public String toString(){
			return "name : "+ this.name + "\nage : "+this.age + "\ngender : "+this.gender;
		}
		
		String ageAfterTenYears(){ //methods
			return this.name + " is "+ (this.age + 10) + " years old after 10 years from now.";
		}
}