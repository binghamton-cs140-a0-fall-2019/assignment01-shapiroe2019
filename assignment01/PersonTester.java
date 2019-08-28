package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
public class PersonTester{
	public static void main(String[] args){
		DateAndPlaceOfBirth BirthdayPlace = new DateAndPlaceOfBirth(2000,5,28,"Rochester","NY","USA");
		StreetUSAddress address = new StreetUSAddress("1122 BoogieWoogie Ave","Apt. 666","Minas Tirith","Gondor","12345");
		Person Eric = new Person("Eric","Shapiro","666-66-6666",BirthdayPlace,address);
		System.out.println(Eric.toString());
	}
}
