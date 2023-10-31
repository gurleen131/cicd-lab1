package myproject;

public class MyCalculator {
	public int sum(int a, int b) 
	{
		return(a+b);
	}

	public int diff(int a, int b)
	{
			return(a-b);
	}	

	public static void main(String[] args) {
		MyCalculator cal = new MyCalculator();
		System.out.println("sum is : "+ cal.sum(200, 10));
		System.out.println("diff is : "+ cal.diff(250, 10));
		

				
		
		
	}

}
