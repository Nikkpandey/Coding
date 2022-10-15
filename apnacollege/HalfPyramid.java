package com.apnacollege;
import java.util.*;
public class HalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		int m=sc.nextInt();
		for(int q=m; q>=1; q--) {
			for(int p=1; p<=q; p++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
