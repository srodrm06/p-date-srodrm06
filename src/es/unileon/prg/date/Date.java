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
	//isSameYear con if
	public boolean isSameYear(Date anotherDate){
		if(this.year==anotherDate.getYear()){
			return true;
		} else {
			return false;
		}
	}
	//isSameMonth con if
	public boolean isSameMonth(Date anotherDate){
		if(this.month==anotherDate.getMonth()){
			return true;
		} else {
			return false;
		}
	}
	//isSameDay con if
	public boolean isSameDay(Date anotherDate){
		if(this.day==anotherDate.getDay()){
			return true;
		} else {
			return false;
		}
	}
	//isSame con if
	public boolean isSame(Date anotherDate){
		if(this.day==anotherDate.getDay() && this.month==anotherDate.getMonth() && this.day==anotherDate.getDay()){
			return true;
		} else {
			return false;
		}
	}
	//isSameYear sin if
	public boolean isSameY(Date anotherDate){
		return this.year==anotherDate.getYear();
	}
	//isSameMonth sin if
	public boolean isSameM(Date anotherDate){
		return this.month==anotherDate.getMonth();
	}
	//isSameDay sin if
	public boolean isSameD(Date anotherDate){
		return this.day==anotherDate.getDay();
	}
	//isSame sin if
	public boolean isSameFecha(Date anotherDate){
		return this.day==anotherDate.getDay() && this.month==anotherDate.getMonth() && this.day==anotherDate.getDay();
	}
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
			case 4:
				mes="Abril";
				break;
			case 5:
				mes="Mayo";
				break;
			case 6:
				mes="Junio";
				break;
			case 7:
				mes="Julio";
				break;
			case 8:
				mes="Agosto";
				break;
			case 9:
				mes="Septiembre";
				break;
			case 10:
				mes="Octubre";
				break;
			case 11:
				mes="Noviembre";
				break;
			case 12:
				mes="Diciembre";
				break;
		}
		return mes;
	}
	public boolean isDayRigth(){
		boolean rigth;
		rigth=false;
		switch(this.month){
			case 1: //next
			case 3: //next
			case 5: //next
			case 7: //next
			case 8: //next
			case 10: //next
			case 12:
				if(this.day>=1 && this.day<=31){
					rigth=true;
				}
				break;
			case 4: //next
			case 6: //next
			case 9: //next
			case 11: 
				if(this.day>=1 && this.day<=30){
					rigth=true;
				}
				break;
			case 2:
				if(this.day>=1 && this.day<=28){
					rigth=true;
				}
				break;
		}
		return rigth;
	}
	public String seasonOfMonth(){
		String season="";
		switch(this.month){
			case 1: //next
			case 2: //next
			case 12: 
				season="Invierno";
				break;
			case 3: //next
			case 4: //next
			case 5:
				season="Primavera";
				break;
			case 6: //next
			case 7: //next
			case 8:
				season="Verano";
				break;
			case 9: //next
			case 10: //next
			case 11:
				season="Otoño";
				break;
		}
		return season;
	}
	public String monthsUntilEnd(){
		StringBuilder mes = new StringBuilder();
		int i;
		Date aux = new Date(this);
		for(i=(this.month)+1;i<=12;i++){
			aux.setMonth(i);
			mes.append(aux.nombreMes() + " ");
		}
	return mes.toString();
	}
	public int daysOfMonth(){
		int dias=0;
		switch(this.month){
			case 1: //next
			case 3: //next
			case 5: //next
			case 7: //next
			case 8: //next
			case 10: //next
			case 12:
				dias=31;
				break;
			case 4: //next
			case 6: //next
			case 9: //next
			case 11: 
				dias=30;
				break;
			case 2:
				dias=28;
				break;
		}
	return dias;
	}
	public String allDates(){
		StringBuilder fechas = new StringBuilder();
		int i;
		for(i=this.day;i<=daysOfMonth();i++){
			fechas.append(i + "/" + this.month + "/" + this.year + " " );
		}
		return fechas.toString();
	}
	public String sameDays(){
		StringBuilder meses = new StringBuilder();
		int i;
		Date aux = new Date (this);
		for(i=1;i<=12;i++){
			aux.setMonth(i);
			if(aux.daysOfMonth()==this.daysOfMonth()){
				meses.append(aux.nombreMes() + " ");
			}
		}
		return meses.toString();
	}
	public int numberOfDays(){
		int i,suma,dias;
		suma=0;
		for(i=1;i<=getMonth()-1;i++){
			if(i==2){
				dias=28;
				suma=suma+dias;
			} else if(i==4 || i==6 || i==9 || i==11) {
				dias=30;
				suma=suma+dias;
			} else {
				dias=31;
				suma=suma+dias;
			} 
		}
		suma=suma+getDay()-1;
		return suma;
	}
	public int numberAttemps(){
		int dia,mes,i;
		i=0;
		dia=0;
		mes=0;
		while(dia!=getDay() && mes!=getMonth()){
			dia=(int)(Math.random()*31)+1;
			mes=(int)(Math.random()*12)+1;
			i++;
		}
		return i;
	}
	public int numberAttempsDo(){
		int dia,mes,i;
		i=0;
		dia=0;
		mes=0;
		do{
			dia=(int)(Math.random()*31)+1;
			mes=(int)(Math.random()*12)+1;
			i++;
		} while(dia!=getDay() && mes!=getMonth());
		return i;
	}
	public String dayOfWeek(){
		String dia="";
		switch((numberOfDays()+1)%7){
			case 1:
				dia="Lunes";
				break;
			case 2:
				dia="Martes";
				break;
			case 3:
				dia="Miércoles";
				break;
			case 4:
				dia="Jueves";
				break;
			case 5:
				dia="Viernes";
				break;
			case 6:
				dia="Sábado";
				break;
			case 7:
				dia="Domingo";
				break;
		}
		return dia.toString();
	}
	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

}
