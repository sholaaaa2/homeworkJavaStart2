package com.gmail.kukaruka52;

public class Main {

	public static void main(String[] args) {
		double a = 4;
		double b = 5;
		double c = 3;
		
		double p = (a+b+c)/2;
		double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("S = "+s);
	}
}
