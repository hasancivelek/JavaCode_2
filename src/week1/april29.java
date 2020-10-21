package week1;

public class april29 {

	public static void main(String[] args) {
		
		
		
		// narrwing cassting
		double a=3.8;
		int a1=(int)a;
		System.out.println(a1);
		
		
		//widenig casting
		int b= 9;
		float b1 =b;
		
		System.out.println(b1);
		
		byte myByte =89;
		System.out.println("My Byte: " +(double)myByte);
		int num1, num2 , num33 ;
		num1 = 12;
		num2= 17;
		num33 =20;
		System.out.println(((double)num1+num2+num33)/3);
		
		System.out.println((double)(num1+num2+num33)/3);
		System.out.println((num1+num2+num33)/3d);
		System.out.println((num1+num2+num33)/3f);
		
		char mychar = '!';
		System.out.println((int)mychar);
		int myint = 244;
		System.out.println((char)myint);
		
		//Relation operators == , != , < , > , <= , >= ,
		 System.out.println("First Expression: "+(90==80));
		 boolean myBoolean9=(5!=5);
		 System.out.println("Second Expression: "+ myBoolean9);
		 System.out.println("Third Expression: "+(7>9));
		 System.out.println("Fourth Expression: "+(6<99));
		 System.out.println("FifthExpression: "+(90>=90));
		 System.out.println("Sixth Expression: "+(70<=90));
		 System.out.println("Seventh Expression: "+!(70<=90));
		 
		 boolean myBoolean1, myBoolean2, myBoolean3, myBoolean4, myBoolean5, myBoolean6, 
		 myBoolean7, myBoolean8;
		
		// && - If left side and right sides are true at the same time, 
		// the whole expression is going to be true, otherwise, it will be false
		myBoolean1 = true && false; // false
		myBoolean2 = true && true ; // true
		
		// || - If at least one of the sides are true, whole expression is true
		// otherwise, expression is false
		
		myBoolean3 = true || false ; // true
		myBoolean4 = false || false; // false
		
		myBoolean5 = myBoolean3 || myBoolean2;  // True
		myBoolean6 = myBoolean1 && myBoolean5; //  False
		
		myBoolean7 = (myBoolean5 && myBoolean2) || (myBoolean3 || myBoolean4 || myBoolean6); // True
		
		boolean username = true, password = false;
		
		System.out.println(username && password); // False
		
		// = , +=, -=, *=, /=, %/

				// = Example Assigning value to the variables with = sign
				num1 = 90;
				num2 = 100;

				// += Example , It assigns left side into left side + right side
				int num3 = 30;
				int num4 = 10;
				num3 += num4; // num3 = num3 + num4
				System.out.println("This is num 3 : " + num3); // 40

				// -= Example, It assigns left side into left side - right side
				int num5 = 42;
				int num6 = 98;
				num6 -= num5; // num6 = num6 - num5
				System.out.println(num6); // 56

				// *= Example, It assigns left side into left side times right side
				int num7 = 88;
				int num8 = 44;
				num7 *= num8;
				System.out.println(num7); // 3872

				// /= Example , It assigns left side into left side divided by right
				// side
				int num9 = 88;
				int num10 = 44;
				num9 /= num10;
				System.out.println(num9); // 2

				// %= Example , 
				int num11 = 88;
				int num12 = 46;
				num11 %= num12; // num11 = num11 % num12
				System.out.println(num11); // 42
		//Conditional Operators ?:
				int c1, c ;
				c1=10; c=10;
				c=!(c1==c)  ?   100  : 34;
				System.out.println(c);
		
		
		//System.out.println((1/2+3.5)*2.0);
				//double x =(int)(1.8*2.0);
				//System.out.println(x);
		
		
		
		
		
		
	}

}
