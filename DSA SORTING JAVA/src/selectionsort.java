
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class selectionsort {
  static void selectionsort(int[]array){ 
    int i,j,min;
    for(i=0;i<array.length-1;i++)
    {
        min=i;
        for(j=i+1;j<array.length;j++)
        {
            if(array[j]<array[min])
            {
                min=j;   //lowest index
            }
        }
            
              //swap
              int temp=array[min];
              array[min]=array[i];
              array[i]=temp;
              
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
      
      selectionsort(array);
      System.out.println("the sorted elements are:");
       for(int i:array){
          System.out.println(i + " ");
  }
  
}
}