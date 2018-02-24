package calendar;

import org.junit.Test;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	Random random = new Random();
	private static final long TestTimeout = 60 * 500 * 1;

	long startTime = Calendar.getInstance().getTimeInMillis();
	long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {

		 for (int i= 0; i < 200; i++) {


		 //	 int [] recurDayArr = new int[n];
		 //	 int []

		 //	 for(int ii=0; i<recurDayArr.length; i++){
		//	 }

			 int [] recurDayArr ={2,3,4};
			 int [] n_range = {1, 2, 3, 0, 1000};

			 int day_1 = ValuesGenerator.getRandomIntBetween(random, -1, 32);
			 int month_1 = ValuesGenerator.getRandomIntBetween(random, 1, 12);
			 int year_1 = ValuesGenerator.getRandomIntBetween(random, 2000, 2019);

			 int day_2 = ValuesGenerator.getRandomIntBetween(random, -1, 32);
			 int month_2 = ValuesGenerator.getRandomIntBetween(random, 1, 12);
			 int year_2 = ValuesGenerator.getRandomIntBetween(random, 2000, 2019);

			 int day_3 = ValuesGenerator.getRandomIntBetween(random, -1, 32);
			 int month_3 = ValuesGenerator.getRandomIntBetween(random, 1, 12);
			 int year_3 = ValuesGenerator.getRandomIntBetween(random, 2000, 2019);

			 LinkedList<CalDay> cal = new LinkedList<CalDay>();
			 LinkedList<Appt> appts = new LinkedList<Appt>();

			 GregorianCalendar dayy_1 = new GregorianCalendar(year_1, month_1, day_1) ;
			 GregorianCalendar dayy_2 = new GregorianCalendar(year_2, month_2, day_2) ;
			 GregorianCalendar dayy_3 = new GregorianCalendar(year_3, month_3, day_3) ;

			 TimeTable time_1 = new TimeTable();

			 for(int j = 0; j <100; j++){
				 int n =  ValuesGenerator.getRandomIntBetween(random, 0, 4);
				 int startHour=ValuesGenerator.getRandomIntBetween(random, -1, 25);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, -1, 61);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, -1, 31);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 12);
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
				 appt_1.setRecurrence(recurDayArr,n_range[n], ValuesGenerator.getRandomIntBetween(random, 0, 31), n_range[n] );
				 time_1.deleteAppt(appts,appt_1);
				 appts.add(appt_1);
			 }

			 time_1.getApptRange(appts, dayy_2, dayy_1);
			 LinkedList<CalDay> cal_2 = new LinkedList<CalDay>();
			 cal_2 = time_1.getApptRange(appts, dayy_1, dayy_2);

			 LinkedList<CalDay> cal_3 = new LinkedList<CalDay>();
			 cal_3 = time_1.getApptRange(appts, dayy_2, dayy_3);

			 LinkedList<CalDay> cal_4 = new LinkedList<CalDay>();
			 cal_4 = time_1.getApptRange(appts, dayy_3, dayy_2);

			 for(int k = 0; k < 100000; k++){
				 int n =  ValuesGenerator.getRandomIntBetween(random, 0, 4);
				 int startHour=ValuesGenerator.getRandomIntBetween(random, -1, 25);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, -1, 61);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, -1, 31);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 int startYear=ValuesGenerator.getRandomIntBetween(random, 2000, 2019);
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 Appt appt_3 = new Appt(startHour,
						 startMinute ,
						 startDay ,
						 startMonth ,
						 startYear ,
						 title,
						 description);
				 appt_3.setRecurrence(recurDayArr,n_range[n], ValuesGenerator.getRandomIntBetween(random, 0, 31), n_range[n] );
				 time_1.deleteAppt(appts,appt_3);

				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				 if((k%10000)==0 && k!=0 )
					 System.out.println("elapsed time: "+ elapsed + " of "+100000);

			  }

		 TimeTable time_2 = new TimeTable();
			 LinkedList<Appt> appts_2 = new LinkedList<Appt>();
/*
			 LinkedList<CalDay> cal_11 = new LinkedList<CalDay>();
			 cal_11 = time_2.getApptRange(appts_2, day_2, day_1);

			 LinkedList<CalDay> cal_22 = new LinkedList<CalDay>();
			 cal_2 = time_2.getApptRange(appts, day_1, day_2);

			 LinkedList<CalDay> cal_33 = new LinkedList<CalDay>();
			 cal_33 = time_2.getApptRange(appts, day_2, day_3);

			 LinkedList<CalDay> cal_44 = new LinkedList<CalDay>();
			 cal_44 = time_2.getApptRange(appts, day_3, day_2);

*/


			 int n1 =  ValuesGenerator.getRandomIntBetween(random, 0, 4);
			 int startHour1=ValuesGenerator.getRandomIntBetween(random, -1, 25);
			 int startMinute1=ValuesGenerator.getRandomIntBetween(random, -1, 61);
			 int startDay1=ValuesGenerator.getRandomIntBetween(random, -1, 31);
			 int startMonth1=ValuesGenerator.getRandomIntBetween(random, 1, 12);
			 int startYear1=ValuesGenerator.getRandomIntBetween(random, 2000, 2019);
			 String title="Birthday Party";
			 String description="This is my birthday party.";
			 Appt appt_7 = new Appt(startHour1,
					 startMinute1 ,
					 startDay1 ,
					 startMonth1 ,
					 startYear1 ,
					 title,
					 description);
			 appt_7.setRecurrence(recurDayArr,n_range[n1], ValuesGenerator.getRandomIntBetween(random, 0, 31), n_range[n1] );
			 appts_2.add(appt_7);


