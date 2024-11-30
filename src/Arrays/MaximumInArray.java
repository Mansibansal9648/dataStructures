package Arrays;

import java.util.Scanner;

public class MaximumInArray {

    public static void main(String[] args) {

        int[] arr = new int[1000];

        System.out.println("Enter no of elements in which you want to find maximum : ");
        Scanner sc = new Scanner(System.in);
        int noOfElements = sc.nextInt();
        System.out.println("Please enter " + noOfElements + " elements : ");
        for (int i = 0; i < noOfElements; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < noOfElements; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element in the array is : " + max);
    }
}

