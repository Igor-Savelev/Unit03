package by.ld.unit03.start;

//Íàïèøèòå êîíñîëüíîå ïðèëîæåíèå – êîíâåðòåð âàëþò. 

import java.util.Scanner;

public class Task01 {
	public static void main(String arg[]) {
		Scanner sca = new Scanner(System.in);
		
		System.out.print("Ââåäèòå ñóììó: ");
		double a = sca.nextDouble();
		
		Scanner scb = new Scanner(System.in);
		System.out.print("Ââåäèòå âàëþòó rub, eur èëè dollar: ");
		String b = scb.nextLine();
		
		String rub = "rub";
		String eur = "eur";
		String dollar = "dollar";
		
		double x=0;
		double y=0;
		
		if(b.equals(rub)) {
				x = a / 71.43;
				System.out.println("Ñóììà ïî êóðñó äîëëàðà = " + x);
				y= a / 80.60;
				System.out.println("Ñóììà ïî êóðñó åâðî = " + y);
			} else {
				if(b.equals(eur)) {
					x = a * 80.60;
					System.out.println("Ñóììà ïî êóðñó ðóáëÿ = " + x);
					
					y= a * 1.13;
					System.out.println("Ñóììà ïî êóðñó äîëëàðà = " + y);
				}	
			 else {
				if(b.equals(dollar)) {
			x = a / 1.13;
			System.out.println("Ñóììà ïî êóðñó åâðî = " + x);
			
			y= a * 71.43;
			System.out.println("Ñóììà ïî êóðñó ðóáëÿõ = " + y);
		
			} else {
		System.out.println("Îøèáêà ââîäà âàëþòû! Ïîæàëóéñòà ïåðåçàïóñòèòå êîíâåðòåð.");
	}	
}
}
	}
}
// задание модуля 3 зачтено
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
