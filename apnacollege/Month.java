package com.apnacollege;
import java.util.*;
public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int button=sc.nextInt();
		
		switch(button) {
		
		case 1:System.out.println("January");
		break;
		
		case 2:System.out.println("February");
		break;
		
		case 3:System.out.println("March");
		break;
		
		case 4:System.out.println("April");
		break;
		
		case 5:System.out.println("May");
		break;
		
		default:System.out.println("Invalid button");
		}

	}

}
