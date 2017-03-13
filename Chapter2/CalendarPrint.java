package com.java.calendar;

import java.util.Calendar;

public class CalendarPrint {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.setFirstDayOfWeek(Calendar.SUNDAY);
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
	}

}
