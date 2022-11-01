
public class Runner {

	public static void main(String[] args) {
		//dot operator allows access to all PUBLIC methods and properties 
System.out.println("casper");

}
//only 1 public class can exist in a java file 
//and it should match the file name
//Holloween = Fall = thanksgiving
//UNIT 2: class - template for creating objects
class Ghost{
	//properties - Attributes
	//private - always try to hide properties from outsiders
	private String name;
	private double opacity;
	private double height;
	private boolean isScary;
	
	
	
	//add constructor that will set the attributes
	//to some default state
	public Ghost() { //zero-argument constructor (default Constructor)
		
	
		name = "Boo";
		opacity = 0.0;
		height = 5.0;
		isScary = false;
	}
}
}

	



//the tostring method allows printing of this object
//it's called everyting this object is passed to print or println
