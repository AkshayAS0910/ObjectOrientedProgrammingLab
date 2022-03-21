import java.util.*;
class TwoDArray
{
   public static void main(String[] args)
   {
      int arr[][]=new int[5][5],i,j;
      System.out.println("Enter the array elements:\n");
      Scanner ob=new Scanner(System.in);
      for(i=0;i<2;i++)
      {
         for(j=0;j<3;j++)
         {
            arr[i][j]=ob.nextInt();
         } 
      }

      System.out.println("Display the array elements:\n");
       for(i=0;i<2;i++)
      {
         for(j=0;j<3;j++)
         {
            System.out.println(arr[i][j]);
         } 
      }
      
   }
}