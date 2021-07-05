package com.company.array;
import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];
        int[] sum = new int[3];
        int[][] show = new int[3][3];

        for(int i = 0 ; i < x.length ; i++)
            x[i]=input.nextInt(); // decalaring members of x array
        for(int i = 0 ; i< y.length ; i ++)
            y[i] = input.nextInt(); // decelaru=ing members of y array

        for(int i = 0 ; i< sum.length ; i++)
            sum[i] = x[i]*y[i]; // putting multiplications on the z array

        for(int i = 0 ; i < x.length ; i++ ) {

            for (int j = 0; j < y.length; j++) {
                if(i==2)
                    show[j][i]=sum[j];
                else if (i == 1)
                    show[j][i] = y[j];
                else
                show[j][i] = x[j];


            }
          System.out.println();
        }
        for(int i = 0 ; i < show.length ; i++ )
            System.out.println(show[i]);
    }

}

