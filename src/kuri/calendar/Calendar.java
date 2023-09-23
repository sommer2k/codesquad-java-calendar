package kuri.calendar;

import java.util.Scanner;

public class Calendar {

	private final int[] MAX_DAYS = { 1, 22, 33, 44, 55, 66, 77 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {
		System.out.println("Hello kuri");
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		System.out.println("달을 입력하세요");
		int month = sc.nextInt();
		System.out.printf("%d월의 일수는 %d입니다.", month, cal.getMaxDaysOfMonth(month));

	}

}
