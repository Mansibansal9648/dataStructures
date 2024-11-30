package Arrays;

import java.util.Scanner;

public class InsertionInArray {
    public static void main(String[] args) {
        int[] arr=new int[10];

        System.out.println("Enter no of elements which you want to insert initially : ");
        Scanner sc=new Scanner(System.in);
        int noOfElements= sc.nextInt();
        System.out.println("Please enter "+noOfElements+" elements : ");
        for(int i=0;i<noOfElements;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element which you want to insert : ");
        int element= sc.nextInt();
        System.out.println("Enter position where you want to insert : ");
        int position=sc.nextInt();
            if(noOfElements==arr.length){
                System.out.println("array is overflow");
                return;
            }
        for(int i=noOfElements;i>=position;i--){
            arr[i+1]=arr[i];
        }
        arr[position]=element;
        noOfElements++;
        System.out.println("Elements after insertion : ");
        for(int i=0;i<noOfElements;i++){
            System.out.println(arr[i]);
        }
    }
}
