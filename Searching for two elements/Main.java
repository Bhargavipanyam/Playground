import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        arr[i]=sc.nextInt();
      }
      int search_elem_1=sc.nextInt();
      int search_elem_2=sc.nextInt();
      int elem_1_i = -1;
      int elem_2_i = -1;
      for(int i=0;i<arr_size;i++)
      {
      if(search_elem_1==arr[i])
      {
        elem_1_i=i;
      }
        if(search_elem_2==arr[i])
        {
          elem_2_i=i;
        }
      }
      System.out.println(elem_1_i);
      System.out.println(elem_2_i);
    }
}