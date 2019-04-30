import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int res=gcd(n1,n2);
      System.out.println(gcd(res,n3));
	}
 public static int gcd(int num1,int num2)
 {
   int min_element;
	    if(num1 < num2)
	    {
	        min_element = num1;
	    }
	    else{
	        min_element = num2;
	    }
	    while(min_element >= 1)
	    {
	        if((num1 % min_element == 0) &&(num2 % min_element == 0))
	        {
	            return min_element;
	        }
	        --min_element;
	    }
	    return 0;
 }
}