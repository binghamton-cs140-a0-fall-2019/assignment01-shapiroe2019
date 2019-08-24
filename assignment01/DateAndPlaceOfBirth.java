package assignment01;
import java.time.LocalDate;
/**
 * Class to store a data and place of birth.
 * @author CS 140
 *
 */
public class DateAndPlaceOfBirth {
	private LocalDate dateOfBirth;
	private String placeOfBirth;
	/**
	 * Initialization constructor used to set the values of all the fields/
	 * To be used if the country of birth is divided into states. The value
	 * could be a province, department, or other region of the country as appropriate.
	 * @param yearOfBirth the year of birth (use 4 digits)
	 * @param monthOfBirth the month of birth (a value of 1 through 12)
	 * @param dayOfBirth the day in the month of the birth
	 * @param cityOfBirth the name of the city of birth
	 * @param stateOfBirth the state where this city is
	 * @param countryBirth the country where the birth took place
	 */
	public DateAndPlaceOfBirth(
			int yearOfBirth, 
			int monthOfBirth, 
			int dayOfBirth,
			String cityOfBirth,
			String stateOfBirth,
			String countryBirth) {
		dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
		placeOfBirth = cityOfBirth + ", " + stateOfBirth + ", " + countryBirth;
	}
	/**
	 * Initialization constructor used to set the values of all the fields.
	 * To be used if the country of birth is not divided into states.
	 * @param yearOfBirth the year of birth (use 4 digits)
	 * @param monthOfBirth the month of birth (a value of 1 through 12)
	 * @param dayOfBirth the day in the month of the birth
	 * @param cityOfBirth the name of the city of birth
	 * @param countryBirth the country where the birth took place
	 */
	public DateAndPlaceOfBirth(
			int yearOfBirth, 
			int monthOfBirth, 
			int dayOfBirth,
			String cityOfBirth,
			String countryBirth) {
		dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
		placeOfBirth = cityOfBirth + ", " + countryBirth;
	}
	/**
	 * Getter method for the date of birth
	 * @return the date of birth
	 */
	public static void main(String[] args){
		DateAndPlaceOfBirth a = new DateAndPlaceOfBirth(2000,5,28,"Rochester","NY","USA");
		DateAndPlaceOfBirth b = new DateAndPlaceOfBirth(1992,5,28,"Rochester","NY","USA");
		DateAndPlaceOfBirth c = new DateAndPlaceOfBirth(2002,3,27,"Rochester","NY","USA");
		DateAndPlaceOfBirth d = new DateAndPlaceOfBirth(1998,6,16,"Minsk","Belarus");
		DateAndPlaceOfBirth e = new DateAndPlaceOfBirth(2001,2,03,"Tel Aviv","Israel");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println( );
		System.out.println(a.olderThan(d));
		System.out.println(a.youngerThan(d));
		System.out.println(a.hasSameBirthDateAs(b));
		System.out.println(a.hasSameBirthDayAs(b));
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * Getter method for the place if birth. The format is
	 * "city, state, country", or "city, country" if there is no
	 * state.
	 * @return the place of birth
	 */
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	
	/**
	 * The method olderThan returns true if the date of birth of
	 * this DateAndPlaceOfBirth is before the date of birth of
	 * other, otherwise false.
	 * @param other the DateAndPlaceOfBirth for comparison
	 * @return true if this DateAndPlaceOfBirth has a date of birth
	 * is older than the date of birth of other and false otherwise
	 */
	public boolean olderThan(DateAndPlaceOfBirth other) {
		return dateOfBirth.isBefore(other.dateOfBirth);
	}
	/**
	 * The method youngerThan returns true if the date of birth of
	 * this DateAndPlaceOfBirth is after the date of birth of
	 * other, otherwise false.
	 * @param other the DateAndPlaceOfBirth for comparison
	 * @return true if this DateAndPlaceOfBirth has a date of birth
	 * is younger than the date of birth of other and false otherwise
	 */
	public boolean youngerThan(DateAndPlaceOfBirth other) {
		return dateOfBirth.isAfter(other.dateOfBirth);
	}
	/**
	 * The method hasSameBirthDateAs returns true if the date of birth of
	 * this DateAndPlaceOfBirth is the same as the date of birth of
	 * other, otherwise false.
	 * @param other the DateAndPlaceOfBirth for comparison
	 * @return true if this DateAndPlaceOfBirth has the same date of birth
	 * as the date of birth of other and false otherwise
	 */
	public boolean hasSameBirthDateAs(DateAndPlaceOfBirth other) {
		return dateOfBirth.isEqual(other.dateOfBirth);
	}
	/**
	 * The method hasSameBirthDayAs returns true if the date of birth of
	 * this DateAndPlaceOfBirth ahs the same month and day as the date of birth of
	 * other, otherwise false.
	 * @param other the DateAndPlaceOfBirth for comparison
	 * @return true if this DateAndPlaceOfBirth has a date of birth
	 * the same day and month as the date of birth of other and false otherwise
	 */
	public boolean hasSameBirthDayAs(DateAndPlaceOfBirth other) {
  //TODO complete this method
		return (dateOfBirth.getMonthValue()==other.dateOfBirth.getMonthValue() && dateOfBirth.getDayOfMonth()==other.dateOfBirth.getDayOfMonth());
  }
	@Override
	public String toString() {
		return "Date and place of birth: " + dateOfBirth + ", " + placeOfBirth;
	}	
}
