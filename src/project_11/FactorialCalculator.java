package project_11;

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.print("Vnesete broj za koj sakate da go presmetate faktorijel");
    int number = scanner.nextInt();
    scanner.close();
    long factorial=1;
    if(number<0) {
    System.out.println("faktorijel ne e definisan za negativni broevi ");
    }else {
    for (int i = 1; i <=number; i++) {
    	factorial *=i;
    }
    System.out.println("faktoriski broj" + number + "je" + factorial);
    
    }
	}

}
