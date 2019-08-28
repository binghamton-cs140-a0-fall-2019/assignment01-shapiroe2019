package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester{
	public static void main(String[] args){
		DateAndPlaceOfBirth a = new DateAndPlaceOfBirth(2000,5,28,"Rochester","NY","USA");
		DateAndPlaceOfBirth b = new DateAndPlaceOfBirth(1992,5,27,"Rochester","NY","USA");
		DateAndPlaceOfBirth c = new DateAndPlaceOfBirth(2000,5,27,"Rochester","NY","USA");
		DateAndPlaceOfBirth d = new DateAndPlaceOfBirth(1998,6,16,"Minsk","Belarus");
		DateAndPlaceOfBirth f = new DateAndPlaceOfBirth(2001,2,03,"Tel Aviv","Israel");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		System.out.println( );
		System.out.println(a.olderThan(d));
		System.out.println(a.youngerThan(d));
		System.out.println(a.hasSameBirthDateAs(c));
		System.out.println(a.hasSameBirthDayAs(b));
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
