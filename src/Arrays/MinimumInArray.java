package Arrays;

import java.util.Scanner;

public class MinimumInArray {

    public static void main(String[] args) {

        int[] arr=new int[1000];

        System.out.println("Enter no of elements in which you want to find minimum : ");
        Scanner sc=new Scanner(System.in);
        int noOfElements= sc.nextInt();
        System.out.println("Please enter "+noOfElements+" elements : ");
        for(int i=0;i<noOfElements;i++){
            arr[i]=sc.nextInt();
        }
        int min= Integer.MAX_VALUE;
        for(int i=0;i<noOfElements;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The minimum element in the array is : "+min);
    }
}
