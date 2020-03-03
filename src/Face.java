
/*
     Write the java program to add tow binary numbers
*/


import java.util.Scanner;

     public class Face {
     public static void main(String[] args) {

         // Scanner input = new Scanner( System.in );

       long binary1, binary2;
          int i = 0, remainder = 0;
          int[] sum = new int [20];

          Scanner input = new Scanner( System.in );

          System.out.println( "Enter the first binary number: " );
           binary1 = input.nextLong();
          System.out.println( "Enter the second binary number: " );
           binary2 = input.nextLong();
          //System.out.println( "Enter the third number: " );
          // work with while loop

          while (binary1 != 0 )

          {

            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder)% 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder)/2);

            binary1 = binary1 /10;
            binary2 = binary2 /10;
          }

      if(remainder != 0){
           sum[i++] = remainder;
      }
       --i;
      System.out.println( "Sum of two binary numbers: " );
        while (i >= 0){
             System.out.println( sum[i--] );
        }

      System.out.println( "\n" );

     }
}
















