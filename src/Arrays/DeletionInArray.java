package Arrays;

import java.util.Scanner;

public class DeletionInArray {
    public static void main(String[] args) {
    int[] arr=new int[10];

    System.out.println("Enter no of elements which you want to insert initially : ");
    Scanner sc=new Scanner(System.in);
    int noOfElements= sc.nextInt();
    System.out.println("Please enter "+noOfElements+" elements : ");
    for(int i=0;i<noOfElements;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter element which you want to delete : ");
    int element= sc.nextInt();
    if(noOfElements==0){
        System.out.println("array is underflow");
        return;
    }
    int position=0;
    for(int i=0;i<noOfElements;i++){
        if(element==arr[i]){
            position=i;
        }
        }
    for(int i=position;i<noOfElements;i++){
        arr[i]=arr[i+1];
    }
    noOfElements--;
    System.out.println("Elements after deletion : ");
    for(int i=0;i<noOfElements;i++){
        System.out.println(arr[i]);
    }
}
}
