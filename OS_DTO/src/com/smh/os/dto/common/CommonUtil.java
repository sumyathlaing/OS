package com.smh.os.dto.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class CommonUtil {
	private static final Logger logger = Logger.getLogger(CommonUtil.class);

	public static Date stringToDate(String dateTime, String standardDateInputFormat) {
		SimpleDateFormat sdf = new SimpleDateFormat(standardDateInputFormat);
		Date retDate = new Date();
		try {
			retDate = sdf.parse(dateTime);
		} catch (ParseException e) {
			logger.error(e.getMessage(), e);
		}
		return retDate;
	}

	public static String dateToString(Date dateTime, String standardDateInputFormat) {
		SimpleDateFormat sdf = new SimpleDateFormat(standardDateInputFormat);
		String retDate = sdf.format(dateTime);
		return retDate;
	}
}
