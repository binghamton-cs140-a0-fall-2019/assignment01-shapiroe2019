package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester{
	public static void main(String[] args){
		Computer a = new Computer("Dell","idk",512,16,true,800.0);
		Computer b = new Computer("Dell","idk",1024,16,false,800.0);
		Computer c = new Computer("Dell","idk",1024,16,true,800.0);
		Computer d = new Computer("Dell","idk",512,16,false,800.0);
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}