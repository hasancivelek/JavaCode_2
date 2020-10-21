package week1;

import Week6_1.Computer;

//import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
	/*	
Scanner myObj = new Scanner(System.in);
System.out.println("Enter the Number");
int x1 =myObj.nextInt();
System.out.println("Enter the Number");
int x2= myObj.nextInt();
System.out.println("Multiplication of Two Numbers= "+(x1*x2));
int packet=4000;
	int dept = 500; // taxes %8
	int left =packet-=(dept*0.08+dept);
	System.out.println(left);
	
	System.out.println(20+10+ "Javatpoint");
	System.out.println("Javatpoint"+20+10);
	*/
		/*
		int num=40;
		int num1=17;
		num+=num1;
		int num3 = 60;
		int num4 = 23;
		num3-=num4;
		int num5 =4;
		int num6 = 3;
		num5*=num6;
		int num7= 44;
		int num8 = 3;
		num7%=num8;
		int num9=49;
		int num10=5;
	    num9/=num10;
		System.out.println(num);
		System.out.println(num3);
		System.out.println(num5);
		System.out.println(num7);
		System.out.println(num9);
	*/
		int second= 50000;
		int p1= second%60;
		int p2=second/60;
		int p3= p2%60;
		p2=p2%60;
		System.out.print(p2+":"+p3+":"+p1);
		System.out.print("\n");
		//int minute = 80;
		//int second1=minute*=60;
		//System.out.println(second1);
		
		
		
		Computer object1=new Computer();
		object1.setBrand("Apple");
		object1.setPrice(1000);
		System.out.println(object1.getBrand());
		System.out.println(object1.getPrice());
		
	
	}
	
	
	
	

}
