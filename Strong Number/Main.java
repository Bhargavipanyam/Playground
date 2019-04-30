import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
     Scanner sc=new Scanner(System.in);
      int input = sc.nextInt();
      int sum = 0;
     int temp = input;
    while(input > 0)
        {
      int mod = input % 10;
      sum=sum + fact (mod);
      input  = input /10;
         }
        if(temp == sum)
         System.out.println("Yes");
     else
         System.out.println("No");
         }
    public static int fact(int num)
    {
        int fact=1;
    
        for(int i = 1; i <= num; i++)
        {
            fact *= i;
        }
        return fact;
	}
}