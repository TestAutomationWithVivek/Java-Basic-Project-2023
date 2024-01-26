package LamdaPractice;

public class AppMainMethodClassForLambda {

	public static void main(String[] args) {
		Human tom = new Human();
		//walker(tom);
		
		Robot robot = new Robot();
		//walker(robot);
		
		walker(() -> System.out.println("Custom object walking"));
		Walkable aLambadaInterface =  (() -> {System.out.println("Custom object walking"); System.out.println("Object is okay ");});
		walker(aLambadaInterface);
		
		ALambadaInterface helloVar = ( () -> System.out.println("Hello there") );
		
		Calculate sumVar = (a,b) -> a+b;	
		System.out.println(sumVar.compute(6, 4));
		
	}
	
	public static void walker(Walkable walkable) {
		walkable.walk();
	}
	
	public void sayhello() {
		System.out.println("Hello there ....");
	}
	
	public int sum(int arg1, int arg2) {
		return arg1+ arg2;
	}
	
	public int nonZeroDivide(int arg1, int arg2) {
		if(arg1 ==0) {
			return 0;
		}
		
		return arg1/arg2;
	}

}



interface Calculate {
	
	public int compute(int a, int b);
}