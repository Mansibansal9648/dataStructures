package Arrays;

import java.util.Scanner;

public class LinearSearchInArray {

    public static void main(String[] args) {
        int[] arr=new int[1000];

        System.out.println("Enter no of elements which you want to store for linear search : ");
        Scanner sc=new Scanner(System.in);
        int noOfElements= sc.nextInt();
        System.out.println("Please enter "+noOfElements+" elements : ");
        for(int i=0;i<noOfElements;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Please enter element which you want to search : ");
        int searchElement=sc.nextInt();
        int res=linearSearch(arr,noOfElements,searchElement);
        if(res>=0){
            System.out.println("Element is found at " +res+1 +" position");
        }
        else{
            System.out.println("Element doesn't exist");
        }
    }

    public static int linearSearch(int[] arr, int noOfElements, int searchElement){
        for(int i=0;i<noOfElements;i++){
            if(arr[i]==searchElement){
                return i;
            }
        }
        return -1;
    }
}
