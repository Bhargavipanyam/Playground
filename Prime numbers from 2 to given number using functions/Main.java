import java.util.Scanner;
class Main{
  public static boolean prime(int m)
  {
    boolean isprime = true;
	    for(int num = 2; num <= m/2; num++)
	    {
	        if(m % num == 0)
	        {
	            isprime = false;
	            break;
	        }
	    } 
    return isprime;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
       for(int i = 2; i <= n; i++)
	    {
	        if(prime(i))
	        {
	            System.out.println(i);
	        }
	    }
	}
}