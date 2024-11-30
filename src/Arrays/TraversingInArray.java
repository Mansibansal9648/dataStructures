package Arrays;

import java.util.Scanner;

public class TraversingInArray {

    public static void main(String[] args) {
        int[] arr=new int[1000];

        System.out.println("Enter no of elements which you want to traverse : ");
        Scanner sc=new Scanner(System.in);
        int noOfElements= sc.nextInt();
        System.out.println("Please enter "+noOfElements+" elements : ");
        for(int i=0;i<noOfElements;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Traversing of elements ");
        for(int i=0;i<noOfElements;i++){
            System.out.println(arr[i]);
        }
    }
}
