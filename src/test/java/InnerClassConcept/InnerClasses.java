package InnerClassConcept;

public class InnerClasses {
	
	public void m1(){
		System.out.println("Heloo xyz");
	}

	public static void main(String[] args) {
	
		InnerClasses obj = new InnerClasses(){
			public void m1(){
				System.out.println("Hello");
			}
		};
		obj.m1();
		InnerClasses obj2 = new InnerClasses();
		obj2.m1();
		//Creation of SubInnerClass object 
		//Very Important
		InnerClasses.SubInnerClass obj3 =  obj2.new SubInnerClass() ;
		System.out.println("Demo roll number is " +obj3.rollno);
		
	}
	
	class SubInnerClass{
		int rollno  = 13;
		int std;
		
	}
}
