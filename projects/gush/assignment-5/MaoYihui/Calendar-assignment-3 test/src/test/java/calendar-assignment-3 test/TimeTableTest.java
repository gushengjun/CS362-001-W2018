package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.*;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	@Test
	public void test01()  throws Throwable  {

		GregorianCalendar day_1 = new GregorianCalendar(2018, 12, 9);
		GregorianCalendar day_2 = new GregorianCalendar(2018, 12, 8);
		GregorianCalendar day_3 = new GregorianCalendar(2020, 12, 1);

		LinkedList<CalDay> cal = new LinkedList<CalDay>();
		LinkedList<Appt> appts = new LinkedList<Appt>();

		//cal.add(new CalDay(day_1));
		//cal.add(new CalDay(day_2));
		//cal.add(new CalDay(day_3));

		int[] recurDaysArr={2,3,4};
		Appt appt_1 = new Appt(10, 30, 8, 11, 2018,"title1", "description1");
		appt_1.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 1, Appt.RECUR_NUMBER_FOREVER);
		appts.add(appt_1);


		Appt appt_2 = new Appt(12, 30, 8, 11, 2018,"title2", "description2");
		appt_2.setRecurrence( recurDaysArr, Appt.RECUR_BY_YEARLY, 1, Appt.RECUR_NUMBER_FOREVER);
		appts.add(appt_2);

		Appt appt_3 = new Appt(12, 30, 9, 11, 2018,"title3", "description3");
		appt_3.setRecurrence( recurDaysArr, Appt.RECUR_BY_MONTHLY, 1, Appt.RECUR_NUMBER_FOREVER);
		appts.add(appt_3);

		Appt appt_4 = new Appt(16, 30, 9, 11, 2018,"title4", "description4");
		appt_4.setRecurrence( recurDaysArr, Appt.RECUR_BY_MONTHLY, 1, Appt.RECUR_NUMBER_FOREVER);
		appts.add(appt_4);

		TimeTable time_1 = new TimeTable();

		cal = time_1.getApptRange(appts, day_2, day_1);
		assertNotEquals(null, cal);

		LinkedList<CalDay> cal_2 = new LinkedList<CalDay>();
		cal_2 = time_1.getApptRange(appts, day_1, day_2);
		assertNotEquals(null, cal_2);

		LinkedList<CalDay> cal_3 = new LinkedList<CalDay>();
		cal_3 = time_1.getApptRange(appts, day_2, day_3);
		assertNotEquals(null, cal_3);

		LinkedList<CalDay> cal_4 = new LinkedList<CalDay>();
		cal_4 = time_1.getApptRange(appts, day_3, day_2);
		assertNotEquals(null, cal_4);



		Appt appt_5 = new Appt(12, 11, 15, 5, 2018,"title5", "description5");
		appt_5.setRecurrence( recurDaysArr, Appt.RECUR_BY_MONTHLY, 1, Appt.RECUR_NUMBER_FOREVER);
		appts.add(appt_5);

		LinkedList<Appt> appts_test = new LinkedList<Appt>();

		appts_test = time_1.deleteAppt(appts, appt_1);
		appts_test = time_1.deleteAppt(appts, appt_1);
		appts_test = time_1.deleteAppt(appts, appt_2);
		appts_test = time_1.deleteAppt(appts, appt_3);
		appts_test = time_1.deleteAppt(appts, appt_4);
		appts_test = time_1.deleteAppt(appts, appt_5);


