
public class Bats {

		private String pattern;
		private boolean nocturnal;
		private String name;
		private boolean canGlide;
		private double length; 
		


	public Bats () {
	pattern = "solid";
	nocturnal = true;
	name = "Batsy";
	canGlide = true;
	length = 24;

	}
	
	public Bats(String paramName) {
		this();
		name = paramName;
	}
	


public Bats(String paramName, Boolean paramturnal, String paramPattern, int paramLength) {
	this();
	name = paramName;
	nocturnal = paramturnal;
	pattern = paramPattern;
	length = paramLength;
}


   

public String toString() {
	String result = name + "\n";
	result += "nocturnal: "+nocturnal+"\n";
	result += "glider:  "+canGlide;
	result += "pattern: "+pattern+"\n";
	result += "length: "+length+"\n";
	return result;
}

}
	