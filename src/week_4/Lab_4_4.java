package week_4;

public class Lab_4_4 {

	public static void main(String[] args) {
		
		//This program uses a loop to calculate the sum of the Elements in the array and prints it
		// calculate sum of even numbers
		// calculate sum of odd numbers

int[]nums={99,65,67,40,30,45,64,22,20,200};

int sum=0;
int sumOfEvens=0;
int sumOfOdds=0;
for (int i = 0; i < nums.length; i++) {
	sum=sum+nums[i];
	if (nums[i]%2==0) {
		sumOfEvens=sumOfEvens+nums[i];
		
	}
	else {
		sumOfOdds=sumOfOdds+nums[i];
	}
}

System.out.println("sum of the array : "+ sum);
System.out.println("sum of the evens : " +sumOfEvens);
System.out.println("sum of the odds : " + sumOfOdds);





	}

}
