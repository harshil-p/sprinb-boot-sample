package com.sample.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtil {

	public static String getFormattedDate() {
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		return simpleDateFormat.format(new Date());
	}
}
