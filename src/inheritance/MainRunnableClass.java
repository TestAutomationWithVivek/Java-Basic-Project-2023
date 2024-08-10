package inheritance;

public class MainRunnableClass {

	public static void main(String[] args) {
		//Creating child object and storing it with parent reference, only parent specific method will be called
        
		ParentClass parent = new ChildClass();
		parent.doSomething();
	}

}
