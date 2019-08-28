package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
public class ComputerOwnerTester{
	public static void main(String[] args){
		DateAndPlaceOfBirth DPOB = new DateAndPlaceOfBirth(2000,5,28,"Minas Tirith","Gondor","MiddleEarth");
		StreetUSAddress address = new StreetUSAddress("1122 BoogieWoogie Ave","Apt. 666","Minas Tirith","Gondor","66666");
		Person Eric = new Person("Eric","Shapiro","666-66-6666",DPOB,address);
		ComputerOwner EricShapiro = new ComputerOwner(Eric);
		Computer a = new Computer("Dell","Intel 80486DX2",500,1600,true,1000);
                Computer b = new Computer("Dell","Intel 80486DX2",500,800,true,1000);
                Computer c = new Computer("Dell","Intel 80486DX2",500,1600,false,1000);
                Computer d = new Computer("Dell","Intel 80486DX2",500,800,false,1000);
		EricShapiro.addComputer(a);
		EricShapiro.addComputer(b);
                EricShapiro.addComputer(c);
                EricShapiro.addComputer(d);
                EricShapiro.removeComputer(2);
		System.out.println(EricShapiro);

	}
}
