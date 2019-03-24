package es.unileon.prg.date;

public class MainDate {

	public static void main(String[] args) {

		Date today;
		Date anotherDate;

		try {
			today = new Date(9, 5, 2017);
			anotherDate=new Date(today);
			System.out.println("Fecha today "+today.toString());
			System.out.println("Fecha anotherDate "+anotherDate.toString());
			System.out.println(today.isSameYear(anotherDate));
			System.out.println(today.isSameMonth(anotherDate));
			System.out.println(today.isSameDay(anotherDate));
			System.out.println(today.isSame(anotherDate));
			System.out.println(today.isSameY(anotherDate));
			System.out.println(today.isSameM(anotherDate));
			System.out.println(today.isSameD(anotherDate));
			System.out.println(today.isSameFecha(anotherDate));
			System.out.println(today.nombreMes());
			System.out.println(today.isDayRigth());
			System.out.println(today.seasonOfMonth());
			System.out.println(today.monthsUntilEnd());
			System.out.println(today.allDates());
			System.out.println(today.sameDays());
			System.out.println(today.numberOfDays());
			System.out.println(today.numberAttemps());
			System.out.println(today.numberAttempsDo());
			System.out.println(today.dayOfWeek());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}
