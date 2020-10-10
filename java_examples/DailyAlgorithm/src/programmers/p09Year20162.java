package programmers;

import java.util.Calendar;
import java.util.Locale;

public class p09Year20162 {

	public static void main(String[] args) {

		System.out.println((solution(5, 24)));

	}

	public static String solution(int month, int day) {
		Calendar cal = new Calendar.Builder().setCalendarType("iso8601").setDate(2016, month - 1, day).build();
		return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
	}
}

/* api 
 * Calendar.Builder() : Calendar.Builder 생성자 
 * setCalendarType("iso8601") : 그레고리안 달력 - 우리가 사용하고 있는 달력 
 * setDate(2016, month - 1, day) : 2016년의 월, 일에 맞는 달력을 만들어줌 
 * build() : setter method 를 통해 만들어진 달력을 반환해준다. Returns a Calendar built from the parameters set by the setter methods.
 * 
 * Calendar.getDisplayName() : Returns the string representation of the calendar field value in the given style and locale. 
 * locale : 지역/날짜/시간 등을 해당 국가에 맞게 선택
 * */
