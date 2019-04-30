import java.util.Scanner;
class Main{
  public static int power(int b,int e)
  {
    int p = 1;
	    while(e >= 1)
	    {
	        p = p * b;
	        e--;
	    }
    return p;
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    System.out.println(power(n,m));
  }
}