/*
		 LinkedList<Appt> appts_2 = new LinkedList<Appt>();
		 TimeTable time_2 = new TimeTable();
		 Appt appt_6 = new Appt(16, 30, 9, 12, 2018,"title4", "description4");
		 appts_2.add(appt_6);
		 Appt appt_7 = new Appt(16, 30, 3, 12, 2018,"title4", "description4");
		 appts_2.add(appt_7);
		 LinkedList<Appt> appts_test2 = new LinkedList<Appt>();
		 appts_test2 = time_2.deleteAppt(appts_2, appt_6);
		 appts_test2 = time_2.deleteAppt(appts_2, appt_7);
		 appts_test2 = time_2.deleteAppt(appts_2, appt_7);
		 appts_test2 = time_2.deleteAppt(appts_2, appt_7);
*/


		LinkedList<Appt> appts_3 = new LinkedList<Appt>();
		TimeTable time_3 = new TimeTable();

		Appt appt_11 = new Appt(11, 30, 18, 11, 2018,"title11", "description11");
		appts_3.add(appt_11);

		Appt appt_12 = new Appt(12, 30, 3, 11, 2018,"title12", "description12");
		appts_3.add(appt_12);

		Appt appt_13 = new Appt(13, 30, 9, 11, 2018,"title13", "description13");
		appts_3.add(appt_13);

		Appt appt_14 = new Appt(18, 30, 13, 11, 2018,"title14", "description14");
		appts_3.add(appt_14);

		Appt appt_15 = new Appt(18, 30, 23, 11, 2018,"title15", "description15");
		appts_3.add(appt_15);

		int[] a = {0, 1, 2, 3, 4};
		//LinkedList<Appt> appts_4 = new LinkedList<Appt>();
		LinkedList<CalDay> cal_5 = new LinkedList<CalDay>();

		cal_5 = time_3.getApptRange(appts_3, day_2, day_1);
		assertNotEquals(null, cal_5);
		LinkedList<Appt>appts_4 = time_3.permute(appts_3, a);

		Appt appt_16 = new Appt(18, 30, 27, 2, 2018,"title16", "description16");
		appts_3.add(appt_16);
		LinkedList<CalDay> cal_6 = new LinkedList<CalDay>();
		assertEquals(true, appt_16.getValid());
		cal_6 = time_3.getApptRange(appts_3, day_2, day_1);
		assertNotEquals(null,cal_6);


		LinkedList<Appt> appts_new_1 = new LinkedList<Appt>();
		LinkedList<CalDay> cal_new_1 = new LinkedList<CalDay>();
		cal_new_1 = time_1.getApptRange(appts_new_1, day_2, day_1);
		assertNotEquals(null, cal_new_1);


	}
	@Test
	public void test02()  throws Throwable  {

		GregorianCalendar day_1 = new GregorianCalendar(2018, 12, 14);
		GregorianCalendar day_2 = new GregorianCalendar(2018, 12, 8);
		GregorianCalendar day_3 = new GregorianCalendar(2020, 12, 1);


		LinkedList<CalDay> cal = new LinkedList<CalDay>();
		LinkedList<Appt> appts = new LinkedList<Appt>();

		int[] recurDaysArr={-1 ,0, 2, 3, 4};
		Appt appt_1 = new Appt(10, 30, 8, 11, 2018,"title1", "description1");
		appt_1.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 1, Appt.RECUR_NUMBER_NEVER);
		appts.add(appt_1);
		assertEquals(0, appt_1.getRecurNumber());

		Appt appt_2 = new Appt(12, 30, 9, 11, 2018,"title2", "description2");
		appt_2.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 1, Appt.RECUR_BY_WEEKLY);
		appts.add(appt_1);
		assertEquals(1, appt_2.getRecurNumber());

		Appt appt_3 = new Appt(5, 30, 8, 11, 2018,"title3", "description3");
		appt_3.setRecurrence( recurDaysArr, Appt.RECUR_BY_MONTHLY, 1, Appt.RECUR_BY_MONTHLY);
		appts.add(appt_3);
		assertEquals(2, appt_3.getRecurNumber());

		Appt appt_4 = new Appt(16, 30, 9, 11, 2018,"title4", "description4");
		appt_4.setRecurrence( recurDaysArr, Appt.RECUR_BY_MONTHLY, 1, Appt.RECUR_NUMBER_FOREVER);
		appts.add(appt_4);
		assertEquals(1000, appt_4.getRecurNumber());


		TimeTable time_1 = new TimeTable();

		cal = time_1.getApptRange(appts, day_2, day_1);
		assertNotEquals(null, cal);

		LinkedList<CalDay> cal_2 = new LinkedList<CalDay>();
		cal_2 = time_1.getApptRange(appts, day_1, day_2);
		assertNotEquals(null, cal_2);

		LinkedList<CalDay> cal_3 = new LinkedList<CalDay>();
		cal_3 = time_1.getApptRange(appts, day_2, day_3);
		assertNotEquals(null, cal_3);

		LinkedList<CalDay> cal_4 = new LinkedList<CalDay>();
		cal_4 = time_1.getApptRange(appts, day_3, day_2);
		assertNotEquals(null, cal_4);

		LinkedList<CalDay> cal_5 = new LinkedList<CalDay>();
		cal_5 = time_1.getApptRange(appts, day_3, day_1);
		assertNotEquals(null, cal_5);

		LinkedList<CalDay> cal_6 = new LinkedList<CalDay>();
		cal_6 = time_1.getApptRange(appts, day_1, day_3);
		assertNotEquals(null, cal_6);

		LinkedList<CalDay> cal_7 = new LinkedList<CalDay>();
		cal_7 = time_1.getApptRange(appts, day_1, day_1);
		assertNotEquals(null, cal_7);

		LinkedList<Appt> appts_2 = new LinkedList<Appt>();

		assertNotEquals("", time_1.deleteAppt(appts, appt_1));


		LinkedList<Appt> appts_1 = new LinkedList<Appt>();
		assertEquals(null, time_1.deleteAppt(appts_1, appt_1));

		Appt appt_5 = new Appt(16, 30, 9, 11, 2018,"title4", "description4");
		appt_4.setRecurrence( recurDaysArr, Appt.RECUR_BY_MONTHLY, 1, Appt.RECUR_NUMBER_FOREVER);



		assertEquals(null, time_1.deleteAppt(appts, appt_5));
		assertEquals(null, time_1.deleteAppt(appts, appt_5));
