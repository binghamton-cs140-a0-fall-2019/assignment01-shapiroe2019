package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester{
	public static void main(String[]args){
		StreetUSAddress BingUnivAddress = new StreetUSAddress("1122 BoogieWoogie Ave","Apt 3344","Alert","Nunavut","00000");
		StreetUSAddress EricsHouseAddress = new StreetUSAddress("1122 BoogieWoogie Ave","","Alert","Nunavut","00000");
		System.out.println(BingUnivAddress);
		System.out.println(EricsHouseAddress);
		try(var output =new PrintWriter(new FileOutputStream(
		    new File("output.txt"), true /* true means append to file */))) {
		output.println("\nTESTS FOR StreetUSAddress.java:");
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
