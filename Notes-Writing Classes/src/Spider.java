
public class Spider {

	//properties / attributes
	//make them private
	//add 4 attributes
	private String pattern;
	private boolean venomous;
	private String name;
	private boolean canGlide;
	private double length;
	

	
	
	//add a default constructor
	Spider s = new Spider();	
	/*
	 * 
	 * Spider s = new Spider("trantula")
	 * 
	 * what constructor do yo need so the
	 * code above is valid
	 * 
	 */
	Spider s2 = new Spider("trantula", true, "solid brown",  5);

	
	
	
	
	public Spider() {
		pattern = "solid";
		venomous = false;
		name = "American House Spider";
		canGlide = false;
		length = 1;
		
	}
	
	public void setPattern(String Pattern) {
		this.pattern = pattern;
}
	
	public Void setName(String newName) {
		//assign instance varibale property to the parameter
		name = newName;
		return null;
	}
	
	/* setters-allow for change of instances variables*/
	public void setLength(double newLength   ) {
		//has a parameter because you're expecting information from the user
		//to see the new value
		length = newLength;
	}
	
	public double getLength() {
		return length;
	}
	
	public boolean getVenomous() {
		return venomous;
	}
	
	/* getter for the name */
	public String getName() {
		return name;
		
	}
	

	
	//constructor with 1 String argument
	///allows setting of the name during
	//object construction
	public Spider(String paramName) {
		this(); //calls default constructor
		name = paramName;
	}
	
	public Spider(String paramName, Boolean paramVenom, String paramPattern, int paramLength) {
		this();
		name = paramName;
		venomous = paramVenom;
		pattern = paramPattern;
		length = paramLength;
	}
	
	
	//add a toString method to allow printing of spider objects
	public String toString() {
		String result = name + "\n";
		result += "venomous: "+venomous+"\n";
		result += "glider:  "+canGlide;
		result += "pattern: "+pattern+"\n";
		result += "length: "+length+"\n";
		return result;
		
		
	}
}
