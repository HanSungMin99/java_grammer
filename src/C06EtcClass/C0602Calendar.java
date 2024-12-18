package C06EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C0602Calendar {
    public static void main(String[] args) {
//        //java.util 패키지의 Calendar 클래스
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getTime());
//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.MONTH));
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
//        System.out.println(calendar.get(Calendar.MINUTE));
//        System.out.println(calendar.get(Calendar.SECOND));

//        //java.time 패키지의 Local~ 클래스
//        //LocalDate: 날짜, LocalTime: 시간, LocalDateTime: 날짜와 시간
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        System.out.println(localDate.getYear());
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getDayOfWeek());
//        System.out.println(localDate.getDayOfMonth());

//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);
//        System.out.println(localTime.getHour());
//        System.out.println(localTime.getMinute());
//        System.out.println(localTime.getSecond());

//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//        System.out.println(localDateTime.getYear());
//        System.out.println(localDateTime.getHour());

//        //.of: 임의로 특정시간을 만들어 내고 싶을때
//        LocalDate birthDay = LocalDate.of(2000, 11, 12);
//        System.out.println(birthDay.getYear());
//        System.out.println(birthDay.getMonth());
//        System.out.println(birthDay.getDayOfMonth());

        LocalDateTime birthDayTime = LocalDateTime.of(2000,11,12, 13,15,20);
        System.out.println(birthDayTime.get(ChronoField.YEAR));
        System.out.println(birthDayTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(birthDayTime.get(ChronoField.DAY_OF_YEAR));
        System.out.println(birthDayTime.get(ChronoField.DAY_OF_WEEK));

        //0: 오전 1:오후
        System.out.println(birthDayTime.get(ChronoField.AMPM_OF_DAY));
    }
}
