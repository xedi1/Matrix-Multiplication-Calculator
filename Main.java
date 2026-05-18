/*
Copyright 2026 Edi (Hadi Gholipour _ AxGooD)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0
*/


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private int[][] A;
    private int[][] B;
    private int[][] C;
    private int RowA, ColumnA;
    private int RowB, ColumnB;
    private Scanner Input;


    public Main(){
        this.Input = new Scanner(System.in);
    }

    public int[][] multiply(int[][] A, int[][] B){
        if (A== null || B == null || A.length == 0 || B.length==0){
            System.err.println("Matrix Invalid");
            return null;
        }

        int rowsA= A.length;
        int colsA= A[0].length;
        int rowsB= B.length;
        int colsB= B[0].length;

        if (colsA != rowsB){
            System.err.println("These Matrix Cant Multiply Beacus colA != rowB");
            return null;
        }

        C = new int[rowsA][colsB];

        for (int i=0; i<rowsA; i++){
            for (int j=0; j<colsB; j++){


                int sum= 0 ;
                for (int k=0; k<colsA; k++){

                    sum+= A[i][k] * B[k][j];
                }

                C[i][j]= sum;
            }
        }
        return C;
    }

    public void GETS(){
        ArrayList<Integer> Int = new ArrayList<>();

        System.out.println("====== Matrix Multiplication ===========");

        System.out.println("\n==Create Matrix A |  Enter True Value\n Enter Row:");
        RowA = Input.nextInt(); System.out.println("Enter Column:");
        ColumnA= Input.nextInt();
        A = new int[RowA][ColumnA];
        System.out.println("| Enter Elements:");
        for (int i=0; i<RowA; i++){
            for (int j=0; j<ColumnA; j++){
                System.out.printf("A[%d][%d]::", i+1, j+1);
                A[i][j]= Input.nextInt();
            }
        }

        System.out.println("\n ==Create Matrix B | Enter True Value\n Enter Row:");
        RowB = Input.nextInt(); System.out.println("Enter Column:");
        ColumnB = Input.nextInt();
        B = new int[RowB][ColumnB];
        System.out.println("Enter Elements:");
        for (int i=0; i<RowB; i++){
            for (int j=0; j<ColumnB; j++){
                System.out.printf("B[%d][%d]::", i+1, j+1);
                B[i][j] = Input.nextInt();
            }
        }

        C = multiply(A,B);
        if (C!=null){
            System.out.println("Result Mmultiply Matrix A * B:");
            printmatrix(C);
        }
    }

    private void printmatrix(int[][] M) {
        for (int[] row : M) {
            for (int num : row) {
                System.out.print(num + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main Start = new Main();
        Start.GETS();
    }
}
