//read two matrices from the console and perform matrix addition

import java.util.*;
class MatrixAdd
{
   public static void main(String args[])
   {
      int row,col,i,j;
      Scanner ob = new Scanner(System.in);

      System.out.println("Enter the no.of rows");
      row = ob.nextInt();
      System.out.println("Enter the no.of columns");
      col = ob.nextInt();

       int mat1[][] = new int[row][col];
       int mat2[][] = new int[row][col];
       int res[][] = new int[row][col];
        
        System.out.println("Enter the number of matrix1");
        for(i=0;i<row;i++)
        {
           for(j=0;j<col;j++)
           {
               mat1[i][j] = ob.nextInt();  
               System.out.print("\t");     
           }
             System.out.println();
        }

          System.out.println("Enter the number of matrix2");
        for(i=0;i<row;i++)
        {
           for(j=0;j<col;j++)
           {
               mat2[i][j] = ob.nextInt(); 
                System.out.print("\t");
           }
          System.out.println();
        }

         for(i=0;i<row;i++)
        {
           for(j=0;j<col;j++)
           {
               res[i][j] = mat1[i][j] + mat2[i][j];       
           }
        }

        System.out.println("Sum of matrices:");
        for(i=0;i<row;i++)
        {
           for(j=0;j<col;j++)
           {
               System.out.print(res[i][j]+"\t");   
           }
             System.out.println();
        }
   }
}

