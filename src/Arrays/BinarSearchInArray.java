package Arrays;

import java.util.Scanner;

public class BinarSearchInArray {
    public static void main(String[] args) {

        int[] arr=new int[1000];

        System.out.println("Enter no of elements which you want to insert : ");
        Scanner sc=new Scanner(System.in);
        int noOfElements= sc.nextInt();
        System.out.println("Please enter "+noOfElements+" elements : ");
        for(int i=0;i<noOfElements;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Please enter element which you want to search : ");
        int searchElement=sc.nextInt();
        int res=binarySearch(arr,searchElement,noOfElements);
        if(res==searchElement){
            System.out.println("Element is found at " + res +" position");
        }
        else{
            System.out.println("Element doesn't exist");
        }
    }

    public static int binarySearch(int[] arr, int searchElement, int noOfElements){
        int low=0;
        int high=noOfElements-1;
        int mid=(low+high)/2;
        while(arr[mid]!=searchElement && low<=high) {
            if (searchElement < mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;

        }
        if (arr[mid] == searchElement) {
            return mid;
        } else {
            return -1;
        }
    }
}
