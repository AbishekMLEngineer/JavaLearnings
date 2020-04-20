package AbstractionAndInterfaceConcept;

public class ThreadRunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable(){ // this is possible because runnable interface has only 1 method
			@Override
			public void run() {
				System.out.println("Inside this method");
				
			}
		});
		myThread.run();
		
		Thread myLambdaThread = new Thread(()-> System.out.println("using lamda thread only")  );
		
		myLambdaThread.run();
		
	}

}
