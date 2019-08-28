package assignment01;
public class SimpleDate{
	int year;
	int month;
	int day;
	public SimpleDate(int yr, int m, int d){
		year=yr;
		month=m;
		day=d;
	}
	public static SimpleDate of(int yr, int m, int d){
		var returnValue = new SimpleDate(yr,m,d);
		returnValue.year = yr;
		returnValue.month = m;
		returnValue.day = d;
		return returnValue;
	}
	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	public boolean before(SimpleDate other){
		return ((this.getYear()<other.getYear()) ||
			(this.getYear()==other.getYear() && this.getMonth()<other.getMonth())||
			(this.getYear()==other.getYear() && this.getMonth()==other.getMonth() && this.getDay()<other.getDay()));
	}
}
