package es.unileon.prg.date;

public class MainDate {

	public static void main(String[] args) {

		Date today;
		Date anotherDate;

		try {
			today = new Date(9, 11, 2017);
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
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}
