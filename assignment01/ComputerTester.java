package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester{
	public static void main(String[] args){
	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
	Computer a= new Computer("Dell","x86",500,2000,true,1000);
	Computer b= new Computer("Dell","x86",500,800,true,1000);
	Computer c= new Computer("Dell","x86",500,2000,false,1000);
	Computer d= new Computer("Dell","x86",500,800,false,1000);
	System.out.println();
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
