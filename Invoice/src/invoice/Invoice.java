package invoice;

import java.util.Scanner;
//import java.util.Arrays;

public class Invoice {
    
    public static void main(String[] args) 
    { Scanner input = new Scanner(System.in);
      System.out.print("How many items do you have? ");
      int num = input.nextInt();
     
      //declare lists and vars
      String[] item = new String[num];
      int[] quantity = new int[num];
      float[] price = new float[num];
      float[] total = new float[num];
      float sum = 0;
      
      //honestly wouldn't this work better with while loop 
      //    keep entering until user has no more items
      //    create count or use while true? -- can't use lists then? 
      
      // add user values to lists 
      for (int i = 0; i < num; i++)
      {   System.out.print("Enter item #" + (i+1) + " name: ");
          item[i] = input.next();
          System.out.print("Enter item #" + (i+1) + " quantity: ");
          quantity[i] = input.nextInt();
          System.out.print("Enter item #" + (i+1) + " price: ");
          price[i] = input.nextFloat();
          total[i] = quantity[i] * price[i]; 
          sum += total[i];
      }
      input.close();
      System.out.println("\nBelow is your invoice: \n");
     
      //print headers (only want to do this once)
      System.out.printf("%24s\n","Invoice");
      System.out.println("========================================");
      System.out.printf("%-10s%-12s%-10s","item", "quantity", "price");
      System.out.println("total");
      System.out.println("----------------------------------------");
      
      //print values using lists and for loop
      for (int i = 0; i < num; i++)
          System.out.printf("%-10s%-12s$%-10.2f$%.2f\n", item[i],quantity[i],price[i],total[i]);
      
      System.out.println("----------------------------------------");
      System.out.printf("$%37.2f\n", sum);//how do you get the dollar sign right next to sum
    }
}    
