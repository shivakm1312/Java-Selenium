package week1.day1;

public class AssigFibonocciSeries {
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		int nextnum;
		int length = 11;
		
		for (int i =0; i<length; i++)
		{
		System.out.print(num1+" ");
		nextnum = num1+num2;
		num1 = num2;
		num2 = nextnum;
		
	}

}
	
}
