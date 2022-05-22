package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] table = new int[10][10];

        for(int i = 0; i < table.length; i++)
            for(int j = 0; j < table.length; j++)
                table[i][j] = (i + 1) * (j + 1);

        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++)
                System.out.print(table[i][j] + "\t");
            System.out.println();
        }

        int[][] stairs = {
                {1},
                {2,3},
                {4,5,6},
                {7, 8, 9, 10}
        };

        for(int i = 0; i < stairs.length; i++){
            for(int j = 0; j < stairs[i].length; j++)
                System.out.print(stairs[i][j] + "\t");
            System.out.println();
        }
    }
}
