package by.ld.unit03.start;

//Напишите консольное приложение – конвертер валют. 

import java.util.Scanner;

public class Task01 {
	public static void main(String arg[]) {
		Scanner sca = new Scanner(System.in);
		
		System.out.print("Введите сумму: ");
		double a = sca.nextDouble();
		
		Scanner scb = new Scanner(System.in);
		System.out.print("Введите валюту rub, eur или dollar: ");
		String b = scb.nextLine();
		
		String rub = "rub";
		String eur = "eur";
		String dollar = "dollar";
		
		double x=0;
		double y=0;
		
		if(b.equals(rub)) {
				x = a / 71.43;
				System.out.println("Сумма по курсу доллара = " + x);
				y= a / 80.60;
				System.out.println("Сумма по курсу евро = " + y);
			} else {
				if(b.equals(eur)) {
					x = a * 80.60;
					System.out.println("Сумма по курсу рубля = " + x);
					
					y= a * 1.13;
					System.out.println("Сумма по курсу доллара = " + y);
				}	
			 else {
				if(b.equals(dollar)) {
			x = a / 1.13;
			System.out.println("Сумма по курсу евро = " + x);
			
			y= a * 71.43;
			System.out.println("Сумма по курсу рублях = " + y);
		
			} else {
		System.out.println("Ошибка ввода валюты! Пожалуйста перезапустите конвертер.");
	}	
}
}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
