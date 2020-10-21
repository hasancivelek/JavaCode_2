package week_4;

public class Lab_4_2 {

	public static void main(String[] args) {
		//create a double array called prices
		//assign 10 different prices
		//using a loop count how many items that is more than $20
		//print the count
		//if no price was found that is more than $20 then print
		//"No items that costs more than $20"

double [] prices = {30,99,88,29,11,10,43,54,2,5};
int count=0;
for (int i = 0; i < prices.length; i++) {
	if (prices[i]>20) {
		count++;
	}
	}
System.out.println(prices.length-count);//elements less than 20
if (count>0) {
	System.out.println(count + " number of items is greater than 20 ");
	}
else {
	System.out.println("there is no items greater than 20");
}


	}

}
