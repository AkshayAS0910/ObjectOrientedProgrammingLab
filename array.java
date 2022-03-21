import java.util.*;
class Array
{
   public static void main(String[] args)
   {
      int arr[]=new int[5],i;
      System.out.println("Enter the array elements:\n");
      Scanner ob=new Scanner(System.in);
      for(i=0;i<5;i++)
      {
         arr[i]=ob.nextInt();
      }

      System.out.println("Display the array elements:\n");
      for(i=0;i<5;i++)
      {
          System.out.println(arr[i]);
      }
   }
}