//		 assertEquals("[null, null, null]", time_1.deleteAppt(appts, appt_2));
//		 assertEquals(null, time_1.deleteAppt(appts, appt_2));
//delete
		LinkedList<Appt> appts_4 = new LinkedList<Appt>();
		appts_4.add(appt_5);
		assertEquals(null, time_1.deleteAppt(appts_4, appt_5));
		assertEquals(null, time_1.deleteAppt(appts_4, appt_5));
		assertEquals(null, time_1.deleteAppt(appts_4, appt_1));


		LinkedList<Appt> appts_3 = new LinkedList<Appt>();
		appts_3.add(appt_5);
		appts_3.add(appt_1);
		assertEquals(null, time_1.deleteAppt(appts_3, appt_2));
		assertEquals(null, time_1.deleteAppt(appts_3, appt_5));
		assertEquals(null, time_1.deleteAppt(appts_3, appt_1));
		assertEquals(null, time_1.deleteAppt(appts_3, appt_3));

		assertEquals(null, time_1.deleteAppt(appts_3, appt_1));
		assertEquals(null, time_1.deleteAppt(appts_3, appt_5));
		assertEquals(null, time_1.deleteAppt(appts_3, appt_1));

		time_1.deleteAppt(appts_3, appts_3.get(1));
		time_1.deleteAppt(appts_3, appts_3.get(0));
		time_1.deleteAppt(appts_3,appts_3.get(0));

		assertEquals(2,appts_3.size());

//mute
		LinkedList<Appt> appts_5 = new LinkedList<Appt>();
		appts_5.add(appt_1);
		appts_5.add(appt_2);
		appts_5.add(appt_3);

		int[] a_new_1 ={2, 1, 0};
		assertEquals(3,appts_5.size());
//		 assertNotEquals(null,time_1.permute(appts_5, a_6));
		assertNotEquals(null, time_1.permute(appts_5, a_new_1));

		LinkedList<Appt> appts_6 = new LinkedList<Appt>();
		int[] a_new_2 ={0};
		appts_6.add(appt_1);
		assertNotEquals(null, time_1.permute(appts_6, a_new_2));

