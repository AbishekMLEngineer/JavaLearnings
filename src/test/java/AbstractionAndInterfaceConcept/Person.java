package AbstractionAndInterfaceConcept;

public class Person {
	String FirstName= ""; 
	String LastName ="" ;
	int age= 0;
	
	
	Person(String FirstName, String LastName, int age){
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.age = age;
	}
	public String getlastName(){
		return LastName;
	}
	
	public String get1stName(){
		return FirstName;
	}
	public int getAge(){
		return age;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
