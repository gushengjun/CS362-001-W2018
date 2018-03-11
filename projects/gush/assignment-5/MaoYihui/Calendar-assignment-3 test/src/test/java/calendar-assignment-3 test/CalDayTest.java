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
		GregorianCalendar day = new GregorianCalendar(2018,01, 15){

			int day = 15;
			int moth = 01;
			int year = 2018;

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
		assertEquals(10,cal.getAppts().get(0).getStartHour());
		Appt appt_2 = new Appt(12, 30, day_1, month_1, year_1, "title",
				"description");

		cal.addAppt(appt_2);
		assertEquals(12,cal.getAppts().get(1).getStartHour());

		Appt appt_3 = new Appt(9, 30, day_1, month_1, year_1, "title",
				"description");
		cal.addAppt(appt_3);
		assertEquals(9,cal.getAppts().get(0).getStartHour());

		Appt appt_4 = new Appt(8, 30, day_1, month_1, year_1, "title",
				"description");


		appt_4.setStartDay(-1);
		cal.addAppt(appt_4);
		assertEquals(9,cal.getAppts().get(0).getStartHour());
		cal.toString();
		//calday

		Appt appt_5 = new Appt(19, 30, day_1, month_1, year_1, "title",
				"description");
		cal.addAppt(appt_5);
		assertEquals(19,cal.getAppts().get(3).getStartHour());

		Appt appt_6 = new Appt(8, 16, day_1, month_1, year_1, "title",
				"description");
		cal.addAppt(appt_6);
		assertEquals(8,cal.getAppts().get(0).getStartHour());

		Appt appt_7 = new Appt(19, 27, day_1, month_1, year_1, "title",
				"description");
		cal.addAppt(appt_7);
		assertEquals(19,cal.getAppts().get(5).getStartHour());

		Appt appt_8 = new Appt(4, 30, day_1, month_1, year_1, "title",
				"description");
		cal.addAppt(appt_8);
		assertEquals(4,cal.getAppts().get(0).getStartHour());

		Appt appt_9 = new Appt(19, 59, day_1, month_1, year_1, "title",
				"description");
		cal.addAppt(appt_9);
		assertEquals(19,cal.getAppts().get(6).getStartHour());

		Appt appt_10 = new Appt(10, 30, day_1, month_1, year_1, "title",
				"description");
		cal.addAppt(appt_10);
		assertEquals(10,cal.getAppts().get(3).getStartHour());
 /*
		 Appt appt_11 = new Appt(10, 30, day_1, month_1, year_1, "title",
				 "description");
		 cal.addAppt(appt_11);
		 assertEquals(10,cal.getAppts().get(3).getStartHour());
		 Appt appt_12 = new Appt(7, 30, day_1, month_1, year_1, "title",
				 "description");
		 cal.addAppt(appt_12);
		 assertEquals(7,cal.getAppts().get(1).getStartHour());
		 Appt appt_13 = new Appt(11, 30, day_1, month_1, year_1, "title",
				 "description");
		 cal.addAppt(appt_13);
		 assertEquals(11,cal.getAppts().get(7).getStartHour());
		 Appt appt_14 = new Appt(3, 30, day_1, month_1, year_1, "title",
				 "description");
		 appt_14.setStartHour(-1);
		 cal.addAppt(appt_14);
		 assertEquals(-1,cal.getAppts().get(0).getStartHour());
*/
		GregorianCalendar day_null = new GregorianCalendar();
		CalDay calday_1 = new CalDay(day_null);
		assertNotEquals(null, calday_1.getAppts());
		assertEquals(0,calday_1.getSizeAppts());
		//assertEquals(false, calday.CalDay());
		assertNotEquals(null, cal.toString());

		assertNotEquals(null, cal.getAppts());

	}


	@Test
	public void test02()  throws Throwable  {

		int day_1 = 15;
		int month_1 = 01;
		int year_1 = 2018;
		GregorianCalendar day = new GregorianCalendar(2018, 01, 15){

			int day = 15;
			int moth = 15;
			int year = 2018;

		};

		CalDay cal = new CalDay(day);

		// Appt appt;

		cal.isValid();
		cal.getSizeAppts();
		assertNotEquals(null,cal.iterator());
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
		assertEquals(null,cal.iterator());
		cal.toString();
		assertEquals("", cal.toString());
		assertEquals(null,cal.appts);


		//assertNotEquals("",cal.getSizeAppts());
/*
		GregorianCalendar day_1 = new GregorianCalendar();
		CalDay cal_2 = new CalDay(day_1);
*/
	}

	@Test
	public void test04() throws Throwable{
		int day_1 = 15;
		int month_1 = 01;
		int year_1 = 2018;
		GregorianCalendar day = new GregorianCalendar(2018,01, 15){

			int day = 15;
			int moth = 01;
			int year = 2018;

		};

		CalDay cal = new CalDay(day);

		Appt appt_2 = new Appt(4, 30, day_1, month_1, year_1, "title",
				"description");

		cal.addAppt(appt_2);
		assertEquals(4,cal.getAppts().get(0).getStartHour());

		Appt appt_3 = new Appt(4, 30, day_1, month_1, year_1, "title",
				"description33");
		cal.addAppt(appt_3);
		assertEquals(4,cal.getAppts().get(0).getStartHour());
		assertEquals(4,cal.getAppts().get(1).getStartHour())
		;
		Appt appt_4 = new Appt(8, 30, day_1, month_1, year_1, "title",
				"description");
		cal.addAppt(appt_4);
		assertEquals(8,cal.getAppts().get(2).getStartHour());

		Appt appt_5 = new Appt(2, 30, day_1, month_1, year_1, "title",
				"description");
		cal.addAppt(appt_5);
		assertEquals(2,cal.getAppts().get(0).getStartHour());
		assertEquals(8,cal.getAppts().get(3).getStartHour());

		Appt appt_6 = new Appt(22, 30, day_1, month_1, year_1, "title",
				"description");
		cal.addAppt(appt_6);
		assertEquals(22,cal.getAppts().get(4).getStartHour());

		Appt appt_7 = new Appt(22, 29, day_1, month_1, year_1, "title",
				"description");
		cal.addAppt(appt_7);
		//	appt_7.setStartMinute(29);
		assertEquals(22,cal.getAppts().get(5).getStartHour());
		assertEquals(29,cal.getAppts().get(5).getStartMinute());
		assertEquals(15,cal.getAppts().get(5).getStartDay());
		assertEquals(1, cal.getAppts().get(5).getStartMonth());
		assertEquals(2018,cal.getAppts().get(5).getStartYear());


	}


//add more unit tests as you needed	
}
