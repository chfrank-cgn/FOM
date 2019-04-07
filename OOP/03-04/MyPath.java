public class MyPath {

	public static void main(String[] args) {

		String myPath = "C:\\Eigene Dateien\\Javatest\\Beispiel.java";
		int myDot;
		int mySlash;

		// "https://docs.oracle.com/javase/7/docs/api/java/lang/String.html"

		// Find split points
		myDot=myPath.lastIndexOf(".");
		mySlash=myPath.lastIndexOf("\\");

		// Extension
		System.out.println ("Extension: \t"+myPath.substring(myDot+1));

		// Filename
		System.out.println ("Filename: \t"+myPath.substring(mySlash+1,myDot));

		// Directory
		System.out.println ("Directory: \t"+myPath.substring(0,mySlash));

	}

}
