package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {


		 //Calendar cal = new Calendar();
		 int day_1 = 15;
		 int month_1 = 01;
		 int year_1 = 2018;
		 GregorianCalendar day = new GregorianCalendar(year_1,month_1, day_1){

		 	int day = day_1;
		 	int moth = month_1;
		 	int year = year_1;

		 };

		 CalDay cal = new CalDay(day);

		 assertEquals(15,cal.getDay());
		 assertEquals(01,cal.getMonth());
		 assertEquals(2018,cal.getYear());

		 cal.isValid();
		 cal.getAppts();
		 cal.getSizeAppts();

		 cal.iterator();

		 Appt appt = new Appt(10, 30, day_1, month_1, year_1, "title",
				 "description");


		 cal.getSizeAppts();
		 cal.getAppts();

		 cal.addAppt(appt);

		 Appt appt_2 = new Appt(12, 30, day_1, month_1, year_1, "title",
				 "description");

		 cal.addAppt(appt_2);

		 Appt appt_3 = new Appt(9, 30, day_1, month_1, year_1, "title",
				 "description");

		 cal.addAppt(appt_3);

		 Appt appt_4 = new Appt(8, 30, day_1, month_1, year_1, "title",
				 "description");

		 appt_4.setStartDay(-1);

		 cal.addAppt(appt_4);
		 cal.toString();
		 //calday

		 //assertEquals(false, calday.CalDay());



	 }


	 @Test
	  public void test02()  throws Throwable  {

		 int day_1 = 15;
		 int month_1 = 01;
		 int year_1 = 2018;
		 GregorianCalendar day = new GregorianCalendar(day_1, month_1, year_1){

			 int day = day_1;
			 int moth = month_1;
			 int year = year_1;

		 };

		 CalDay cal = new CalDay(day);

		 Appt appt;

		 cal.isValid();
		 cal.getSizeAppts();
		 cal.iterator();
		 cal.getAppts();
		 cal.toString();

		 cal.getDay();
		 cal.getMonth();
		 cal.getYear();

		 //assertTrue(appt.getValid());


		 //cal.addAppt(appt);

	 }

	@Test
	public void test03()  throws Throwable  {

		CalDay cal = new CalDay();
		cal.isValid();
		cal.iterator();
		cal.toString();
	}




//add more unit tests as you needed	
}