//		 time_1.permute(appts_5, a_4);
//		 time_1.permute(appts_5, a_3);
//		 time_1.permute(appts_5, a_2);
//		 time_1.permute(appts_5, a_1);
// 		 time_1.permute(appts_5, a_0);



	}

	@Test
	public void test03()  throws Throwable  {


		int k =1;

		GregorianCalendar day_1 = new GregorianCalendar(2018, 1, k);
		GregorianCalendar day_2 = new GregorianCalendar(2019, 1, 2);
		GregorianCalendar day_3 = new GregorianCalendar(2020, 12, 1);





		for(int l = 0; l< 365; l ++) {

			k++;

			LinkedList<CalDay> cal = new LinkedList<CalDay>();
			LinkedList<Appt> appts = new LinkedList<Appt>();


			Random rand = new Random();

			int n = rand.nextInt(1000) + 1;
			int rd = rand.nextInt(31) + 1;

			int[] recurDaysArr = {-1, 0, 2, 3, 4};
			Appt appt_1 = new Appt(10, 30, rd, 11, 2018, "title1", "description1");
			appt_1.setRecurrence(recurDaysArr, Appt.RECUR_BY_WEEKLY, 1, n);
			appts.add(appt_1);
			assertNotEquals(null, appt_1.getRecurNumber());

			Appt appt_2 = new Appt(12, 30, rd, 11, 2018, "title2", "description2");
			appt_2.setRecurrence(recurDaysArr, Appt.RECUR_BY_WEEKLY, 1, n);
			appts.add(appt_1);
			assertNotEquals(null, appt_2.getRecurNumber());

			Appt appt_3 = new Appt(5, 30, rd, 11, 2018, "title3", "description3");
			appt_3.setRecurrence(recurDaysArr, 3, 1, n);
			appts.add(appt_3);
			assertNotEquals(null, appt_3.getRecurNumber());

			Appt appt_4 = new Appt(16, 32, rd, 11, 2018, "title4", "description4");
			appt_4.setRecurrence(recurDaysArr, Appt.RECUR_BY_MONTHLY, 1, n);
			appts.add(appt_4);
			assertNotEquals(null, appt_4.getRecurNumber());

			Appt appt_55 = new Appt(19, 33, rd, 1, 2018, "title4", "description4");
			appt_55.setRecurrence(recurDaysArr, 2, 1, n);
			appts.add(appt_55);
			assertNotEquals(null, appt_55.getRecurNumber());

			Appt appt_6 = new Appt(6, 30, rd, 3, 2018, "title4", "description4");
			appt_6.setRecurrence(recurDaysArr, 1, 1, n);
			appts.add(appt_6);
			assertNotEquals(null, appt_6.getRecurNumber());

			Appt appt_7 = new Appt(4, 16, rd, 4, 2018, "title4", "description4");
			appt_7.setRecurrence(recurDaysArr, 1, 1, n);
			appts.add(appt_7);
			assertNotEquals(null, appt_7.getRecurNumber());

			Appt appt_8 = new Appt(17, 30, rd, 8, 2018, "title4", "description4");
			appt_8.setRecurrence(recurDaysArr, 1, 1, n);
			appts.add(appt_8);
			assertNotEquals(null, appt_8.getRecurNumber());







			TimeTable time_1 = new TimeTable();

			cal = time_1.getApptRange(appts, day_2, day_1);
			assertNotEquals(null, cal);

			LinkedList<CalDay> cal_2 = new LinkedList<CalDay>();
			cal_2 = time_1.getApptRange(appts, day_1, day_2);
			assertNotEquals(null, cal_2);

			LinkedList<CalDay> cal_3 = new LinkedList<CalDay>();
			cal_3 = time_1.getApptRange(appts, day_2, day_3);
			assertNotEquals(null, cal_3);

			LinkedList<CalDay> cal_4 = new LinkedList<CalDay>();
			cal_4 = time_1.getApptRange(appts, day_3, day_2);
			assertNotEquals(null, cal_4);

			LinkedList<CalDay> cal_5 = new LinkedList<CalDay>();
			cal_5 = time_1.getApptRange(appts, day_3, day_1);
			assertNotEquals(null, cal_5);

			LinkedList<CalDay> cal_6 = new LinkedList<CalDay>();
			cal_6 = time_1.getApptRange(appts, day_1, day_3);
			assertNotEquals(null, cal_6);

			LinkedList<CalDay> cal_7 = new LinkedList<CalDay>();
			cal_7 = time_1.getApptRange(appts, day_1, day_1);
			assertNotEquals(null, cal_7);

			LinkedList<Appt> appts_2 = new LinkedList<Appt>();

			assertNotEquals("", time_1.deleteAppt(appts, appt_1));


			LinkedList<Appt> appts_1 = new LinkedList<Appt>();
			assertEquals(null, time_1.deleteAppt(appts_1, appt_1));

			Appt appt_5 = new Appt(16, 30, 9, 11, 2018, "title4", "description4");
			appt_4.setRecurrence(recurDaysArr, Appt.RECUR_BY_MONTHLY, 1, Appt.RECUR_NUMBER_FOREVER);


			assertEquals(null, time_1.deleteAppt(appts, appt_5));
			assertEquals(null, time_1.deleteAppt(appts, appt_5));
//		 assertEquals("[null, null, null]", time_1.deleteAppt(appts, appt_2));
//		 assertEquals(null, time_1.deleteAppt(appts, appt_2));
//delete
			LinkedList<Appt> appts_4 = new LinkedList<Appt>();
			appts_4.add(appt_5);
			assertEquals(null, time_1.deleteAppt(appts_4, appt_5));
			assertEquals(null, time_1.deleteAppt(appts_4, appt_5));
			assertEquals(null, time_1.deleteAppt(appts_4, appt_1));


			LinkedList<Appt> appts_3 = new LinkedList<Appt>();
			appts_3.add(appt_5);
			appts_3.add(appt_1);
			assertEquals(null, time_1.deleteAppt(appts_3, appt_2));
			assertEquals(null, time_1.deleteAppt(appts_3, appt_5));
			assertEquals(null, time_1.deleteAppt(appts_3, appt_1));
			assertEquals(null, time_1.deleteAppt(appts_3, appt_3));

			assertEquals(null, time_1.deleteAppt(appts_3, appt_1));
			assertEquals(null, time_1.deleteAppt(appts_3, appt_5));
			assertEquals(null, time_1.deleteAppt(appts_3, appt_1));

			time_1.deleteAppt(appts_3, appts_3.get(1));
			time_1.deleteAppt(appts_3, appts_3.get(0));
			time_1.deleteAppt(appts_3, appts_3.get(0));

			assertEquals(2, appts_3.size());

		}



	}




//add more unit tests as you needed
}
