class Sp5
{
	public static void main(String args[])
	{ 
		System.out.println("Assignment 2 : Star Pattern 5 ");
	 
		for(int i=1;i<=5;i++)
		{
		 	
			for(int j=5;j>i;j--)
			{
			System.out.print(" ");
			}
			
			for(int k=1;k<=(i*2-1);k++)
			{
			System.out.print("*");
			}
			
			
			System.out.println(); 
		}
	}
}	