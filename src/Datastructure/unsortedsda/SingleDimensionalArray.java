package Datastructure.unsortedsda;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDimensionalArray {

    public static void main(String[] args) {
        int[] singleDimensionalArray = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <= singleDimensionalArray.length; i++)
           singleDimensionalArray[i] = sc.nextInt();
        System.out.println("input of singleDimensionalArray " + Arrays.toString(singleDimensionalArray));
        for(int i = 0; i <= singleDimensionalArray.length; i++)
            System.out.println("output of singleDimensionalArray "+ Arrays.toString(singleDimensionalArray));
    }
}
