package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


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
		 Appt appt_1 = new Appt(10, 30, 8, 12, 2018,"title1", "description1");
		 appt_1.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 1, Appt.RECUR_NUMBER_FOREVER);
		 appts.add(appt_1);


		 Appt appt_2 = new Appt(12, 30, 8, 12, 2018,"title2", "description2");
		 appt_2.setRecurrence( recurDaysArr, Appt.RECUR_BY_YEARLY, 1, Appt.RECUR_NUMBER_FOREVER);
		 appts.add(appt_2);

		 Appt appt_3 = new Appt(12, 30, 9, 12, 2018,"title3", "description3");
		 appt_3.setRecurrence( recurDaysArr, Appt.RECUR_BY_MONTHLY, 1, Appt.RECUR_NUMBER_FOREVER);
		 appts.add(appt_3);

		 Appt appt_4 = new Appt(16, 30, 9, 12, 2018,"title4", "description4");
		 appt_4.setRecurrence( recurDaysArr, Appt.RECUR_BY_MONTHLY, 1, Appt.RECUR_NUMBER_FOREVER);
		 appts.add(appt_4);

	 	 TimeTable time_1 = new TimeTable();

		 cal = time_1.getApptRange(appts, day_2, day_1);

		 LinkedList<CalDay> cal_2 = new LinkedList<CalDay>();
		 cal_2 = time_1.getApptRange(appts, day_1, day_2);

		 LinkedList<CalDay> cal_3 = new LinkedList<CalDay>();
		 cal_3 = time_1.getApptRange(appts, day_2, day_3);

		 LinkedList<CalDay> cal_4 = new LinkedList<CalDay>();
		 cal_4 = time_1.getApptRange(appts, day_3, day_2);


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

		 Appt appt_11 = new Appt(11, 30, 18, 12, 2018,"title11", "description11");
		 appts_3.add(appt_11);

		 Appt appt_12 = new Appt(12, 30, 3, 12, 2018,"title12", "description12");
		 appts_3.add(appt_12);

		 Appt appt_13 = new Appt(13, 30, 9, 12, 2018,"title13", "description13");
		 appts_3.add(appt_13);

		 Appt appt_14 = new Appt(18, 30, 13, 12, 2018,"title14", "description14");
		 appts_3.add(appt_14);

		 Appt appt_15 = new Appt(18, 30, 23, 12, 2018,"title15", "description15");
		 appts_3.add(appt_15);

		 int[] a = {0, 1, 2, 3, 4};
		 //LinkedList<Appt> appts_4 = new LinkedList<Appt>();
		 LinkedList<CalDay> cal_5 = new LinkedList<CalDay>();

		 cal_5 = time_3.getApptRange(appts_3, day_2, day_1);
		 LinkedList<Appt>appts_4 = time_3.permute(appts_3, a);



	 }
	 @Test
	  public void test02()  throws Throwable  {
		 
	 }
//add more unit tests as you needed
}
