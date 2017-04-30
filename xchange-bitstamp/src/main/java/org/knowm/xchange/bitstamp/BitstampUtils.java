package org.knowm.xchange.bitstamp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.knowm.xchange.exceptions.ExchangeException;

/**
 * A central place for shared Bitstamp properties
 */
public final class BitstampUtils {

  private static final SimpleDateFormat DATE_FORMAT = buildDateFormatWithTimeZone(TimeZone.getTimeZone("GMT"));

  /**
   * private Constructor
   */
  private BitstampUtils() {

  }

  /**
   * Format a date String for Bitstamp
   *
   * @param dateString
   * @return
   */
  public static Date parseDate(String dateString) {

    try {
      return DATE_FORMAT.parse(dateString);
    } catch (ParseException e) {
      throw new ExchangeException("Illegal date/time format", e);
    }
  }

  private static SimpleDateFormat buildDateFormatWithTimeZone(TimeZone timeZone){
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    format.setTimeZone(timeZone);
    return format;
  }
}
