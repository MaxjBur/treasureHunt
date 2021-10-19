package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        boolean x=true;
        int [] [] board=new int[10][10];
        for (int i = 0; i < 10;i++) {
            for (int j = 0; j <10; j++) {
                board[i][j]=0;


            }

        }

        int xcoord=random.nextInt(10)+1;
        int ycoord=random.nextInt(10)+1;
        board[xcoord][ycoord]=1;
        while (x){
            System.out.println(Arrays.deepToString(board));
            System.out.println("Guess the x cordinate");
            int xguess=scanner.nextInt();
            System.out.println("Guess the y cordinate");
            int yguess=scanner.nextInt();
            if(board[xguess][yguess]==1){
                System.out.println("Correct");
                x=false;
            }
            else{
                System.out.println("Incorrect, guess again");
            }


        }

    }
}
