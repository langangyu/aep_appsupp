/*
 * $Id: DateUtil.java,v 1.8 2013/04/30 12:19:43 asharobi Exp $
 * 
 * @version  $Revision: 1.8 $
 * 
 * Copyright (c) 2008 by CGI Group Corp.
 */
package aenvsrd.util;

// JDK packages
import java.util.*;
import java.sql.Timestamp;
import java.text.*;

/**
 * Utility methods regarding dates.
 * 
 * @author $Author: asharobi $
 */
public class DateUtil {
	
	public static final String RCS = "$Header: /lfs/weja/src/eds/src/aenvsrd/util/DateUtil.java,v 1.8 2013/04/30 12:19:43 asharobi Exp $";
	 static boolean initHolidays=false;
	 public final static String DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd";
	 public final static String OLD_DATE_FORMAT_YYYY_MM_DD = "yyyy/MM/dd";
	 public final static String TIME_FORMAT_HH_MM_SS = "HH:mm:ss";
	 public static final String DATE_AND_TIME_STAMP_FORMAT = "yyyy-MM-dd HH-mm-ss";
	 public static final String DATE_AND_TIME_STAMP_MILLI_FORMAT = "yyyy-MM-dd HH-mm-ss-SSS";
	 
	 public static void init() {
	     
	 }
	/**
	 * Called to return if the current date
	 *
	 * @return   the current date.
	 */
	public static Date getCurrentDate() {
		return Calendar.getInstance().getTime();
	}

	
	/**
	 * Create a Date object for the given year, month and day values.
	 *
	 * @param year   The year
	 * @param month  The month (January = 1)
	 * @param day    The Day
	 * @return	Date
	 */
	public static Date getDate(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(year, month - 1, day);
	    return cal.getTime();
	}
	
	
	/**
	 * Adds a relative amount to a date.
	 *
	 * @param amount  number of days
	 * @return        The new date will days added on.
	 */
	public static Date dateAdd(int amount) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(getCurrentDate());
		cal.add(Calendar.DATE, amount);

		return cal.getTime();
	}
	
	
	/**
	 * Adds a relative amount to a date.
	 *
	 * @param amount  number of days
	 * @param field   the type of addition
	 * @return        The new date will days added on.
	 */
	public static Date dateAdd(int amount, int field) {
		Calendar cal = Calendar.getInstance();
	    cal.setTime(getCurrentDate());
	    cal.add(field, amount);

	    return cal.getTime();
	}


	  /**
	   * Adds a relative amount to a given date.
	   *
	   * @param amount     number to add
	   * @param field      the type of addition i.e. Calendar.YEAR, Calendar.MONTH, Calendar.Day, etc
	   * @param givenDate  The initial date
	   * @return           The new date
	   */
	public static Date dateAdd(int amount, int field, Date givenDate) {
		if (givenDate == null) {
			return null;
		} else {    
			Calendar cal = Calendar.getInstance();
			cal.setTime(givenDate);
			cal.add(field, amount);
			return cal.getTime();
		}
	}	
	
	/**
	 * Format the current date in the default format yyyy-MM-dd
	 * @return
	 */
	public static String formatDate() {
		Date date = new Date();
		return formatDate(date, DATE_FORMAT_YYYY_MM_DD);
	}
	
	/**
	 * Format a date in the default format yyyy-MM-dd
	 * @param date	A Date object that is to be formatted.
	 * @return
	 */
	public static String formatDate(Date date) {
		return formatDate(date, DATE_FORMAT_YYYY_MM_DD);
	}
	
	/**
	 * Format a timestamp in the default format yyyy-MM-dd
	 * @param timestamp	A Timestamp object that is to be formatted.
	 * @return
	 */
	public static String formatDate(Timestamp timestamp) {
		Date date = new Date(timestamp.getTime());
		return formatDate(date);
	}
	
	/**
	 * A general formatter for dates. 
	 *
	 * @param date    A Date object that is to be formatted.
	 * @param format  A String representing the format.
	 * @return
	 */
	public static String formatDate(Date date, String format) {    
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		formatter.setLenient(false);
		return formatter.format(date);
	}
	
	/**
	 * A general formatter for Timestamps
	 * @param timestamp The Timestamp object that is to be formatted
	 * @param format 	A String representing the format.
	 * @return
	 */
	public static String formatDate(Timestamp timestamp, String format) {
		Date date = new Date(timestamp.getTime());
		return formatDate(date, format);
	}
	
	/**
	 * Format the current time in the default date and time format 
	 * yyyy-MM-dd HH-mm-ss
	 * @return
	 */
	public static String getDateAndTimeStamp() {
		Date date = new Date();
		return formatDate(date, DATE_AND_TIME_STAMP_FORMAT);
	}
	
	/**
	 * Format the date in the default date and time format 
	 * yyyy-MM-dd HH-mm-ss
	 * @param date the date to override
	 * @return
	 */
	public static String getDateAndTimeStamp(Date date) {
		return formatDate(date, DATE_AND_TIME_STAMP_FORMAT);
	}
	
	/**
	 * Format the timestamp in the default date and time format 
	 * yyyy-MM-dd HH-mm-ss
	 * @param timestamp the timestamp to override
	 * @return
	 */
	public static String getDateAndTimeStamp(Timestamp timestamp) {
		Date date = new Date(timestamp.getTime());
		return formatDate(date, DATE_AND_TIME_STAMP_FORMAT);
	}

	/**
	 * A general formatter for dates. 
	 *
	 * @param source  A String representation of a date.
	 * @param format  A String representing the format.
	 * @return
	 */
	public static Date parseDate(String source, String format) throws ParseException {
		if (source.length() != format.length()) { 
			throw new ParseException("Input string wrong length.", 0);
		} else {
			SimpleDateFormat formatter = new SimpleDateFormat(format);
			formatter.setLenient(false);
			ParsePosition pos = new ParsePosition(0);
			Date date = formatter.parse(source, pos);
			if ((date == null) || (pos.getErrorIndex() != -1)) {
				throw new ParseException("Incorrect date format.", pos.getIndex());
			} else if (pos.getIndex() != format.length()) {
				throw new ParseException("Did not use entire string to parse date!", pos.getIndex());
			} else {
				return date;
			}		
		}	
	}
	
	
	/**
	 * Given a Date object, return a Date object that represents the last day
	 * of the month for the given date.
	 * 
	 * @param givenDate
	 * @return	Date
	 */
	public static Date getLastDayOfMonthForDate(Date givenDate) {
		if (givenDate == null) {
			return null;
		} else {
			Calendar cal = Calendar.getInstance();
			cal.setTime(givenDate);
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DATE, 1);
			cal.add(Calendar.DATE, -1);
			return cal.getTime();
		}
	}
	
	
	/**
	 * Convert a java.util.Date object to a java.sql.Date object.
	 * 
	 * @param utilDate	The java.util.Date object
	 * @return	java.sql.Date
	 */
	public static java.sql.Date toSqlDate(Date utilDate) {
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());		
		return sqlDate;
	}
	
	/**
	 * Convert a java.sql.Date object to a java.util.Date object.
	 * 
	 * @param sqlDate	The java.sql.Date object
	 * @return	java.util.Date
	 */
	public static java.util.Date toUtilDate(Date sqlDate) {
		java.util.Date utilDate = new java.util.Date(sqlDate.getTime());		
		return utilDate;
	}	
	
	public static Date removeTime(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }
}