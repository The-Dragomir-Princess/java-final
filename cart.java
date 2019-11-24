import java.util.Scanner;
//import java.io.Exception;

class supermarket
{
	static int objects_in_cart = 0;
	static int chocolates = 0;
	
	
	 	
	
	
	public void bread()
	{
		objects_in_cart +=1;
		System.out.println("Bread has been added to your cart\n");
	}
	
	public void butter()
	{
		objects_in_cart +=1;
		System.out.println("Butter has been added to your cart\n");
	}
	
	public void chocolate()
	{
		objects_in_cart +=1;
		chocolates+=1;
		System.out.println("Chocolate has been added to your cart\n");
	}
	
	public void vegetable()
	{
		objects_in_cart +=1;
		System.out.println("Vegetable has been added to your cart\n");
	}
	
	public int objects()
	{
		return objects_in_cart;
	}
	
	public int chocolates()
	{
		return chocolates;
	}
}


class cart
{
	public static void main(String args[])
	{
		int choice;
		supermarket s=new supermarket();
		
		do
		{
		System.out.println("Which item do you wish to add to your cart? \n 1)Bread  2)Butter  3)Chocolate  4)Vegetable  5)Shopping done");
		Scanner sc= new Scanner(System.in);
		choice=sc.nextInt();
		
			
			switch(choice)
			{
			
				case 1:
						
						s.bread();
						break;
				case 2:
						
						s.butter();
						break;
				case 3:
						
						s.chocolate();
						break;
				case 4:
						
						s.vegetable();
						break;
				case 5:
						System.out.println("Proceed to checkout");
						break;
						
				default:
						System.out.println("Sorry, this option is not available");
						break;
				
			}
		
		}while(choice!=5);
		
		int x=s.objects();
		if(x<5)
		{
			
			System.out.println("Items in cart must exceed 5");
			System.out.println("TooLessItems exception");
			
		}
		
		if(x>11)
		{
			System.out.println("Items in cart must be less than 11");
			System.out.println("TooMuchItems exception");
		}
		
		int y= s.chocolates();
		
		
		if(y>3)
		{
			System.out.println("chocolates in cart must be less than 3");
			System.out.println("TooMuchChcolates exception");
		}
		
		System.out.println("Thank you for shopping with us");
			
	}
}
		
		
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
   
  
  
   
	
