import java.util.*;

class Q11
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius of Circle");
	
		Double r = sc.nextDouble();
		
		
		Double area= (Math.PI*r*r);
		System.out.println("area of circle = "+area );
		
		Double perimeter= (Math.PI*2*r);
		System.out.println("Perimeter of circle = "+perimeter );
		
	}
	
}