public class Patterns {
    public static void main(String[] args)
    {
//        //pattern1
//        int n=3;
//
//        for(int row=1;row<=n;row++)
//            {
//            for(int col=1;col<=5;col++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//            }
//
//
//
//        //pattern2
//        int o=5;
//
//        for(int row=1;row<=o;row++)
//        {
//            for(int col=1;col<=row;col++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        //pattern 3
//
//        int a =5;
//
//        for(int row=1;row<=a;row++)
//        {
//            //space
//            for(int col=1;col<=a-row;col++)
//            {
//                System.out.print(" ");
//            }
//            //for *
//            for(int col=1;col<=a;col++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        //pattern4
//
//        int M =5;
//
//        for(int row=1;row<=M;row++)
//            {
//            for(int col=1;col<=M-row+1;col++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//            }
//
//
//        //Pattern5
//
//        int s=5;
//        for(int row=1;row<=s;row++)
//
//        {
//            for(int spc=1;spc<=s-row;spc++)
//            {
//                System.out.print(" ");
//            }
//
//            for(int str=1;str<=2*row-1;str++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//                //pattern 6
//
//        int w =4;
//
//        for(int row=1;row<=w;row++)
//        {
//
//            for(int col = 1; col<=row-1; col++)
//            {
//                System.out.print(" ");
//            }
//            for(int col=1;col<=2*n-2*row+1;col++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//

//       //pattern7
//        int n=4;
//
//        for(int row=1;row<=n;row++)
//        {
//            for(int col=1;col<=6;col++)
//            {
//                if(row==1 || row ==n)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    if(col==1 || col ==6)
//                    {
//                        System.out.print("* ");
//                    }
//
//                    else
//                    {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//

        //pattern 8

//        int n = 5;
//        for(int row = 1; row <= n; row++)
//            {
//            for(int col = 1; col <= row; col++)
//            {
//                System.out.print(col+" ");
//            }
//            System.out.println();
//            }


        //pattern9

//
//        int n = 5;
//        int count = 1;
//
//        for(int row=1; row<=n; row++)
//        {
//            for(int col=1; col<=row; col++)
//                {
//                System.out.print(count+" ");
//                count++;
//                }
//            System.out.println();
//        }


//Pattern 10

        int n=5;
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                int a = n-col;
                int b= 'A';
                int ans = a+b;
                char ch = (char)ans;
                System.out.print(ch+ " ");

            }
            System.out.println();
        }


    }



}
