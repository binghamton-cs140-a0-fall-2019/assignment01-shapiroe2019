package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester{
	public static void main(String[] args){
		SimpleDate birthDate = new SimpleDate(2020,9,27);
		SimpleDate today = new SimpleDate(2019,8,28);
		System.out.println(birthDate.before(today));
	}
}
