package com.wipro.eb.main;

import java.util.Scanner;

import com.wipro.eb.service.ConnectionService;

public class EBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int pr=sc.nextInt();
		int cr=sc.nextInt();
		String ct=sc.next();
		ConnectionService cs=new ConnectionService();
		System.out.println(cs.generateBill(pr,cr,ct));
		
		

	}

}
