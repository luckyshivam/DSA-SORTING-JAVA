import java.util.*;   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class insertionsort {
    static void insertionsort(int[] array)
    {
        int i,j,temp;
        for(i=1;i<array.length;i++)
        {
            temp=array[i];
            j=i;
            while(j>0&&array[j -1]>temp)
            {
               array[j] =array[j-1];
               j=j-1;
               
            }
            array[j]=temp;
        }
}
  
    public static void main(String[]args){
      
      System.out.println("enter the number of arrays");
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println("enter the elements ");
      int[]array = new int[n];
      for(int i=0;i<n;i++){           //loop to store the elements in array
          array[i]=sc.nextInt();
          
          
      }
      System.out.println();
      
      insertionsort(array);
      System.out.println("the sorted elements are:");
       for(int i:array){
          System.out.println(i + " ");
  }
  
}
}

