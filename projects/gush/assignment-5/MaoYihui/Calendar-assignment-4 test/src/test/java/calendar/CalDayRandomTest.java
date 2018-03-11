package calendar;


import org.junit.Test;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {

	Random random = new Random();
	private static final long TestTimeout = 60 * 500 * 1;
    /**
     * Generate Random Tests that tests CalDay Class.
     */

	 @Test
	  public void radnomtest()  throws Throwable  {

		 for (int i= 0; i < TestTimeout; i++) {
			 int day_1 = ValuesGenerator.getRandomIntBetween(random, 1, 27);
			 int month_1 = ValuesGenerator.getRandomIntBetween(random, 1, 11);
			 int year_1 = ValuesGenerator.getRandomIntBetween(random, 2000, 2019);

			 GregorianCalendar day = new GregorianCalendar(year_1, month_1, day_1) ;

			 CalDay cal = new CalDay(day);

			for(int j = 0; j <100; j++){

				int startHour=ValuesGenerator.getRandomIntBetween(random, 1, 23);
				int startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 59);
				int startDay=ValuesGenerator.getRandomIntBetween(random, 1, 27);
				int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				int startYear=ValuesGenerator.getRandomIntBetween(random, 2000, 2019);
				String title="Birthday Party";
				String description="This is my birthday party.";
				Appt appt_1 = new Appt(startHour,
						startMinute ,
						startDay ,
						startMonth ,
						startYear ,
						title,
						description);

				cal.addAppt(appt_1);
			}

			 cal.toString();
		 }

	 }


	
}
