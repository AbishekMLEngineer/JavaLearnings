package AbstractionAndInterfaceConcept;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;

import org.omg.CORBA.PUBLIC_MEMBER;

public class LambdasInDepth {

	
	public static void main(String[] args) {
		
		
		List<Person> people = Arrays.asList(
				new Person("Abishek", "Kachroo", 27),
				new Person("Akhil","Pandita",27)
				);
		
		//using lamdas
		Collections.sort(people,(Person p1, Person p2) ->p1.get1stName().compareTo(p2.getlastName()) );

		
		
		//Using Java 7 ,as Comparator is the funtional interface we can re-design this using Lamdas too.
		Collections.sort(people, new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2){
				return o1.getlastName().compareTo(o2.get1stName());
			}
		});		
		printAll(people);
		//here the condition that I have passed as a parameter
		printAllWithConditionPassedasParameter(people ,new condition(){
			@Override
			public boolean test(Person p) {
				return p.get1stName().startsWith("c");
			}
		});
		
		// Crispy way to implemet using java 8
		performConditionally(people, p ->p.get1stName().startsWith("c"));
	}
	
//	 printConditionallyWithLambda(people,p ->true);
	
	
	//using Java7 now here I am making the condition in the method itself which is not the good practice , 
	// either we should pass the condtion itself
	public static void printAllWithCondition(List<Person> people){
		for(Person p : people){
			if(p.get1stName().startsWith("a")){
				System.out.println(p);
			}
		}
	}
	
	public static void printAllWithConditionPassedasParameter(List<Person> people, condition con){ 
		for(Person p : people){
			if(con.test(p)){
				System.out.println(p);
			}
		}
	}
	//using Java 7
	public static void printAll(List<Person> people){
		for(Person p : people){
			System.out.println(p);
		}
	}
	//I will use this for Lambdas using Java 8
	public static void performConditionally(List<Person> people, condition cond){
		for(Person p :people ){
			if(cond.test(p)){
				System.out.println(p);
			}
		}
	}
	
	
	
}


interface condition{
	boolean test(Person p);
}