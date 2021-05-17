import java.util.*;

class Q13
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter width and height of rectangle");
	
		Double width = sc.nextDouble();
		Double height = sc.nextDouble();
		
		
		Double area= (width*height);
		System.out.println("area of rectangle = "+area );
		
		Double perimeter= 2*(width+height);
		System.out.println("Perimeter of rectangle = "+perimeter );
		
	}
	
}