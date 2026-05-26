import java.util.Scanner;

public class PraticeLoopsQuestion {

    static void  main(String args[]) {


        //Print counting from 1 to n
            /*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of integers up to you want print: ");
        int n=sc.nextInt();

             */

        /*
       int i = 1;
        while (i<=n)
            {
                System.out.println(i);
                   i++;
            }
        */

        //print counting from nto 1

        /*
        int i=n;
        while(i>=1)
            {
                System.out.println(i);
                i--;
            }
        */

        //print the multiples of n

        /*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n for the multiplication operator:");
        int n=sc.nextInt();

        for (int i=1;i<=10;i++)
        {
            System.out.println("The multiplication of "+ n + "*" + i + " is " + (n*i)); ;
        }

         */


        //Printing my names 100 times

        /*
        for(int j=0;j<=100;j++)
        {
            System.out.println("My  name is Sagar Thapa");
        }

        */


        //print all prime numbers between 1 to 100


        /*

        for(int i = 1; i<=100 ; i++)
        {
            int n =0 ;
            for(int j = 1; j<=100; j++) {
                if (i % j == 0) {

                    n = n + 1;
                }
            }
                if(n<3)
                {
                    System.out.println(i);
                }
            }



         */


        //print all the even number from 1 to 100
    /*
        System.out.println("The even numbers are :");
        for(int i = 0; i <= 100; i++)
        {
            if(i % 2 == 0)
            {

                System.out.println(i);
            }

        }

     */


        //Print the sum of all the numbers feom 1 to n

        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n = sc.nextInt();


        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = 0;

            for (int j = 1; j <= i; j++) {
                sum = sum + j;
            }
        }
        System.out.print("The sum of 1 to " + n + " is " + sum );

            */


        //print all the integers in range from 50 to 100 that are perfectly divisible by 7


        for(int i = 50; i<=100 ; i++)
        {
            int n = 7;
            if(i % n == 0)
            {
                System.out.println(i);
            }

        }



    }
    }






