import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int res=greatest(n1,n2);
      System.out.println(greatest(res,n3));
	}
  public static int greatest(int m,int n)
  {
    int k=0;
    if(m>n)
      k=m;
    else
      k=n;
  return k;
  }
}