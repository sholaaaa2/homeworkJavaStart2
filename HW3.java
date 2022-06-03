package com.gmail.kukaruka52;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius");
		double r = sc.nextDouble();
		
		double l = 2*Math.PI*r;
		
		System.out.println("L = "+l);
	}
}