/*
			 TimeTable time_2 = new TimeTable();
			 LinkedList<Appt> appts_2 = new LinkedList<Appt>();

			 LinkedList<CalDay> cal_11 = new LinkedList<CalDay>();
			 cal_11 = time_2.getApptRange(appts_2, day_2, day_1);

			 LinkedList<CalDay> cal_22 = new LinkedList<CalDay>();
			 cal_2 = time_2.getApptRange(appts, day_1, day_2);

			 LinkedList<CalDay> cal_33 = new LinkedList<CalDay>();
			 cal_33 = time_2.getApptRange(appts, day_2, day_3);

			 LinkedList<CalDay> cal_44 = new LinkedList<CalDay>();
			 cal_44 = time_2.getApptRange(appts, day_3, day_2);

			*/


			 time_2.deleteAppt(appts_2, appt_7);
			 time_2.deleteAppt(appts_2, appt_7);





			 for(int jj = 0; jj <100; jj++){
				 int n =  ValuesGenerator.getRandomIntBetween(random, 0, 4);
				 int startHour=ValuesGenerator.getRandomIntBetween(random, -1, 25);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, -1, 61);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, -1, 31);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 int startYear=ValuesGenerator.getRandomIntBetween(random, 2000, 2019);
				 title="Birthday Party";
				 description="This is my birthday party.";
				 Appt appt_4 = new Appt(startHour,
						 startMinute ,
						 startDay ,
						 startMonth ,
						 startYear ,
						 title,
						 description);
				 appt_4.setRecurrence(recurDayArr,n_range[n], ValuesGenerator.getRandomIntBetween(random, 0, 31), n_range[n] );
				 appts_2.add(appt_4);
				 time_2.deleteAppt(appts_2, appt_4);
				 time_2.deleteAppt(appts_2, appt_4);
			 }




		 }



	 }



	@Test
	public void radnomtest2()  throws Throwable  {

		for (int i= 0; i < 200; i++) {


			//	 int [] recurDayArr = new int[n];
			//	 int []

			//	 for(int ii=0; i<recurDayArr.length; i++){
			//	 }

			int[] recurDayArr = {2, 3, 4};
			int[] n_range = {1, 2, 3, 0, 1000};

			int day_1 = ValuesGenerator.getRandomIntBetween(random, -1, 32);
			int month_1 = ValuesGenerator.getRandomIntBetween(random, 1, 12);
			int year_1 = ValuesGenerator.getRandomIntBetween(random, 2000, 2019);

			int day_2 = ValuesGenerator.getRandomIntBetween(random, -1, 32);
			int month_2 = ValuesGenerator.getRandomIntBetween(random, 1, 12);
			int year_2 = ValuesGenerator.getRandomIntBetween(random, 2000, 2019);

			int day_3 = ValuesGenerator.getRandomIntBetween(random, -1, 32);
			int month_3 = ValuesGenerator.getRandomIntBetween(random, 1, 12);
			int year_3 = ValuesGenerator.getRandomIntBetween(random, 2000, 2019);

			LinkedList<CalDay> cal = new LinkedList<CalDay>();
			LinkedList<Appt> appts = new LinkedList<Appt>();

			GregorianCalendar dayy_1 = new GregorianCalendar(year_1, month_1, day_1);
			GregorianCalendar dayy_2 = new GregorianCalendar(year_2, month_2, day_2);
			GregorianCalendar dayy_3 = new GregorianCalendar(year_3, month_3, day_3);

			TimeTable time_1 = new TimeTable();

			for (int j = 0; j < 100; j++) {
				int n = ValuesGenerator.getRandomIntBetween(random, 0, 4);
				int startHour = ValuesGenerator.getRandomIntBetween(random, -1, 25);
				int startMinute = ValuesGenerator.getRandomIntBetween(random, -1, 61);
				int startDay = ValuesGenerator.getRandomIntBetween(random, -1, 31);
				int startMonth = ValuesGenerator.getRandomIntBetween(random, 1, 12);
				int startYear = ValuesGenerator.getRandomIntBetween(random, 2000, 2019);
				String title = "Birthday Party";
				String description = "This is my birthday party.";
				Appt appt_1 = new Appt(startHour,
						startMinute,
						startDay,
						startMonth,
						startYear,
						title,
						description);
				appt_1.setRecurrence(recurDayArr, n_range[n], ValuesGenerator.getRandomIntBetween(random, 0, 31), n_range[n]);
				appts.add(appt_1);
				time_1.deleteAppt(appts, appts.get(0));
				appts.add(appt_1);

			}

			time_1.deleteAppt(appts, appts.get(5));


			int nn = ValuesGenerator.getRandomIntBetween(random, 0, 4);
			int startHour22 = ValuesGenerator.getRandomIntBetween(random, -1, 25);
			int startMinute22 = ValuesGenerator.getRandomIntBetween(random, -1, 61);
			int startDay22 = ValuesGenerator.getRandomIntBetween(random, -1, 31);
			int startMonth22 = ValuesGenerator.getRandomIntBetween(random, 1, 12);
			int startYear22 = ValuesGenerator.getRandomIntBetween(random, 2000, 2019);
			String title = "Birthday Party";
			String description = "This is my birthday party.";
			Appt appt_12 = new Appt(startHour22,
					startMinute22,
					startDay22,
					startMonth22,
					startYear22,
					title,
					description);
			appt_12.setRecurrence(recurDayArr, n_range[nn], ValuesGenerator.getRandomIntBetween(random, 0, 31), n_range[nn]);



			TimeTable time_222 = new TimeTable();

			LinkedList<Appt> appts_111 = new LinkedList<Appt>();

			time_222.deleteAppt(null, appt_12);
			appts_111.add(appt_12);
			time_222.deleteAppt(appts_111, null);




		}
	}




	
}
