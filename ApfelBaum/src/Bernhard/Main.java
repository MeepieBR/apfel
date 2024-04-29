package Bernhard;

public class Main {

	
	public static void main(String[] args) {
		
		float first = 1.25f, second = 2.25f;
		
	
	System.out.println("[--Before swap--]");	
	System.out.println(first);
	System.out.println(second);
	
	float temporary = first;
	
	first = second;
	
	second = temporary;
	
	System.out.println("[--After swap--]");
	System.out.println(first);
	System.out.println(second);
	
	
	
	}
	
}
