import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
      int total = 0;
        //scanner.close();
        int number = num;

        for( ;number!=0;number /= 10)
        {
            int temp = number % 10;
            total = total + temp*temp*temp;
        }

        if(total == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
	}
}