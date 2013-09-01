/**
 * Item5: Avoid creating unnecessary objects.
 * 		- An object can always be reused if it is immutable (item15).
 * 		- Save object as constants to avoid creating repeatedly.
 */

package com.efjava.item5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ObjectCache {
	private static final Date BOOM_START;
	private static final Date BOOM_END;
	static {
		Calendar gmtCal =
				Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_START = gmtCal.getTime();
		gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_END = gmtCal.getTime();
	}
}
