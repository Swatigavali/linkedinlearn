
public class Swap {
	public static void swap(int num1,int num2) {
		
	int temp;
	temp =num1;
	num1=num2;
	num2=temp;
	System.out.println("Before swap num1:" + num1 + "num2 :" +num2);	 
	}
	
		
		
	
		
		
	
	private static void main(String args[]) {
		int number1 = 299;
		int number2 = 10;
		swap(number1,number2);
		System.out.println("After swap num1 and num2 :" + number1 + "number2 :" +number2);
	
	}

}
