import java.util.Scanner;

public class Arrays {

    static void main(String[] args) {
//        //declaration
//        int [] arr;
//
//        //allocation
//        arr = new int [5];
//
//        //initialization
//        int[] brr = {10,20,30,40,50};
//
//        int n = brr.length;
//
//        for(int i=0;i<=n-1;i++)
//        {
//            System.out.print(brr[i]+" ");
//        }


//
//        int [] arr = new int[10];
//
//        System.out.println("Enter 10 numbers in array:");
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < arr.length-1; i++)
//        {
//            arr[i] = sc.nextInt();
//        }
//
//        //print
//        for(int val : arr)
//        {
//            System.out.print("Your array contains the following elements: ");
//            System.out.println(val + " ");
//        }



        //find max and min value in array

//        int [] arr = { 3, -2 , 55 , 21 ,65};
//
//
//        int max = arr[0];
//
//        for (int i = 1; i <= arr.length-1; i++)
//        {
//            if (arr[i] > max)
//            {
//                max = arr[i];
//
//            }
//
//        }
//
//        System.out.println(max);
//
//
//        int min = arr[0];
//
//        for (int i = 1; i <= arr.length-1; i++)
//            {
//            if (arr[i] < min)
//            {
//                min = arr[i];
//            }
//            }
//        System.out.println(min);



        //2d array

        //declaration
        int[][] arr;

        //allocation
        arr = new int[3][4];

        //initialization

       int [] [] brr={
               {1,2},
               {3,4, 2 ,6 , 7},
               {5},
               {7,8 , 9 , 1 , 2 , 5}

       };

       int rowLength = brr.length;

       for(int rowIndex = 0; rowIndex <= rowLength-1; rowIndex++)
       {
           int colLength = brr[rowIndex].length;
           for (int colIndex = 0; colIndex <= colLength-1; colIndex++)
           {

            System.out.print(brr[rowIndex][colIndex] + " ");
           }
           System.out.println();
       }




        }

    }

