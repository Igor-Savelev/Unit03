package by.ld.unit03.start;

//�������� ���������� ���������� � ��������� �����. 

import java.util.Scanner;

public class Task01 {
	public static void main(String arg[]) {
		Scanner sca = new Scanner(System.in);
		
		System.out.print("������� �����: ");
		double a = sca.nextDouble();
		
		Scanner scb = new Scanner(System.in);
		System.out.print("������� ������ rub, eur ��� dollar: ");
		String b = scb.nextLine();
		
		String rub = "rub";
		String eur = "eur";
		String dollar = "dollar";
		
		double x=0;
		double y=0;
		
		if(b.equals(rub)) {
				x = a / 71.43;
				System.out.println("����� �� ����� ������� = " + x);
				y= a / 80.60;
				System.out.println("����� �� ����� ���� = " + y);
			} else {
				if(b.equals(eur)) {
					x = a * 80.60;
					System.out.println("����� �� ����� ����� = " + x);
					
					y= a * 1.13;
					System.out.println("����� �� ����� ������� = " + y);
				}	
			 else {
				if(b.equals(dollar)) {
			x = a / 1.13;
			System.out.println("����� �� ����� ���� = " + x);
			
			y= a * 71.43;
			System.out.println("����� �� ����� ������ = " + y);
		
			} else {
		System.out.println("������ ����� ������! ���������� ������������� ���������.");
	}	
}
}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
