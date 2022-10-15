package com.apnacollege;
import java.util.*;

public class ConditionIfElse {
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 
	 if(a==b) {
		 System.out.println("Equal");
	 }
	 else if(a>b){
		 System.out.println(a+" greater than "+b);
     }
	 else
		 System.out.println(b+" grearer than "+a);
	}

}
