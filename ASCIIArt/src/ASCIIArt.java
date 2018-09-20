/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)
public class ASCIIArt {
	public static void neck () {
	System.out.println("  |     |_");
	}
	public static void tail () {
	System.out.print("\\ \\");
	}
	public static void feet () {
	System.out.print("  |    |");
	}
	public static void legs () {
	feet();
	feet();
	feet();
	feet();
	}
	public static void actualFeet () {
	System.out.print("  /____)");	
	}
	public static void allFeet () {
	actualFeet();
	actualFeet();
	actualFeet();
	actualFeet();
	}
	public static void main (String[] args) {
	System.out.println("   O   O");
	System.out.println("   |_ _| ");
	System.out.println("   | U |");
	System.out.println(" (o>  <o)3");
	System.out.println(" _|__   |");
	System.out.println("(.      |");
	System.out.println(" ---    |---\"Where did my mama go?\"");
	System.out.println("(_______|");
	neck();
	neck();
	neck();
	neck();
	neck();
	neck();
	neck();
	neck();
	neck();
	System.out.println("  |      \\_______________________");
	System.out.println("  |            ___               \\");
	System.out.print("  |           /   \\   ___      |");
	tail();
	System.out.print("\n  |     ___   \\___/  /   \\     | ");
	tail();
	System.out.print("\n  |    /   \\         \\___/     |  ");
	tail();
	System.out.print("\n  |    \\___/                   |   ");
	System.out.print("( )");
	System.out.print("\n  |    |  |    |  |    |  |    |    ");
	System.out.println("\\\\\\");
	legs();
	System.out.println();
	legs();
	System.out.println();
	legs();
	System.out.println();
	allFeet();
	System.out.println("\n This is a giraffe who is lost from his mother.");
	}
}