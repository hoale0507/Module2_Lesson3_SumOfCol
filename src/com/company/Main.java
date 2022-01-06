package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double[][] array = {
            {1,2,3},
            {4,2,6},
            {7,2,3}
    };
    int col;
        do{
        System.out.println("Enter the column");
            Scanner input = new Scanner(System.in);
            col = input.nextInt();
        } while(col > array.length-1 || col < 0);

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][col];
        }
        System.out.printf("Sum of col %d is %f",col,sum);
    }
}
