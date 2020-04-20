package AbstractionAndInterfaceConcept;

public class NOrmalInterfaceClass implements NormalInterface{

//here is the method which is accepting object of INterface and returning the length of it.
//	public  String greeting(B obj){
//		return obj.abcLength("Abcd");
//		
//	}
	public static void main(String[] args) {
		NOrmalInterfaceClass oj = new NOrmalInterfaceClass();
		NormalInterface ox = (x,y) -> x+y; 
		System.out.println(ox.add(50, 8));
		
		B objx = (String s)-> s.length();
		
		
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}

@FunctionalInterface
interface B{
	public int abcLength(String s);
}

