package com.nevil;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.Scanner;

public class OlaBooking {
	public static void main(String[] args) {
		System.out.println("welcome to Cab  Booking Services");
		System.out.println("Login to Continue");
		Login();
		CabTypes();
	}

	public static void Login() {
		System.out.println("Enter the 10 Digit  Mobile Number");
		Scanner sc = new Scanner(System.in);
		Long Mobileno = sc.nextLong();
		// Converting the Long to String to Compare
		String MoNO = String.valueOf(Mobileno);
		if (MoNO.length() == 10) {
		} else {
			System.out.println("The Number Enterded is Invalid ");
		}
		System.out.println("Enter The Password");
		// getting the password from the user
		Scanner ps = new Scanner(System.in);
		String Password = ps.next();
		// Verifying the Password Entered
		if (Password.equals("password")) {
		} else {
			System.out.println("The Password Miss  Match");

		}

	}

	public static void CabTypes() {
		// Usimg Array Intializing the List Of Cabs Available
		String cabType3 = "Prime";
		String[] cabType = new String[3];
		cabType[0] = "Micro 5Rs/Km";
		cabType[1] = "mini 10Rs/km";
		cabType[2] = "Prime 15Rs/km";

		System.out.println("Cab Types " + Arrays.toString(cabType));
		System.out.println("No Of Cab Types: " + cabType.length);
		for (int i = 0; i < cabType.length; i++) {
			String cType = cabType[i];
			System.out.println(cType);
		}
		System.out.println("Select the Choise:");
		Scanner input = new Scanner(System.in);
		String CabType = input.nextLine();
		switch (CabType) {
		case "1":
			System.out.println("The Selected cab is: " + cabType[0]);
			micro();
			break;
		case "2":
			System.out.println("The Selected cab is: " + cabType[1]);
			mini();
			break;
		case "3":
			System.out.println("The Selected cab is: " + cabType[2]);
			Prime();
			break;
		default:
			System.out.println("Invalid Choise");
		}

	}

	public static void micro() {
		System.out.println("Enter the Distance to Travel In Kilometers :");
		Scanner minikm = new Scanner(System.in);
		int km = minikm.nextInt();
		int Total1 = km * 5;
		System.out.println("The Price Wihout Gst" + Total1);
		double Total = (Total1 * 0.07) + Total1;
		System.out.println("The Price for the micro For " + km + " km Is " + Total + "Rs");
		Juorney(km, Total);
	}

	public static void mini() {
		System.out.println("Enter the Distance to Travel In Kilometers :");
		Scanner minikm = new Scanner(System.in);
		int km = minikm.nextInt();
		int Total1 = km * 10;
		System.out.println("The Price Wihout Gst" + Total1);
		double Total = (Total1 * 0.07) + Total1;
		System.out.println("The Price for the mini For " + km + " km Is " + Total + "Rs");
		Juorney(km, Total);
	}

	public static void Prime() {
		System.out.println("Enter the Distance to Travel In Kilometers :");
		Scanner minikm = new Scanner(System.in);
		int km = minikm.nextInt();
		int Total1 = km * 15;
		System.out.println("The Price Wihout Gst" + Total1);
		double Total = (Total1 * 0.07) + Total1;
		System.out.println("The Price for the Prime For " + km + " km Is " + Total + "Rs");
		Juorney(km, Total);
	}

	public static void Juorney(int km, double Total) { 
		System.out.println("Enter the Juorney Date in DD-MM-YYY: ");
		Scanner ip = new Scanner(System.in);
		String dojstr = ip.next();
		LocalDate dojObject = LocalDate.parse(dojstr);
		LocalDate dodobject = LocalDate.now();
		System.out.println("Enter the Juorney Time in HH-MM-SS: ");
		Scanner Time = new Scanner(System.in);
		String dotstr =Time.next();
		LocalTime dotObject =LocalTime.parse(dotstr);
		int hour =dotObject.getHour();
		if(dojObject.isBefore( dojObject)) {
			System.out.println("The Date Is Old Date ");
		}
		if(hour >=17 && hour <= 19) {
			double peakprice =(km*0.025) +Total;
			System.out.println("Its Peak Hour the Revised Price is "+peakprice);
			System.out.println("Your Journey booked for :"+dojstr +dotstr+ "Is Confirmed");
		}
		else {
			System.out.println("Your Journey booked for :"+dojstr +dotstr+ "Is Confirmed");
			
		}		
		sctzn( Total );
			
		}
		
	
	
	public static void sctzn(double Total) {
		System.out.println("Enter Your DOB: ");
		Scanner db = new Scanner(System.in);
		String dbstr = db.next();
		LocalDate dbObject = LocalDate.parse(dbstr);
		int Personyear = dbObject.getYear();
		LocalDate cdate = LocalDate.now();
		int cdateyear = cdate.getYear();
		int ageresult = cdateyear - Personyear;
		if (ageresult >= 70) {
			double discountPrice = (Total * 50) / 100;
			System.out.println("Your are Eligible For Seniour Citzen Benifits your Discounted Price :" + discountPrice);
		} else {
			System.out.println("Your Are Not Seniour Citizen Your Price is " + Total);

		}
		

	}
		
	}