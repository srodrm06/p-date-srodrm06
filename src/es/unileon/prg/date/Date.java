package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
		//TODO falta comprobar el dia
		this.day = day;
	}
	public Date(Date anotherDate){
		this.day=anotherDate.getDay();
		this.month=anotherDate.getMonth();
		this.year=anotherDate.getYear();
	}
	//get
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	//set
	public void setDay(int d){
		this.day=d;
	}
	public void setMonth(int m){
		this.month=m;
	}
	public void setYear(int y){
		this.year=y;
	}
	//isSameYear
	public boolean isSameYear(Date anotherDate){
		if(this.year==anotherDate.getYear()){
			return true;
		} else {
			return false;
		}
	}
	//isSameMonth
	public boolean isSameMonth(Date anotherDate){
		if(this.month==anotherDate.getMonth()){
			return true;
		} else {
			return false;
		}
	}
	//isSameDay
	public boolean isSameDay(Date anotherDate){
		if(this.day==anotherDate.getDay()){
			return true;
		} else {
			return false;
		}
	}
	//isSame
	public boolean isSame(Date anotherDate){
		if(this.day==anotherDate.getDay() && this.month==anotherDate.getMonth() && this.day==anotherDate.getDay()){
			return true;
		} else {
			return false;
		}
	}
	public boolean isSameY(Date anotherDate){
		return this.year==anotherDate.getYear();
	}
	public boolean isSameM(Date anotherDate){
		return this.month==anotherDate.getMonth();
	}
	public boolean isSameD(Date anotherDate){
		return this.day==anotherDate.getDay();
	}
	public boolean isSameFecha(Date anotherDate){
		return this.day==anotherDate.getDay() && this.month==anotherDate.getMonth() && this.day==anotherDate.getDay();
	}
	//TODO acabar nombreMes
	public String nombreMes(){
		String mes="";
		switch(this.month){
			case 1: 
				mes="Enero";
				break;
			case 2: 
				mes="Febrero";
				break;
			case 3: 
				mes="Marzo";
				break;
		}
		return mes;
	}
	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

}
