import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int s=n*n;
    return s;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      System.out.println(square(a));
	} 
}