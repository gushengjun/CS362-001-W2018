package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */

	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=10;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(10, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
		 appt.toString();

		 int recurDays[]={1,2,3,4};
		 int recurBy=1;
		 int recurIncrement=2;
		 int recurNumber=5;

		 appt.setRecurrence(recurDays,recurBy,recurIncrement,recurNumber);
		 //Appt compareAppt = new Appt();
		 appt.compareTo(appt);

		 appt.getRecurNumber();
		 appt.getRecurBy();
		 appt.getRecurDays();
		 appt.getRecurIncrement();
		 assertTrue(appt.isRecurring());
		 recurNumber=0;

		 appt.setRecurrence(recurDays,recurBy,recurIncrement,recurNumber);
		 assertFalse(appt.isRecurring());
		 //assertFalse(appt.isRecurring()

	 }

	 @Test
	  public void test02()  throws Throwable {
		 int startHour = 00;
		 int startMinute = 61;
		 int startDay = 24;
		 int startMonth = 01;
		 int startYear = 2018;
		 String title = null;
		 String description = null;

		 Appt appt = new Appt(startHour,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 title,
				 description
		 );

		 appt.setStartHour(00);
		 appt.setStartMinute(61);
		 appt.setStartDay(31);
		 appt.setStartMonth(11);
		 appt.setStartYear(2018);
		 appt.setTitle(null);
		 appt.setDescription(null);
		 appt.toString();

		 int[] recurDays = null;
		 appt.setRecurrence(recurDays, appt.getRecurBy(), appt.getRecurIncrement(), appt.getRecurNumber());

	 }

	@Test
	public void test011()  throws Throwable {

		int startHour_1=16;
		int startMinute = 61;
		int startDay = 24;
		int startMonth = 01;
		int startYear = 2018;
		String title_1 = "hiking";
		String  description_1 = "go hiking";



		 Appt appt_1 = new Appt(startHour_1,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 title_1,
				 description_1
		 );

		 assertNotEquals("ff", appt_1.toString());

	 }

	@Test
	public void test03()  throws Throwable {
		int startHour = 23;
		int startMinute = 59;
		int startDay = 31;
		int startMonth = 11;
		int startYear = 2018;
		String title = null;
		String description = null;

		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description
		);

		appt.setStartHour(23);
		appt.setStartMinute(59);
		appt.setStartDay(31);
		appt.setStartMonth(11);
		appt.setStartYear(2018);
		appt.setTitle(null);
		appt.setDescription(null);

	}


	@Test
	public void test04()  throws Throwable {
		int startHour = 00;
		int startMinute = 59;
		int startDay = 323;
		int startMonth = 2;
		int startYear = 2018;
		String title = null;
		String description = null;

		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description
		);

		appt.setStartHour(00);
		appt.setStartMinute(59);
		appt.setStartDay(23);
		appt.setStartMonth(2);
		appt.setStartYear(2018);
		appt.setTitle(null);
		appt.setDescription(null);

	}


	@Test
	public void test05()  throws Throwable {
		int startHour = 24;
		int startMinute = 59;
		int startDay = 30;
		int startMonth = 12;
		int startYear = 2018;
		String title = null;
		String description = null;

		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description
		);

		appt.setStartHour(24);
		appt.setStartMinute(59);
		appt.setStartDay(30);
		appt.setStartMonth(12);
		appt.setStartYear(2018);
		appt.setTitle(null);
		appt.setDescription(null);

	}


	@Test
	public void test06()  throws Throwable {
		int startHour = 24;
		int startMinute = 59;
		int startDay = 00;
		int startMonth = 12;
		int startYear = 2018;
		String title = null;
		String description = null;
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description
		);

		appt.setStartHour(24);
		appt.setStartMinute(59);
		appt.setStartDay(00);
		appt.setStartMonth(12);
		appt.setStartYear(2018);
		appt.setTitle(null);
		appt.setDescription(null);
	}

	@Test
	public void test07()  throws Throwable {
		int startHour = 0;
		int startMinute = 59;
		int startDay = 00;
		int startMonth = 12;
		int startYear = 2018;
		String title = null;
		String description = null;
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description
		);

		appt.setStartHour(0);
		appt.setStartMinute(59);
		appt.setStartDay(12);
		appt.setStartMonth(1);
		appt.setStartYear(2018);
		appt.setTitle(null);
		appt.setDescription(null);

	}

	@Test
	public void test08()  throws Throwable {
		int startHour = 9;
		int startMinute = 12;
		int startDay = 2;
		int startMonth = 12;
		int startYear = 2018;
		String title = null;
		String description = null;
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description
		);

		appt.setStartHour(9);
		appt.setStartMinute(12);
		appt.setStartDay(2);
		appt.setStartMonth(12);
		appt.setStartYear(2018);
		appt.setTitle(null);
		appt.setDescription(null);

	}

	@Test
	public void test09()  throws Throwable {
		int startHour = 16;
		int startMinute = 65;
		int startDay = 2;
		int startMonth = 12;
		int startYear = 2018;
		String title = null;
		String description = null;
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description
		);

		appt.setStartHour(16);
		appt.setStartMinute(65);
		appt.setStartDay(2);
		appt.setStartMonth(12);
		appt.setStartYear(2018);
		appt.setTitle(null);
		appt.setDescription(null);

	}


//add more unit tests as you needed
	
}
