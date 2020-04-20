package ProjectJava.learnNew;

public class ChilClass  extends ParentClass{
	
	int x = 20;

	public  ChilClass() {
		m1();
	}
	
	public void m1(){
		System.out.println("hell Xyz");
	}
	
	public void mx(){
		System.out.println(this.x);
		System.out.println(super.x);
	}
	
	public static void main(String[] args) {
		ChilClass obj1 = new ChilClass();
		obj1.mx();
/*		
		obj1.m1();
	
		ParentClass obj3 = new ParentClass();
		obj3.m1();
//this is method over-riding		
		ParentClass obj2 = new ChilClass();
		obj2.m1();*/
	}
	
	public void methodOVerload1(){
		System.out.println("Ladakh");
	}
	
	public void methodOVerload1(String x , int y){
		System.out.println("Ladakh with "+x+" "+y);
	}
	
	
	public void m2(){
		super.m1();
		
	}
	public static void m4(){
		System.out.println("hello hi");
	}
	public void m3(){
		this.m2();
		m4();
	}
	
	
	

}
