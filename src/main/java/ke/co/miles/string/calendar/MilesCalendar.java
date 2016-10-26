package ke.co.miles.string.calendar;

import java.util.Calendar;

/**
 *
 * @author siech
 */
public class MilesCalendar {

    //<editor-fold defaultstate="collapsed" desc="Get month">
    public static int getMonth(String month) throws Exception {
        switch (month.toUpperCase()) {
            case "1":
            case "J":
            case "JA":
            case "JAN":
            case "JANU":
            case "JANUA":
            case "JANUAR":
            case "JANUARY":
                return Calendar.JANUARY;
            case "2":
            case "F":
            case "FE":
            case "FEB":
            case "FEBR":
            case "FEBRU":
            case "FEBRUA":
            case "FEBRUAR":
            case "FEBRUARY":
                return Calendar.FEBRUARY;
            case "3":
            case "M":
            case "MA":
            case "MAR":
            case "MARC":
            case "MARCH":
                return Calendar.MARCH;
            case "4":
            case "AP":
            case "APRIL":
                return Calendar.APRIL;
            case "5":
            case "MAY":
                return Calendar.MAY;
            case "6":
            case "JU":
            case "JUN":
            case "JUNE":
                return Calendar.JUNE;
            case "7":
            case "JUL":
            case "JULY":
                return Calendar.JULY;
            case "8":
            case "AU":
            case "AUG":
            case "AUGU":
            case "AUGUS":
            case "AUGUST":
                return Calendar.AUGUST;
            case "9":
            case "S":
            case "SE":
            case "SEP":
            case "SEPT":
            case "SEPTE":
            case "SEPTEM":
            case "SEPTEMB":
            case "SEPTEMBE":
            case "SEPTEMBER":
                return Calendar.SEPTEMBER;
            case "O":
            case "10":
            case "OC":
            case "OCT":
            case "OCTO":
            case "OCTOB":
            case "OCTOBE":
            case "OCTOBER":
                return Calendar.OCTOBER;
            case "N":
            case "11":
            case "NO":
            case "NOV":
            case "NOVE":
            case "NOVEM":
            case "NOVEMB":
            case "NOVEMBE":
            case "NOVEMBER":
                return Calendar.NOVEMBER;
            case "12":
            case "DE":
            case "DEC":
            case "DECE":
            case "DECEM":
            case "DECEMB":
            case "DECEMBE":
            case "DECEMBER":
                return Calendar.DECEMBER;
            default:
                throw new Exception("Unrecognised month");
        }
    }

}
