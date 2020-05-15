package day98;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class dublicatedNumber {							// kullan�c�dan liste uzunlu�unu ve lementleri al�p
														// listede double olanlar� ve 2 den fazla kullan�lanlar� bulup listeler
	static List<Integer> userList = new ArrayList<Integer>();
	static int flag=0 ;
	static int num =0;
	static List<Integer> doubleList = new ArrayList<Integer>();
	static List<Integer> multipleList = new ArrayList<Integer>();
	static boolean control=false ;
	
	
	public static void main(String[] args) {				// kullan�c�dan listenin uzunlu�unu ve elementlerini alan blok
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int length= scan.nextInt();
		
	
		System.out.println("Enter the elements");
		
		for(int i=0 ; i<length ; i++) {
			userList.add(scan.nextInt());
		}
		System.out.println(userList);						// kullan�c�dan listenin uzunlu�unu ve elementlerini alan blok
		

		
		while(num<length) {									// while blo�u �nce dublicate methoduna yollar oradan bir say�n�n 
			dublicate(userList.get(num),length);			// ka� kez tekrar etti�ini tespit edip flag a y�kleyip d�ner
			if(flag==2) {
				control=true;
				addDouble(userList.get(num));
				if(control == true) {
					doubleList.add(userList.get(num));
				} 
			

			} else if (flag>2) {
				control=true;
				addMultiple(userList.get(num));
				if(control == true) {
					multipleList.add(userList.get(num));
				}
				
			} 
			
			num++;
		}													//	while blo�u												
		
		System.out.println("Double number in your list  : " + doubleList);
		System.out.println("Number used more than two  : " + multipleList);
	}															// main metot sonu
	
	public static int dublicate(int num2,int length2) {		// dublicate blo�u
		
		flag=0;
		for(int i=0 ; i<length2 ; i++) {
			if(userList.get(i) == userList.get(num)) {
				flag++;
			}
		}
		return(flag);
		
	
	}														// dublicate blo�u
	
	public static boolean addDouble (int num3) {			// addDouble... say�n�n double oldu�una karar verilince buraya gelir
															// say�n�n daha �nce doubleListte olup olmad���n� kontrol eder
		if (doubleList.contains(userList.get(num))) {
			control=false;
		}
		return(control);
	}														//// addDouble...
	
	public static boolean addMultiple (int num4) {
		if (multipleList.contains(userList.get(num))) {
			control=false;
		}
	
		return(control);
	}
	
}
